package fun.kmoon.exception;

/**
 * 密码错误异常
 *
 * @author kmoon
 */
public class PasswordErrorException extends BaseException{

    public PasswordErrorException(){}

    public PasswordErrorException(String msg){
        super(msg);
    }
}
