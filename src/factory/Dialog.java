package factory;

import notification.INotification;

public abstract class Dialog {

    public void showMessage(){
        INotification notification= createNotification();
        notification.send();
    }

    public abstract INotification createNotification();

}
