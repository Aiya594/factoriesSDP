package text;

public class WATextMessage implements IText{
    @Override
    public void sendTextMessage(String text) {
        System.out.println("Message: " + text+"  was sent via WhatApp");
    }
}
