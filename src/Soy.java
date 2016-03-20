/**
 * Created by Moises on 20/03/2016.
 */
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy (Beverage beverage){
        this.beverage.setSoy(true);
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soja";
    }
}
