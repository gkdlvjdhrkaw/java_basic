package day03;

import java.util.Random;
import java.util.Scanner;

public class RandomExample {

    public static void main(String[] args) {

        // 랜덤 객체 생성
        Random r = new Random();

        // 랜덤 실수 생성 (0.0이상 1.0미만 랜덤 실수)
        double rf = r.nextDouble();
        System.out.println("rf = " + rf);

        // 랜덤 정수 생성 (0 ~ bound미만 의 랜덤 정수)
        // int rn = r.nextInt(10); // 0 ~ 9
        int rn = r.nextInt(10) + 1; // 1 ~ 10
        System.out.println("rn = " + rn);

        // 공식 : x ~ y 까지의 랜덤정수
        // newtInt(y - x + 1) + x;

    }
}
