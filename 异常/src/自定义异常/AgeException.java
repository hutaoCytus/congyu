package 自定义异常;
/*
* 自定义异常
* 1.继承Exception或它的子类
* 2.添加构造方法*/
public class AgeException extends RuntimeException{
    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }

    public AgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeException(Throwable cause) {
        super(cause);
    }

    public AgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void main(String[] args) {

    }
}
