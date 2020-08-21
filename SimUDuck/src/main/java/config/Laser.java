package config;

import resource.WeaponBehavior;

public class Laser implements WeaponBehavior {
    public void attack() {
        System.out.println("I'ma firing my laser! POW, POW");
    }
}
