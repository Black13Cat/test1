package spring;

import spring.impl.audio.AudioAlpine;
import spring.impl.audio.AudioSony;
import spring.impl.car.CarAudi;
import spring.impl.car.CarBMW;
import spring.impl.navigation.NavigationNavitel;
import spring.impl.navigation.NavigationPioneer;
import spring.interfaces.Car;

public class Main {
    public static void main(String[] args) {

        CarAudi audi = new CarAudi(new AudioSony(), new NavigationNavitel());

        Car bmw = new CarBMW();
        Car bmw2 = new CarBMW(new AudioSony(), new NavigationPioneer());

        bmw.setAudioSystem(new AudioAlpine());
        bmw.setNavigationSystem(new NavigationNavitel());

        System.out.println("audi-----------------");
        audi.getAudioSystem().playRadio();
        audi.getNavigationSystem().createRoute();

        System.out.println("bmv------------------");
        bmw.getAudioSystem().playRadio();
        bmw.getNavigationSystem().createRoute();


        System.out.println("bmv2------------------");
        bmw2.getAudioSystem().playRadio();
        bmw2.getNavigationSystem().createRoute();
    }
}
