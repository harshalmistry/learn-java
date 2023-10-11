package designpatterns.decorator.simucoffeebuzz.condiments;

import designpatterns.decorator.simucoffeebuzz.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
