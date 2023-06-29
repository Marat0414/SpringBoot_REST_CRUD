package com.maratmuradaliev.spring.springboot_crud.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TutorialGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<TutorialIncorrectData> handleException(NoSuchTutorialException exception) {
        TutorialIncorrectData data = new TutorialIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<TutorialIncorrectData> handleException(Exception exception) {
        TutorialIncorrectData data = new TutorialIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
