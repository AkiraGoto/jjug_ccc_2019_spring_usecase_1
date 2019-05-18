package jjug_ccc_2019_spring.usecase_1;

import com.github.javaparser.ParseProblemException;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyzer {

    public List<MatchedSwitchStmt> exec(String rootDir) throws IOException {
        List<MatchedSwitchStmt> result = new ArrayList<>();

        List<Path> javaFilePaths = getJavaFilePaths(rootDir);
        System.out.println(javaFilePaths.size());
        for (Path p : javaFilePaths) {
            try {
                SwitchStmtVisitor ssVisitor = new SwitchStmtVisitor();
                CompilationUnit unit = StaticJavaParser.parse(p);
                ssVisitor.visitBreadthFirst(unit);
                List<Node> list = ssVisitor.getSwitchStmtList();
                for (Node n : list) {
                    SwitchExprPatternVisitor sepVisitor = new SwitchExprPatternVisitor();
                    sepVisitor.visitBreadthFirst(n);
                    if (sepVisitor.isMatch()) {
                        result.add(new MatchedSwitchStmt(p.toString(), n.getBegin().map(r -> r.line).orElse(-1), n.toString()));
                    }
                }
            } catch (ParseProblemException e) {
                System.out.println(p.toString());
                e.printStackTrace();
            }
        }
        return result;
    }

    private List<Path> getJavaFilePaths(String rootDir) {
        String extensionPattern = (".*\\.java$");
        List<Path> filePaths = new ArrayList<>();
        try (final Stream<Path> pathStream = Files.walk(Paths.get(rootDir))) {
            filePaths = pathStream
                    .filter(p -> p.toFile().isFile())
                    .filter(p -> p.toFile().getName().matches(extensionPattern))
                    .collect(Collectors.toList());
        } catch (final IOException e) {
            e.printStackTrace();
        }

        return filePaths;
    }
}
