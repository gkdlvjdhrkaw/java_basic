package day04;

import java.util.Scanner;

public class LoopNesting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (char u = 'A'; u <= 'Z'; u++) {
            for (char l = 'a'; l <= 'z'; l++) {
                System.out.println(u);
            }
        }
    }
}
