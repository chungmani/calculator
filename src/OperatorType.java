public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("-");

    private String operator;

    OperatorType(String s) {
        this.operator = s;
    }
}
