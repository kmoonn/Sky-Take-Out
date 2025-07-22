package fun.kmoon.handler;

import fun.kmoon.exception.BaseException;
import fun.kmoon.result.Result;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
@Hidden
public class GlobalExceptionHandler {

    @ExceptionHandler
    public Result<String> exceptionHandler(BaseException ex){
        return Result.error(ex.getMessage());
    }
}
