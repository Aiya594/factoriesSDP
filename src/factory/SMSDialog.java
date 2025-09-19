package factory;

import notification.INotification;
import notification.SMSNotification;

public class SMSDialog extends Dialog {
    @Override
    public INotification createNotification() {
        return new SMSNotification();
    }
}
