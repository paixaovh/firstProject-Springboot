package com.example.firstProject.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 2544593355074654769L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id" + id);
    }


}
