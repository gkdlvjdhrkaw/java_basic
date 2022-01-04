package com.kh.practice.list.library.controller;

import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookController {

    Scanner sc = new Scanner(System.in);

    private List<String> list = new ArrayList();

    public BookController() {
    }

    public void insertBook() {
        System.out.print("도서명 : ");
        String title = sc.next();
        System.out.print("저자명 : ");
        String author = sc.next();
        System.out.print("장르(1. 인문  |  2. 과학  |  3. 외국어  |  4. 기타) : ");
        int category = sc.nextInt();
        if (category == 1) {

        }

        System.out.print("가격 : ");
        int price = sc.nextInt();

    }
}
