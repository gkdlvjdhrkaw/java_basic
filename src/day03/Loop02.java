package day03;

import java.util.Scanner;

public class Loop02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 : ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
