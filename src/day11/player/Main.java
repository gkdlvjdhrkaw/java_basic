package day11.player;

public class Main {

    public static void main(String[] args) {

        Player park = new Player("주차왕파킹");
        Player show = new Player("공연왕쇼킹");

        System.out.println("park = " + park);
        System.out.println("show = " + show);

        park.attack(show);


    } // main end
}// class end
