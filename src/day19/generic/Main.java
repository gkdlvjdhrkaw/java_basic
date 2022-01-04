package day19.generic;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();
        System.out.println("apple = " + apple);

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();
        System.out.println("banana = " + banana);


        System.out.println("=================================");

        Basket<Apple> appleBasket = new Basket<Apple>();
        appleBasket.setF(new Apple());
        Apple aa = appleBasket.getF();
        System.out.println("aa = " + aa);

        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setF(new Banana());
        Banana ba = bananaBasket.getF();
        System.out.println("ba = " + ba);

        Basket<Grape> grapeBasket = new Basket<Grape>();
        grapeBasket.setF(new Grape());

    } // main end
}
