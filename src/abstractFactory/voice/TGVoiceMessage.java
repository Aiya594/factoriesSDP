package voice;

public class TGVoiceMessage implements IVoice{
    @Override
    public void sendVoiceMessage() {
        System.out.println("Your voice message was sent via Telegram");
    }
}
