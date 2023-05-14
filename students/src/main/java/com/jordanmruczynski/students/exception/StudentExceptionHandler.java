package com.jordanmruczynski.students.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ErrorInfo> handleException(StudentException e) {
        return ResponseEntity.status(e.getStudentError().getHttpStatus()).body(new ErrorInfo(e.getStudentError().getMessage()));
    }
}
