package com.example.firstProject.resources.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 5556907914984557981L;

    public DatabaseException(String msg){
        super(msg);
    }
}
