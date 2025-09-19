package factories;

import text.IText;
import voice.IVoice;

public interface IMessengerFactory {
     IText createTextMessage();
     IVoice createVoiceMessage();
}
