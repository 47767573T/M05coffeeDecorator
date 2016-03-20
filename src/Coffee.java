/**
 * Created by Moises on 20/03/2016.
 */
public class Coffee extends Beverage {

    public Coffee(){
        description = "Cafe solo";
    }

    @Override
    public double cost() {
        return 1;
    }
}
