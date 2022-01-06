package day20.collection.map.song;

import com.kh.practice.list.library.model.vo.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Controller {

    static Map<String, Set<String>> artists = new HashMap<>();
    static Set<String> songs = null;
    static Scanner sc = new Scanner(System.in);


    public static void mainMenu() {
        System.out.println("*** 음악 관리 프로그램 ***");
        System.out.println("# [현재 등록된 가수 : %d명]", artists.size());
        System.out.println("# 1. 노래 등록하기" +
                "# 2. 노래 정보 검색" +
                "# 3. 프로그램 종료");
        System.out.println("************************");
    }


    public static void insertMusic(String Singer, String Music) {
        System.out.println("# 노래 등록을 시작합니다.");
        System.out.print("- 가수명 : ");
        String singer = sc.next();
        System.out.println("- 곡명 : ");
        String music = sc.next();

        artists.add(singer, music);
    }



} // class end
