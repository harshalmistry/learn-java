package designpatterns.strategy.simuduck;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck is flying with rocket");
    }
}
