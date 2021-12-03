package day03;

import java.util.Scanner;

public class SwitchQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("직급을 입력하세요.");
        System.out.println("[ 사원, 대리, 과장, 차장, 부장 ]");
        System.out.print(">> ");
        String classs = sc.nextLine();
        sc.close();

        switch (classs) {
            case "사원":
                System.out.println("급여는 200만원 입니다.");
                break;
            case "대리":
                System.out.println("급여는 300만원 입니다.");
                break;
            case "과장":
                System.out.println("급여는 350만원 입니다.");
                break;
            case "차장":
                System.out.println("급여는 400만원 입니다.");
                break;
            case "부장":
                System.out.println("급여는 500만원 입니다.");
                break;
            default :
                System.out.printf("%s은(는) 없는 직급입니다.\n직급을 다시 입력해주세요." ,classs);
        }

    }
}
