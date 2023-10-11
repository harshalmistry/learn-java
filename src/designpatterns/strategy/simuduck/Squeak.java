package designpatterns.strategy.simuduck;

public class Squeak implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("Duck is making sound - Squeak");
    }
}
