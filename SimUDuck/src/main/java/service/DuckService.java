package service;

import models.*;

public class DuckService {
   public Duck callMallardDuck() {
       Duck mallardDuck = new MallardDuck();
       mallardDuck.display();
       mallardDuck.performFly();
       mallardDuck.performQuack();
       return mallardDuck;
   }

   public Duck callModelDuck() {
       Duck modelDuck = new ModelDuck();
       modelDuck.display();
       modelDuck.performFly();
       modelDuck.performQuack();
       return modelDuck;
   }

   public Duck callRubberDuck() {
       Duck rubberDuck = new RubberDuck();
       rubberDuck.display();
       rubberDuck.performFly();
       rubberDuck.performQuack();
       return rubberDuck;
   }

   public Duck callRedHeadDuck() {
       Duck redHeadDuck = new RedHeadDuck();
       redHeadDuck.display();
       redHeadDuck.performFly();
       redHeadDuck.performQuack();
       return redHeadDuck;
   }

   public Duck callCyberDuck() {
       Duck cyberDuck = new CyberDuck();
       cyberDuck.display();
       cyberDuck.performFly();
       cyberDuck.performQuack();
       cyberDuck.performAttack();
       return cyberDuck;
   }
}
