package designpatterns.strategy.simuduck;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck is flying with wings");
    }
}
