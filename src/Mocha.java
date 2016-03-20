/**
 * Created by Moises on 20/03/2016.
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha (Beverage beverage){
        this.beverage.setMocha(true);
        this.beverage = beverage;

    }

    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }
}
