package models;

import config.FlyNoWay;
import config.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        // Because we extend from duck, we can use the interfaces.
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
