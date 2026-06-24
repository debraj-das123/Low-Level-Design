package SolidPrinciple;
interface Notification {

    void sendNotification();
}

class EmailNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Email Notification Sent");
    }
}

class SmsNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification Sent");
    }
}

class PushNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("Push Notification Sent");
    }
}

class WhatsAppNotification implements Notification {

    @Override
    public void sendNotification() {
        System.out.println("WhatsApp Notification Sent");
    }
}

class NotificationService {

    public void send(Notification notification) {
        notification.sendNotification();
    }
}

public class OCP {

    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();

        Notification email = new EmailNotification();

        Notification sms = new SmsNotification();

        Notification push = new PushNotification();

        Notification whatsapp = new WhatsAppNotification();

        notificationService.send(email);

        notificationService.send(sms);

        notificationService.send(push);

        notificationService.send(whatsapp);
    }
}
