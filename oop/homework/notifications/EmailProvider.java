package org.example.oop.homework.notifications;

public class EmailProvider implements NotificationProvider{
    @Override
    public void send(String message, User user) {
        if (user.isEmailNotificationsOn()){
            System.out.println("Wysyłam maila o tresci: " + message
                    + " na adres " + user.getEmail());
        }
    }
}
