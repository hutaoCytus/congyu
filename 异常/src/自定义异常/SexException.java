package 自定义异常;

public class SexException extends RuntimeException{
    public SexException() {
    }

    public SexException(String message) {
        super(message);
    }

    public SexException(String message, Throwable cause) {
        super(message, cause);
    }

    public SexException(Throwable cause) {
        super(cause);
    }

    public SexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void main(String[] args) {

    }
}
