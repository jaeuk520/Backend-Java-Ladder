package ladder;

public enum ExceptionMessage {

    INVALID_POSITION("유효하지 않은 위치입니다."),
    LINE_DUPLICATION("이미 해당 위치에는 라인이 존재합니다.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
