package day06;

import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] foods = {"치킨", "피자", "삼겹살", "족발", "파스타"};

        // 순차 탐색 알고리즘

        System.out.printf("찾는 음식 : ");
        String targetFood = sc.next();
        sc.close();

        int index = -1; // 찾은 인덱스를 저장할 변수  // -1은 못찾았다는 뜻
        for (int i = 0; i < foods.length; i++) {
            if (targetFood.equals(foods[i])) {
                index = i;
                break;
            }
        }

        boolean result = index != -1;
        System.out.println("음식 탐색 성공?? " + result);
        System.out.println("찾은 음식의 인덱스 : " + index);

    }
}
