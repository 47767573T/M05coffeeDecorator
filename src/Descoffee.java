/**
 * Created by Moises on 20/03/2016.
 */
public class Descoffee extends Beverage{

    public Descoffee(){
        description = "Cafe descafeinado";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
