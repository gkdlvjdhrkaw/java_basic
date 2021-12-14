package Project;

import java.util.Arrays;
import java.util.Scanner;

public class GradeProgram {
    // 임시 이름들
    static String[][] teacher = {
            {"apple01", "abc111", "1반선생님"},
            {"choco02", "abc222", "2반선생님"},
            {"cake03", "abc333", "3반선생님"}
    };
    static String[][] student = {
            {"현우", "혜진", "민아", "준민", "유영"},
            {"민혁", "우진", "수희", "수아"},
            {"창희", "도연", "윤희", "혁재", "도희", "철우", "아영"}
    };

    // 프로그램 메인
    static void main(int select) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==============================");
            System.out.println("\t [[ 아이섹 초등학교 ]]");
            System.out.println("\t[[ 성적 관리 프로그램 ]]");
            System.out.println("==============================");

            System.out.println("1. 로그인  | 2. 회원가입  |  3. 종료");
            System.out.println(">> ");
            int choice = sc.nextInt();
            if (choice == 1) {
                // 로그인 함수
            }
            if (choice == 2) {
                // 회원가입 함수
            }
            if (choice == 3) {
                // 나가기 함수
            } else {
                System.out.println("잘못입력하셨습니다 휴먼?");
                continue;
            }
            break;
        } // while end
    }

    // 서치 아이디
    static int SearchID(String findID) {
        int index = -1;
        for (int i = 0; i < teacher.length; i++) {
            if (findID.equals(teacher[i][0])) {
                index = i;
                break;
            }
        }
        return index;
    }
    // 서치 비밀번호
    static int SearchPW(String findPW) {
        int index = -1;
        for (int i = 0; i < teacher.length; i++) {
            if (findPW.equals(teacher[i][1])) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 로그인 입력
    static String login() {
        Scanner sc = new Scanner(System.in);
        int index = -1;
        while (true) {
            System.out.println("ID : ");
            String insertID = sc.next();
            System.out.println("PW : ");
            String insertPW = sc.next();
            String[] FindUser = new String[0];
            for (int i = 0; i < teacher[i].length; i++) {
                if (insertID == teacher[i][0]) {
                    FindUser = teacher[i];
                }
            }
        } // while end
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 성적 관리 프로그램


        // 배열 확인
        for (int i = 0; i < teacher.length; i++) {
            System.out.println(Arrays.toString(teacher[i]));
        }
        for (int i = 0; i < student.length; i++) {
            System.out.println(Arrays.toString(student[i]));
        }


        while (true) {
            System.out.println("선택해주세요 >> ");
            int select = sc.nextInt();

            if (select == 1) {

            } else if (select == 2) {

            } else {
                System.out.println("다시 선택해주세요 !!");
            }

        } // while end


    } // main end
}
