package com.kh.practice.list.library.view;

import com.kh.practice.list.library.controller.BookController;

import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    private BookController bc = new BookController();

    public void mainMenu() {
        while (true) {
            System.out.println("== Welcome KH Library ==");

            System.out.println();
            System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 새 도서 추가\n" +
                    "2. 도서 전체 조회\n" +
                    "3. 도서 검색 조회\n" +
                    "4. 도서 삭제\n" +
                    "5. 도서 명 오름차순 정렬\n" +
                    "9. 종료");

            System.out.print("메뉴 번호 선택 : >> ");
            int choice = sc.nextInt();

            if (choice == 1) {
                // insertBook();
            } else if (choice == 2) {
                // selectList();
            } else if (choice == 3) {
                // searchBook();
            } else if (choice == 4) {
                // deleteBook();
            } else if (choice == 5) {
                // ascBook();
            } else {
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요!!");
            }
        } // while end
    }

}
