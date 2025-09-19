package app;

import factories.IMessengerFactory;
import text.IText;
import voice.IVoice;

public class Application {
    private IText text;
    private IVoice voice;

    public Application(IMessengerFactory factory) {
        text=factory.createTextMessage();
        voice=factory.createVoiceMessage();
    }

    public void message(){
        text.sendTextMessage("Some text message here!!!!");
        voice.sendVoiceMessage();
    }
}
