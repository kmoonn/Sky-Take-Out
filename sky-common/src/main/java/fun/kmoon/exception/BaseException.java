package fun.kmoon.exception;

/**
 * 自定义异常基类
 *
 * @author kmoon
 */
public class BaseException extends RuntimeException{


    public BaseException() {
    }

    /**
     * 构造方法
     *
     * @param message 异常信息
     */
    public BaseException(String message) {
        super(message);
    }
}
