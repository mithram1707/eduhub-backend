package com.eduhub.eduhub_backend.exceptions;
import java.time.LocalDateTime;
public class ErrorResponses {
    private LocalDateTime timeStamp;
    private int status;
    private String error;
    private String message;
    private String path;
    public ErrorResponses(LocalDateTime , timeStamp, int status, String error, String message, String path){
        this.timeStamp = timeStamp;
        this.status = status;
        this.error = error;
        this.message= message;
        this.path=path;

    }
}
