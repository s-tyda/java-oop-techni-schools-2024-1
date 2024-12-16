package org.example.oop.homework.notifications;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        User user = new User("superlogin", "email@poczta.pl",
                "123456789", false, false);
        notificationService.notify("siema", user);
    }
}
