package com.najie.exam.exception;

/**
 * @author admin
 */
public class ServiceException extends RuntimeException {
    private String code;
    private String message;

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        new ServiceException("1",message);
    }
    public ServiceException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ServiceException(String code, String message, Throwable cause) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
