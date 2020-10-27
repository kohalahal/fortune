package org.hal.fortune.exception;

public class NoFortuneException extends RuntimeException {
    public NoFortuneException() {
        super("운세 디비 조차 없네요");
    }
}
