package org.hal.fortune.controller;

import org.hal.fortune.exception.NoFortuneException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FortuneControllerAdvice {

    @ResponseBody
    @ExceptionHandler(NoFortuneException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    String noFortuneHandler(NoFortuneException exception) {
        return exception.getMessage();
    }
}
