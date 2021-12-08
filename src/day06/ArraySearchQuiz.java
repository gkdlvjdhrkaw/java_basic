package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] DongBang = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보 : [ 영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호 ]");
        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.printf(">> ");
            String member = sc.nextLine();

            int index = -1;
            for (int i = 0; i < DongBang.length; i++) {
                if (member.equals(DongBang[i])) {
                    index = i;
                    break;
                }
            } // for end
            if (index != -1) {
                System.out.printf("%s의 별명을 변경합니다.", member);
                System.out.printf(">> ");
                String change = sc.next();
                DongBang[index] = change;
                System.out.print("변경 완료!!");
                System.out.println("변경 후 정보 : " + Arrays.toString(DongBang));
                break;
            } else {
                System.out.printf("%s은(은) 없는 이름입니다.", member);
            } // if end
        } // while end
    }
}
