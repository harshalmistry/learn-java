package designpatterns.strategy.simuduck;

public class SimUDuckMain {

    public static void main(String[] args) {

        System.out.println("********* SimUDuck ***********");

        // MallardDuck example
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("");
        // ModelDuck example
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        /*
            with strategy pattern applied here it is possible
            to change run time behavior of duck.
         */
        System.out.println("I am changing my fly behavior at run time");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println("******************************");
    }
}
