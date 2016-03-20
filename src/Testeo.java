/**
 * Created by Moises on 20/03/2016.
 */
public class Testeo {


    public static void main(String[] args) {

        Beverage espreso = new Espreso();
        System.out.println(espreso.getDescription()+" coste: "+espreso.cost()+"E");

        Beverage descafeinado = new Descoffee();
        descafeinado = new Mocha (descafeinado);
        descafeinado = new Mocha (descafeinado);
        descafeinado = new Soy (descafeinado);
        System.out.println(descafeinado.getDescription()+" coste: "+descafeinado.cost()+"E");

        Beverage cafeSolo = new Coffee();
        cafeSolo = new Milk (cafeSolo);
        cafeSolo = new Mocha (cafeSolo);
        cafeSolo = new Whip (cafeSolo);
        System.out.println(cafeSolo.getDescription()+" coste: "+cafeSolo.cost()+"E "+cafeSolo.isMilk());

    }
}
