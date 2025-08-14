package turillolucaautomobile;

import mydata.Data;

public class TurilloLucaAutomobile {

    public static void main(String[] args) {
        Data a = new Data(20, 3, 1900);
        Automobile auto = new Automobile("a", "a", 100, "benzina", a);
        System.out.println(auto.getDataImmatricolazione());
    }
}
