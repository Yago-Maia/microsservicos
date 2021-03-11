package com.yagomaia.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3051950283031558402L;

    public ResourceNotFoundException(String exception) {
        super(exception);
    }
}
