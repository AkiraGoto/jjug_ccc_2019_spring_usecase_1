package jjug_ccc_2019_spring.usecase_1;

public class MatchedSwitchStmt {

    private String filePath;
    private int lineNumber;
    private String source;

    public MatchedSwitchStmt(String filePath, int lineNumber, String source) {
        this.filePath = filePath;
        this.lineNumber = lineNumber;
        this.source = source;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getSource() {
        return source;
    }
}
