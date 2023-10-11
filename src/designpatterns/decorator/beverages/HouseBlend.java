package designpatterns.decorator.beverages;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
