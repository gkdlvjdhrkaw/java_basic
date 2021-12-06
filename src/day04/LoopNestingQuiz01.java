package day04;

import java.util.Scanner;

public class LoopNestingQuiz01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        System.out.println("옆으로 긴 직사각형을 그립니다.");
        System.out.print("한 변(1) : ");
        int side1 = sc.nextInt();
        System.out.print("한 변(2) : ");
        int side2 = sc.nextInt();
        sc.close();

        int width, height;
        if (side1 > side2) {
            width = side1;
            height = side2;
        } else {
            width = side2;
            height = side1;
        }

        for (int i = 0; i < height; i++ ) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
        */



        System.out.print("몇 개의 *을 표시할까요? : ");
        int Star = sc.nextInt();
        System.out.print("몇 개마다 줄 바꿈할까요? : ");
        int Line = sc.nextInt();
        sc.close();

        for (int i = 0; i < Star; i++) {
            if (i % Line == 0) {
                System.out.printf("\n");
            }
            System.out.print("*");
        }
        /*
        //줄바꿈높이
        int height = star / width;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        //나머지 별들 처리
        int rem = star % width; //나머지 별 개수
        if (rem > 0) {
            for (int i = 0; i < rem; i++) {
                System.out.printf("*");
            }
        }
        */


    }
}
