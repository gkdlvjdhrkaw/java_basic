package com.kh.hw.person.view;

import com.kh.hw.person.controller.PersonController;

import java.util.Scanner;

public class PersonMenu {

    Scanner sc = new Scanner(System.in);
    PersonController pc = new PersonController();

    public void mainMenu() {
        System.out.println("==============================");
        System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
        System.out.printf("현재 저장된 학생은 %d명입니다.\n", "");
        System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
        System.out.printf("현재 저장된 사원은 %d명입니다.\n", "");
        System.out.println("==============================");

        while (true) {
            System.out.print("메뉴 번호 >> ");
            int choice = sc.nextInt();

            if (choice == 1) {
                // 학생메뉴
            } else if (choice == 2) {
                // 사원메뉴
            } else if (choice == 9) {
                System.out.println("종료합니다/");
                System.exit(0);
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }

        /*public void studentMenu() {
            while (true) {
                System.out.print("메뉴 번호 >> ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    // 학생 추가
                } else if (choice == 2) {
                    // 학생 보기
                } else if (choice == 9) {
                    // 메인으로로
                }

            }
        }*/


   }

}
