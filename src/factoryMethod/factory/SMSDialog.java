package factoryMethod.factory;

import factoryMethod.notification.INotification;
import factoryMethod.notification.SMSNotification;

public class SMSDialog extends Dialog {
    @Override
    public INotification createNotification() {
        return new SMSNotification();
    }
}
