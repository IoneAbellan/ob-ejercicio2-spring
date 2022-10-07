package com.ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
        //System.out.println("Ejecutando UserService, constructor");
    }

}
