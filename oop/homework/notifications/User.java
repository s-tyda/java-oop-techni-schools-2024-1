package org.example.oop.homework.notifications;

public class User {
    private String login;
    private String email;
    private String phoneNumber;
    private boolean isEmailNotificationsOn;
    private boolean isSMSNotificationsOn;

    public User(String login, String email, String phoneNumber, boolean isEmailNotificationsOn, boolean isSMSNotificationsOn) {
        this.login = login;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isEmailNotificationsOn = isEmailNotificationsOn;
        this.isSMSNotificationsOn = isSMSNotificationsOn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEmailNotificationsOn() {
        return isEmailNotificationsOn;
    }

    public boolean isSMSNotificationsOn() {
        return isSMSNotificationsOn;
    }
}
