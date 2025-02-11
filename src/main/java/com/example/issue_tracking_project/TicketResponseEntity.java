package com.example.issue_tracking_project;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class TicketResponseEntity<T> {

    private boolean status;
    private String message;
    private T data;
    private Timestamp timestampe;


    public TicketResponseEntity(boolean status, String message,T data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestampe = new Timestamp(System.currentTimeMillis());
    }


}
