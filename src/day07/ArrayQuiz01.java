package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //학생 수를 입력받음 1 ~ 80명 사이
        int StuNum;
        while (true) {
            System.out.printf("학생 수를 입력해주세요.");
            StuNum = sc.nextInt();
            if (StuNum >= 1 && StuNum <= 80) {
                break;
            } else {
                System.out.println("1 ~ 80명 사이로 입력해주세요.");
            }
        } // while end

        //입력받은 학생 수 만큼 정수 배열을 생성
        int[] StuScore = new int[StuNum];

        //학생들의 점수 분포 수를 저장할 배열 (점수 구간 11개)
        int[] graph = new int[11];

        System.out.printf("%d명의 점수를 입력해주세요.\n", StuNum);
        for (int i = 0; i < StuNum; i++) {
            System.out.printf("%d번 : ", i + 1);
            int s = sc.nextInt();
            if (s < 0 || s > 100) {
                System.out.println("0 ~ 100점 사이로 입력하세요!");
                i--;
                continue;
            }
            StuScore[i] = s;
            graph[s / 10]++;
        } // for end
        //System.out.println(Arrays.toString(StuScore));
        //System.out.println(Arrays.toString(graph));

        System.out.println("\n\t\t===분포 그래프===");
        /*
        //그래프 세로버전
        for (int i = 0; i < graph.length; i++) {
            if (i == graph[graph.length - 1]) {
                System.out.printf("%d : ", i * 10);
            } else {
                System.out.printf("%d ~ %d : ", (i * 10), (i * 10 + 9));
            }
            for (int k = 0; k < graph[i]; k++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        */

        //그래프 가로버전

        // 분포의 최대값 구하기
        int grMax = 0;
        for (int i = 0; i < graph.length; i++) {
            if (grMax < graph[i]) {
                grMax = graph[i];
            }
        }
        //System.out.println("grMax = " + grMax);

        for (int i = grMax; i > 0; i--) {
            for (int k = 0; k < graph.length; k++) {
                if (graph[k] >= i) {
                    System.out.printf(" * ");
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.printf("\n");
        }// for end
        System.out.println("=================================");

        for (int i = 0; i < graph.length; i++) {
            System.out.printf("%2d", i * 10);
        }

    }// end main

}

