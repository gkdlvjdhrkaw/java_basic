package com.kh.practice.list.music.view;

import com.kh.practice.list.library.model.vo.Book;
import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicView {

    Scanner sc = new Scanner(System.in);

    MusicController mc = new MusicController();


    private String input(String choice) {
        System.out.printf(choice);
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

            System.out.println("\n\n******* 메인 메뉴 *******");
            System.out.println("1. 마지막 위치에 곡 추가\n" +
                    "2. 첫 위취에 곡 추가\n" +
                    "3. 전체 곡 목록 출력\n" +
                    "4. 특정 곡 검색\n" +
                    "5. 특정 곡 삭제\n" +
                    "6. 특정 곡 정보 수정\n" +
                    "7. 곡명 오름차순 정렬\n" +
                    "8. 가수명 내림차순 정렬" +
                    "9. 종료");

            int menu = new Integer((input("메뉴 번호 선택 : >> ")));

            switch (menu) {
                case 1:
                    addList();
                    break;
                case 2:
                    addAtZero();
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    searchMusic();
                    break;
                case 5:
                    removeMusic();
                    break;
                case 6:
                    setMusic();
                    break;
                case 7:
                    ascTitle();
                    break;
                case 8:
                    descSinger();
                    break;
                case 9:
                    System.out.println("종료를 하겠어요 !!!");
                    System.exit(0);

            } // switch end
        } // while end
    }

    public void addList() {
        System.out.println("곡을 추가해주세요 !!! \n(+곡명  +가수명)");
        String title = input("곡 명 : ");
        String singer = input("가수 명 : ");

        Music music = new Music(title, singer);
        mc.addList(music);

        // if
    }

    public void addAtZero() {
        System.out.println("곡을 추가해주세요 !!! \n(+곡명  +가수명)");
        String title = input("곡 명 : ");
        String singer = input("가수 명 : ");

        Music music = new Music(title, singer);
        mc.addList(music);

        // if
    }

    public void printAll() {
    }

    public void searchMusic() {
    }

    public void removeMusic() {
    }

    public void setMusic() {
    }

    public void ascTitle() {
    }

    public void descSinger() {
    }

}
