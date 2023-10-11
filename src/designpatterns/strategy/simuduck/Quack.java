package designpatterns.strategy.simuduck;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck is making sound - Quack");
    }
}
