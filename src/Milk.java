/**
 * Created by Moises on 20/03/2016.
 */
public class Milk extends CondimentDecorator{

    Beverage beverage;

    public Milk (Beverage beverage){
        this.beverage.setMilk(true);
        this.beverage = beverage;

    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Leche";
    }
}
