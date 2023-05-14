package com.jordanmruczynski.students.exception;

import org.springframework.http.HttpStatus;

public enum StudentError {

    STUDENT_NOT_FOUND("Student does not exists", HttpStatus.NOT_FOUND),
    STUDENT_EMAIL_ALREADY_EXISTS("Student email already exists", HttpStatus.CONFLICT),
    STUDENT_IS_NOT_ACTIVE("Student is not active", HttpStatus.BAD_REQUEST);

    private String message;
    private HttpStatus httpStatus;

    StudentError(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
