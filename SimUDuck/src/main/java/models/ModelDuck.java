package models;

import config.FlyNoWay;
import config.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I'm a Model Duck");
    }
}
