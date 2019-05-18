package jjug_ccc_2019_spring.usecase_1;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.stmt.*;
import com.github.javaparser.ast.visitor.TreeVisitor;

public class SwitchExprPatternVisitor extends TreeVisitor {

    private boolean match = true;
    private String varName = null;

    @Override
    public void process(Node node) {
        if (node instanceof SwitchEntry && match) {
            match = isMatchSwitchEntry((SwitchEntry) node);
        }
    }

    private boolean isMatchSwitchEntry(SwitchEntry se) {
        NodeList<Statement> stmtList = se.getStatements();
        if (stmtList.size() == 0) {
            return true;
        } else if (stmtList.size() == 1) {
            Statement stmt = stmtList.get(0);
            return stmt instanceof ReturnStmt || stmt instanceof BreakStmt;
        } else if (stmtList.size() == 2) {
            Statement stmt0 = stmtList.get(0);
            Statement stmt1 = stmtList.get(1);

            if (!stmt1.isReturnStmt() && !stmt1.isBreakStmt()) {
                return false;
            }

            try {
                AssignExpr expr = stmt0.asExpressionStmt().getExpression().asAssignExpr();
                String left = expr.getTarget().asNameExpr().getName().getIdentifier();
                if (varName == null) {
                    varName = left;
                }
                return varName.equals(left);
            } catch (IllegalStateException e) {
                return false;
            }
        }
        return false;
    }

    public boolean isMatch() {
        return match && varName != null;
    }
}
