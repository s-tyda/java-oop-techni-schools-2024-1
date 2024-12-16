package org.example.oop.homework.notifications;

public class NotificationService {
    private NotificationProvider[] providers;

    public NotificationService() {
        EmailProvider emailProvider = new EmailProvider();
        SMSProvider smsProvider = new SMSProvider();
        this.providers = new NotificationProvider[]{emailProvider, smsProvider};
    }

    public void notify(String message, User user){
       for (NotificationProvider notificationProvider: providers){
           notificationProvider.send(message, user);
       }
    }
}
