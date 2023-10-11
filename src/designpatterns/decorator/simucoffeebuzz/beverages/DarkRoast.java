package designpatterns.decorator.simucoffeebuzz.beverages;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
