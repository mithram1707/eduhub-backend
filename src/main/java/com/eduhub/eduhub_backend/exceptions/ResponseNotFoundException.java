package com.eduhub.eduhub_backend.exceptions;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

public class ResourceNotFoundException extends RuntimeException{
    public  ResourceNotFoundException(String resource, string field, String error){
        super(String.format("%s not found with %s:%s", resource, field, error));

    }
}
