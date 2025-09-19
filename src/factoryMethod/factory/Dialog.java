package factoryMethod.factory;

import factoryMethod.notification.INotification;

public abstract class Dialog {

    public void showMessage(){
        INotification notification= createNotification();
        notification.send();
    }

    public abstract INotification createNotification();

}
