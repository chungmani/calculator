public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String operator;

    OperatorType(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    // 입력값과 enum값을 찾아주는 메서드
    public static OperatorType findValue(String cal) {
        for (OperatorType value : OperatorType.values()) {
            if (value.getOperator().equals(cal)) {
                return value;
            }
        }
        return null;
    }
}
