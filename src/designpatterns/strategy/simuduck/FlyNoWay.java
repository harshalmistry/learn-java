package designpatterns.strategy.simuduck;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("Duck can't fly");
    }
}
