public enum OperatorType {

    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String changeType;

    OperatorType(String changeType) {
        this.changeType = changeType;
    }

    public String getChangeType() {
        return changeType;
    }

    public static OperatorType changeOk(String changeType) {
        for (OperatorType a : values()) {
            if (a.changeType.equals(changeType)) {
                return a;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자 입니다.");
    }
}