package fun.kmoon.exception;

/**
 * 登录失败异常
 *
 * @author kmoon
 */
public class LoginFailedException extends BaseException{

    public LoginFailedException() {
    }

    public LoginFailedException(String message) {
        super(message);
    }
}
