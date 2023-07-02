package com.example.FileTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.ApplicationEvent;

@Data
public class DoorBellEvent extends ApplicationEvent {
    private String guestName;

    public DoorBellEvent(Object source, String guestName) {
        super(source);
        this.guestName = guestName;
    }
}
