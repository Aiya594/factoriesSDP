package factories;

import text.IText;
import text.WATextMessage;
import voice.IVoice;
import voice.WAVoiceMessage;

public class WAFactory implements IMessengerFactory{
    @Override
    public IText createTextMessage() {
        return new WATextMessage();
    }

    @Override
    public IVoice createVoiceMessage() {
        return new WAVoiceMessage();
    }
}
