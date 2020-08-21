package models;

import config.FlyWithWings;
import config.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        // Because we extend from duck, we can use the interfaces.
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a RedHead Duck");
    }
}
