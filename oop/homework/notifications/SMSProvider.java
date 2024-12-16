package org.example.oop.homework.notifications;

public class SMSProvider implements NotificationProvider{
    @Override
    public void send(String message, User user) {
        if (user.isSMSNotificationsOn()){
            System.out.println("Wysyłam SMS o tresci: " + message
                    + " na numer " + user.getPhoneNumber());
        }
    }
}
