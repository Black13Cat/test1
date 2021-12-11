package spring.impl.navigation;

import spring.interfaces.NavigationSystem;

public class NavigationNavitel implements NavigationSystem {
    @Override
    public boolean createRoute() {
        System.out.println("Навигатор Navitel rout created");
        return true;
    }
}
