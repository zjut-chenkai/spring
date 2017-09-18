package org.com.zjut.ie.ck.exception;

import org.com.zjut.ie.ck.util.status.HttpStatus;

public class RestException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public HttpStatus status = HttpStatus.TEST_EXCEPTION;

    public String msg = null;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RestException() {
    }

    public RestException(String message, Exception cause) {
        super(message, cause);
    }

    public RestException(HttpStatus status) {
        this.status = status;
    }

    public RestException(String message) {
        super(message);
    }

    public RestException(HttpStatus status, String message) {
        super(message);
        this.msg = message;
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
