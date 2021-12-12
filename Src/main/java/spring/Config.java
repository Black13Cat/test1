package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.impl.audio.AudioSony;
import spring.impl.car.CarAudi;
import spring.impl.navigation.NavigationNavitel;
import spring.impl.navigation.NavigationPioneer;
import spring.interfaces.AudioSystem;
import spring.interfaces.NavigationSystem;

@Configuration
public class Config {
    @Bean
    public AudioSystem sonyAudio() {
        return new AudioSony();
    }
    @Bean
    public NavigationSystem navitelNavigation(){
        return new NavigationNavitel();
    }

    @Bean
    public CarAudi car1(AudioSystem audioSystem, NavigationSystem navigationSystem){
        return new CarAudi(audioSystem, navigationSystem);
    }
}
