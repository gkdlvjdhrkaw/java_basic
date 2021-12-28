package day15.poly.car;

import day12.obj_array.CarShop;

public class Main {

    public static void main(String[] args) {

        Car t1 = new Tucson();
        Car t2 = new Tucson();
        Car t3 = new Tucson();

        Car s1 = new Sonata();
        Car s2 = new Sonata();
        Car s3 = new Sonata();
        Car s4 = new Sonata();

        Car[] cars = {t1, t2, t3, s1, s2, s3, s4};

        for (Car c : cars) {
            c.run();
        }

        System.out.println("=========================================");

        Driver park = new Driver();

        park.drive(s1);
        park.drive(t1);
        park.drive(new Stinger());

        System.out.println("=========================================");

        Sonata mySonata = (Sonata)park.buyCar("소나타");
        System.out.println(mySonata);
        mySonata.run();
        mySonata.joinSonataClub();

        cars[0] = mySonata;

        System.out.println("=========================================");

        Carshop shop = new Carshop();

        int money = shop.sellCar(new Sonata());
        System.out.println("money = " + money);

    }
}
