package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {

        // 문자열끼리의 동등비교 시 == 을 사용하지 말고
        // 문자열1.equals(문자열2) 를 사용할 것!
        // ex) if (s1 == s2)  (x)
        //     if (s1.equals(s2))  (o)

        Scanner sc = new Scanner(System.in);

        String[] foods = null;
        String[] temp = new String[foods.length + 1];

        System.out.println("# 먹고 싶은 음식을 입력하세요 !!");
        System.out.println("# 입력을 중지하려면 <그만> 이라고 입력하세요.");


        while (true) {
            System.out.printf(">> ");
            String answer = sc.nextLine();

            if (answer == "그만") break;

            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }
            temp[temp.length - 1] = answer;
        }
        foods = temp;
        temp = null;

        System.out.println(Arrays.toString(foods));
    }
}
