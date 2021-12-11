package spring.impl.car;

import spring.interfaces.AudioSystem;
import spring.interfaces.Car;
import spring.interfaces.NavigationSystem;

public class CarAudi implements Car {
    private AudioSystem audioSystem;
    private NavigationSystem navigationSystem;

    public CarAudi (AudioSystem aAudioSystem,NavigationSystem aNavigationSystem){
        this.audioSystem = aAudioSystem;
        this.navigationSystem = aNavigationSystem;
    }

    public CarAudi(){

    }

    @Override
    public void move() {
        System.out.println("Audi move");
    }

    public AudioSystem getAudioSystem(){
        return audioSystem;
    }

    public void setAudioSystem(AudioSystem aAudioSystem){
        this.audioSystem = aAudioSystem;
    }

    public NavigationSystem getNavigationSystem(){
        return navigationSystem;
    }

    public void setNavigationSystem(NavigationSystem aNavigationSystem){
        this.navigationSystem = aNavigationSystem;
    }
}
