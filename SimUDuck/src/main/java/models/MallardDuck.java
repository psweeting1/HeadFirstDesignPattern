package models;

import config.FlyWithWings;
import config.Quack;
import resource.FlyBehavior;
import resource.QuackBehavior;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior {
    public MallardDuck() {
        // Because we extend from duck, we can use the interfaces.
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void quack() {
        System.out.println("Quack, quack!");
    }
}
