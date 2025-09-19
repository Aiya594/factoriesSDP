package factories;

import text.IText;
import text.TGTextMessage;
import voice.IVoice;
import voice.TGVoiceMessage;

public class TGFactory implements IMessengerFactory{
    @Override
    public IText createTextMessage() {
        return new TGTextMessage();
    }

    @Override
    public IVoice createVoiceMessage() {
        return new TGVoiceMessage();
    }
}
