package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impl.audio.AudioSony;
import spring.impl.car.CarAudi;
import spring.impl.car.CarBMW;
import spring.interfaces.Car;

public class Main1 {

    public static void main(String[] args) {
/*
// XML конфигурация
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml"); // поскольку это Class path ищет в директории приложения
        CarAudi audi1 = context.getBean("audi1", CarAudi.class);

        Car audi2 = context.getBean("audi2", CarAudi.class);

        Car bmw = context.getBean("bmw1", CarBMW.class);
        Car bmw1 = context.getBean("bmw1", CarBMW.class);

        audi1.move();
        audi2.move();

        audi1.setAudioSystem(context.getBean("sony", AudioSony.class));
        audi1.getAudioSystem().playCD();

        audi2.getAudioSystem().playCD();

        System.out.println("bmv-----------------------------");
        bmw.getAudioSystem().playCD();

        System.out.println("bmv1-----------------------------");
        bmw1.getAudioSystem().playCD();
        bmw1.getNavigationSystem().createRoute();
*/

        ApplicationContext contextJava = new AnnotationConfigApplicationContext(Config.class);

        Car audi = contextJava.getBean(CarAudi.class);
        audi.move();

        audi.getAudioSystem().playRadio();
        audi.getNavigationSystem().createRoute();
    }
}
