package spring.impl.navigation;

import spring.interfaces.NavigationSystem;

public class NavigationPioneer implements NavigationSystem {
    @Override
    public boolean createRoute() {
        System.out.println("Навигатор Pioneer rout created");
        return true;
    }
}
