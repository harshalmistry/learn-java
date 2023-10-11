package designpatterns.decorator.beverages;

public abstract class Beverage {
    protected String description;

    public abstract double cost();

    public String getDescription(){
        return this.description;
    }
}
