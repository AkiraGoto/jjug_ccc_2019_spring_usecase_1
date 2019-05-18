package jjug_ccc_2019_spring.usecase_1;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.stmt.SwitchStmt;
import com.github.javaparser.ast.visitor.TreeVisitor;

import java.util.*;

public class SwitchStmtVisitor extends TreeVisitor {

    private List<Node> switchStmtList = new ArrayList<>();

    @Override
    public void process(Node node) {
        if(node instanceof SwitchStmt){
            switchStmtList.add(node);
        }
    }

    public List<Node>  getSwitchStmtList(){
        return Collections.unmodifiableList(switchStmtList);
    }
}
