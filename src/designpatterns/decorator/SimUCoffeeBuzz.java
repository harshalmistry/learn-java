package designpatterns.decorator;

import designpatterns.decorator.beverages.DarkRoast;
import designpatterns.decorator.beverages.Espresso;
import designpatterns.decorator.beverages.HouseBlend;
import designpatterns.decorator.condiments.Mocha;
import designpatterns.decorator.condiments.Soy;
import designpatterns.decorator.condiments.Whip;

public class SimUCoffeeBuzz {
    public static void main(String[] args) {

        System.out.println("**** CoffeeBuzz ****");
        System.out.println("Coffees");
        System.out.println("- HouseBlend - €0.89");
        System.out.println("- DarkRoast - €0.99");
        System.out.println("- Decaf - €1.05");
        System.out.println("- Espresso - €1.99");
        System.out.println("Condiments");
        System.out.println("- SteamedMilk - €0.10");
        System.out.println("- Mocha - €0.20");
        System.out.println("- Soy - €0.15");
        System.out.println("- Whip - €0.10");
        System.out.println("******************");

        System.out.println("Customer: I would like Espresso, please");
        Espresso espresso = new Espresso();
        System.out.println("Preparing " + espresso.getDescription() + ", that costs: €" + espresso.cost());

        System.out.println("******************");
        System.out.println("Customer: I would like DarkRoast with double Mocha and Whip, please");
        DarkRoast darkRoast = new DarkRoast();
        Mocha mocha = new Mocha(darkRoast);
        Mocha doubleMocha = new Mocha(mocha);
        Whip whip = new Whip(doubleMocha);
        System.out.println("Preparing " + whip.getDescription() + ", that costs €" + whip.cost());

        System.out.println("******************");
        System.out.println("Customer: I would like HouseBlend with Soy, Mocha and Whip, please");
        HouseBlend houseBlend = new HouseBlend();
        Soy soy = new Soy(houseBlend);
        Mocha mocha1 = new Mocha(soy);
        Whip whip1 = new Whip(mocha1);
        System.out.println("Preparing " + whip1.getDescription() + ", that costs €" + whip1.cost());
    }
}
