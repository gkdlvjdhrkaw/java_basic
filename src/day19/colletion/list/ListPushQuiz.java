package day19.colletion.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListPushQuiz {

    public static void main(String[] args) {

        // 문자열끼리의 동등비교 시 == 을 사용하지 말고
        // 문자열1.equals(문자열2) 를 사용할 것!
        // ex) if (s1 == s2)  (x)
        //     if (s1.equals(s2))  (o)

        Scanner sc = new Scanner(System.in);

        System.out.println("# 먹고 싶은 음식을 입력하세요 !!");
        System.out.println("# 입력을 중지하려면 <그만> 이라고 입력하세요.");

        //String[] foods = {};
        List<String> foods = new ArrayList<>();

        while (true) {
            System.out.printf(">> ");
            String answer = sc.nextLine();
            //System.out.println(Arrays.toString(foods));

            if (answer.equals("그만")) break;

            foods.add(answer);
        }

        System.out.println("먹고 싶은 음식들 : " + foods);
        sc.close();
    }
    // ㅇㅋ
}
