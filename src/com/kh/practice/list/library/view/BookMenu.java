package com.kh.practice.list.library.view;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;
import day02.StdOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    private BookController bc = new BookController();


    private String input(String msg) {
        System.out.printf(msg);
        return sc.nextLine();
    }

    // 문자열 -> 정수 변환 매서드
    private int toInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("# 정수형 숫자로만 입력하세요!\n");
            return 0;
        }
    }


    public void mainMenu() {
        while (true) {
            System.out.println("\n== Welcome KH Library ==");

            System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 새 도서 추가\n" +
                    "2. 도서 전체 조회\n" +
                    "3. 도서 검색 조회\n" +
                    "4. 도서 삭제\n" +
                    "5. 도서 명 오름차순 정렬\n" +
                    "9. 종료");

            int menu = toInteger(input("메뉴 번호 선택 : >> "));

            switch (menu) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    ascBook();
                    break;
                case 9:
                    System.out.println("# 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
            } // switch end
        } // while end
    }


    public void insertBook() {
        System.out.println("\n===== 새 도서 추가 =====");
        System.out.println("# 책 정보를 입력해주세요 !!");
        String title = input("도서명 : ");
        String author = input("저자명 : ");
        String category = makeCategory();
        int price = makePrice();

        Book book = new Book(title, author, category, price);
        bc.insertBook(book);

        System.out.println("book = " + book);
    }


    // 가격 설정 매서드
    private int makePrice() {
        while (true) {
            int tempPrice = toInteger(input("가격 : "));
            if (tempPrice == 0) continue;
            return tempPrice;
        }
    }

    // 카테고리 설정 매서드
    private String makeCategory() {
        while (true) {
            int cNum = toInteger(input("장르(1. 인문  |  2. 과학  |  3. 외국어  |  4. 기타) : "));
            if (cNum == 0) continue;

            switch (cNum) {
                case 1:
                    return "인문";
                case 2:
                    return "과학";
                case 3:
                    return "외국어";
                case 4:
                    return "기타";
                default:
                    System.out.println("1 ~ 4 사이의 숫자를 입력하세요 !!!!!!");
            } // switch end
        } // while end
    }

    public void selectList() {
        ArrayList<Book> books = bc.selectList();

        System.out.println("\n===== 도서 전체 조회 =====");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void searchBook() {
        System.out.println("\n===== 도서 검색 =====");

        String keyword = input("검색어 : ");
        ArrayList<Book> books = bc.searchBook(keyword);

        if (books.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void deleteBook() {

        System.out.println("\n===== 도서 삭제 =====");
        String title = input("삭제할 도서 명 :");
        String author = input("삭제할 저자 명 :");
        Book deleteBook = bc.deleteBook(title, author);

        if (deleteBook != null) {
            System.out.printf("\n[%s]도서가 성공적으로 삭제했습니다!\n", deleteBook.getTitle());
        } else {
            System.out.println("\n삭제에 실패했습니다. 입력을 다시 확인하세요.");
        }
    }

    public void ascBook() {
        bc.ascBook();
        System.out.println("\n# 정렬에 성공했습니다.");
    }

}
