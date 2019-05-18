package jjug_ccc_2019_spring.usecase_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();
        try {
            List<MatchedSwitchStmt> list = analyzer.exec("/path/to/target_root_dir");
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(".\\result\\result.md"))) {

                writer.write("## Num of result : " + list.size() + "\n\n");
                for (MatchedSwitchStmt s : list) {
                    writer.write("## " + s.getFilePath() + "\n");
                    writer.write("### Line: " + s.getLineNumber() + "\n");
                    writer.write("```\n" + s.getSource() + "\n```\n\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
