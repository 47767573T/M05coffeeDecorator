/**
 * Created by Moises on 20/03/2016.
 */
public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip (Beverage beverage){
        this.beverage.setWhip(true);
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Crema";
    }
}
