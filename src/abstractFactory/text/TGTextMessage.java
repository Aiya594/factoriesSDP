package text;

public class TGTextMessage implements IText{
    @Override
    public void sendTextMessage(String text) {
        System.out.println("Message: " + text+"  was sent via Telegram");
    }
}
