package com.maratmuradaliev.spring.springboot_crud.exception_handling;

public class NoSuchTutorialException extends RuntimeException{
    public NoSuchTutorialException(String message) {
        super(message);
    }
}
