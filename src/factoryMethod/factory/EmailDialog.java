package factoryMethod.factory;

import factoryMethod.notification.EmailNotification;
import factoryMethod.notification.INotification;

public class EmailDialog extends Dialog {
    @Override
    public INotification createNotification() {
        return new EmailNotification();
    }
}
