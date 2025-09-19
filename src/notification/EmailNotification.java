package notification;

public class EmailNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Message: ");
        getMessage();
        System.out.print("sent to: ");
        getRecipient();
    }

    @Override
    public void getMessage() {
        System.out.println("Hello, my dear friend \n I sent you this message using EmailNotification class");
    }

    @Override
    public void getRecipient() {
        System.out.println("me dear friend");
    }
}
