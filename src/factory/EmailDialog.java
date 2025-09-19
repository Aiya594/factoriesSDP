package factory;

import notification.EmailNotification;
import notification.INotification;

public class EmailDialog extends Dialog {
    @Override
    public INotification createNotification() {
        return new EmailNotification();
    }
}
