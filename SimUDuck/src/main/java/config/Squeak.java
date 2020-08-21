package config;

import resource.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak, squeak");
    }
}
