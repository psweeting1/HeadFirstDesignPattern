package models;

import resource.FlyBehavior;
import resource.QuackBehavior;
import resource.WeaponBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    WeaponBehavior weaponBehavior;

    public void setQuackBehavior (QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void setFlyBehavior (FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setWeaponBehavior (WeaponBehavior wb) { weaponBehavior = wb;}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performAttack() { weaponBehavior.attack();}

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
