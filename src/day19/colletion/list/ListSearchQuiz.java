package day19.colletion.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListSearchQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> DongBang =  new ArrayList<>(
                Arrays.asList("영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호")
        );


        System.out.println("* 변경 전 정보 : [ 영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호 ]");

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.printf(">> ");
            String member = sc.nextLine();


            int index = DongBang.indexOf(member);

            if (DongBang.contains(member)) {
                System.out.printf("%s의 별명을 변경합니다.", member);
                System.out.printf(">> ");
                String change = sc.next();
                DongBang.set(index, change);
            } else {
                System.out.printf("%s는 없는 이름입니다.\n", member);
            }

            System.out.println("변경 후 정보 : " + DongBang);
            break;

        } // while end

    }
    //ㅇㅋ
}
