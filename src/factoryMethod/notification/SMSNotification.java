package factoryMethod.notification;

public class SMSNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Message: ");
        getMessage();
        System.out.print("sent to: ");
        getRecipient();
    }

    @Override
    public void getMessage() {
        System.out.println("Hi, this is message from SMSNotification class!!!!");
    }

    @Override
    public void getRecipient() {
        System.out.println("bestie XD");
    }
}
