package spring.impl.audio;

import spring.interfaces.AudioSystem;

public class AudioSony implements AudioSystem {
    @Override
    public void playCD() {
        System.out.println("play CD Sony");
    }

    @Override
    public void playRadio() {
        System.out.println("play Radio Sony");
    }
}
