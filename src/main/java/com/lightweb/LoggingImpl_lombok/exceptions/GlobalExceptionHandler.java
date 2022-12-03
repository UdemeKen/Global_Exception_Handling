package com.lightweb.LoggingImpl_lombok.exceptions;

import com.lightweb.LoggingImpl_lombok.pojo.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundExceptions.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ApiResponse<String> handleNotFoundException(NotFoundExceptions ex){
        return new ApiResponse<>(ex.getMessage(), HttpStatus.NOT_FOUND.value(), null);
    }

    @ExceptionHandler(AlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    public ApiResponse<String> handleAlreadyExistException(AlreadyExistException ex){
        return new ApiResponse<>(ex.getMessage(), HttpStatus.CONFLICT.value(), null);
    }
}