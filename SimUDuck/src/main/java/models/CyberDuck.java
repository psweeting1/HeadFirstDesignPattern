package models;

import config.FlyWithWings;
import config.Laser;
import config.Quack;
import resource.FlyBehavior;
import resource.QuackBehavior;

public class CyberDuck extends Duck {

    public CyberDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        weaponBehavior = new Laser();
    }

    public void display() {
        System.out.println("I am Cyber Duck");
    }
}
