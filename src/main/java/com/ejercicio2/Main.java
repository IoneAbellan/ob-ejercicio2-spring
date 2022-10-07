package com.ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        NotificationService notification = (NotificationService) context.getBean("notificationService");
        System.out.println(notification.imprimirSaludo());
    }
}
