package voice;

public class WAVoiceMessage implements IVoice{
    @Override
    public void sendVoiceMessage() {
        System.out.println("Your voice message was sent via WhatsApp");
    }
}

