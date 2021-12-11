package spring.impl.car;

import spring.interfaces.AudioSystem;
import spring.interfaces.Car;
import spring.interfaces.NavigationSystem;

public class CarBMW implements Car {
    AudioSystem audioSystem;
    NavigationSystem navigationSystem;

    public CarBMW(AudioSystem aAudioSystem, NavigationSystem aNavigationSystem){
        this.audioSystem = aAudioSystem;
        this.navigationSystem = aNavigationSystem;
    }

    public CarBMW(){

    }

    @Override
    public void move() {
        System.out.println("move BMW");
    }

    @Override
    public AudioSystem getAudioSystem() {
        return audioSystem;
    }

    @Override
    public void setAudioSystem(AudioSystem aAudioSystem) {
        this.audioSystem = aAudioSystem;
    }

    @Override
    public NavigationSystem getNavigationSystem() {
        return navigationSystem;
    }

    @Override
    public void setNavigationSystem(NavigationSystem aNavigationSystem) {
        this.navigationSystem = aNavigationSystem;
    }
}
