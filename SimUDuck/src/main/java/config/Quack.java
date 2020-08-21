package config;

import resource.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack, quack!");
    }
}
