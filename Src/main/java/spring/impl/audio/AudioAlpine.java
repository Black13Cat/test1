package spring.impl.audio;

import spring.interfaces.AudioSystem;

public class AudioAlpine implements AudioSystem {

    @Override
    public void playCD() {
        System.out.println("play CD Alpine");
    }

    @Override
    public void playRadio() {
        System.out.println("play Radio Alpine");
    }
}
