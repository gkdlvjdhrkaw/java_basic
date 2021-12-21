package Project;

import java.util.Arrays;
import java.util.Scanner;

public class GradeProgram01 {
    // 임시 더미 자료들
    static String[] teacherID = {};
    static String[] teacherPW = {};
    static String[] teacher = {};

    static String[] studentID = {};
    static String[] studentPW = {};
    static String[] student = {};

    static String[] loginUser = {}; // global 용

    static int[] scoreKor = {};
    static int[] scoreEng = {};
    static int[] scoreMat = {};
    static int[] scoreTotal = {};
    static int[] scoreAvg = {};
    static int[] grade = {};

    /*
    로그인
    => 선생님이라면 관리자 페이지로
    <선생님 회원가입할때 선생님 학생 선택항목>

    선생님만 관리자
     */

    // 프로그램 메인
    static void main() {
        System.out.println(Arrays.toString(teacher));
        System.out.println(Arrays.toString(teacherID));
        System.out.println(Arrays.toString(teacherPW));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==============================");
            System.out.println("\t [[ 아이섹 초등학교 ]]");
            System.out.println("\t[[ 성적 관리 프로그램 ]]");
            System.out.println("==============================");
            System.out.println("1. 로그인  | 2. 회원가입  |  3. 종료");
            System.out.print(">> ");
            int choice = sc.nextInt();
            if (choice == 1) {
                //login();
            }
            if (choice == 2) {
                AddUser();
            }
            if (choice == 3) {
                exit();
            } else {
                System.out.println("다시 생각해보는게 어때?");
                continue;
            }
            break;
        } // while end
    }


    // 프로그램 로그인 이후 선생님 메인
    static void teachermain() {
        System.out.println("==============================");
        System.out.println("\t [[ 아이섹 초등학교 ]]");
        System.out.println("\t[[ 성적 관리 프로그램 ]]");
        System.out.println("==============================");
        System.out.println("%s 선생님 안녕하세요 !");
        System.out.println("1. 개인정보  | 2. 학생관리  |  3. 성적관리  |  4. 종료");
    }

    // 프로그램 로그인 이후 학생 메인
    static void studentmain() {
        System.out.println("==============================");
        System.out.println("\t [[ 아이섹 초등학교 ]]");
        System.out.println("\t[[ 성적 관리 프로그램 ]]");
        System.out.println("==============================");
        System.out.println("%s 학생 반가워요 !");
        System.out.println("1. 성적확인  |  2. 종료");
    }

    // 서치 아이디  // *확인안함*
    static int SearchID(String findID) {
        int index = -1;
        for (int i = 0; i < teacher.length; i++) {
            if (findID.equals(teacher[i])) {
                index = i;
                break;
            }
        }
        return index;
    }
    // 서치 비밀번호  // *확인안함*
    static int SearchPW(String findPW) {
        int index = -1;
        for (int i = 0; i < teacher.length; i++) {
            if (findPW.equals(teacher[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 로그인 입력 // *확인안함*
    /*
    static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("로그인을 해주세요 !");

        while (true) {

            System.out.print("ID : ");
            SearchID(sc.next());
            System.out.print("PW : ");
            SearchPW(sc.next());
            String[] FindUser = new String[0];
            for (int i = 0; i < teacherID.length; i++) {
                if ( == teacherID[i]) {
                    FindUser = teacherID;
                    sc.next();
                }else {
                    continue;
                }
            }break;
        } // while end
    } // login end
    */

    // 회원가입 함수
    static void AddUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원가입을 부탁드리겠습니다.");
        if (whois()) {
            System.out.print("ID를 입력해주세요 : ");
            teachinsertID(sc.next());
            System.out.print("PW를 입력해주세요 : ");
            teachinsertPW(sc.next());
            System.out.print("NAME을 입력해주세요 : ");
            teachinsertNAME(sc.next());
            main();
        }
        if (!whois()) {
            System.out.print("ID를 입력해주세요 : ");
            String AddstudentID = sc.next();

            System.out.print("PW를 입력해주세요 : ");
            String AddstudentPW = sc.next();
            System.out.print("NAME을 입력해주세요 : ");
            String AddstudentNAME = sc.next();
            main();
        }
    } // AddUser end


    // 회원가입시 선생님 학생 선택
    static boolean whois() {
        Scanner sc = new Scanner(System.in);
        System.out.println("선생님 과 학생 당신의 선택은?!?!?");
        System.out.println("=================================");
        System.out.println("1. 선생님  |  2. 학생  |  3. HOME");
        int choice = sc.nextInt();

        while (true) {
            if (choice == 1) {
                System.out.println("당신은 선생님이 확실합니까?");
                System.out.println("1. YES  |  2. NO");
                String nugu = sc.next();

                switch (nugu) {
                    case "1":
                        System.out.println("선생님으로서 항상 최선을 다해주세요 !!");
                        return true;
                    case "2":
                        System.out.println("구라 치다 걸리면 알죠??");
                        whois();
                }
            } // if end
            if (choice == 2) {
                System.out.println("당신은 학생이 확실합니까?");
                System.out.println("1. YES  |  2. NO");
                String nuguu = sc.next();

                switch (nuguu) {
                    case "1":
                        System.out.println("공부해라 !!");
                        return false;
                    case "2":
                        System.out.println("뭔데.. 도대체 누군데..");
                        whois();

                }
            } // if end
            if (choice == 3) {
                main();
            }
            else {
                System.out.println("버튼을 잘못 누르셨어요 ! \n어머 저도 실수로 종료를 눌렀네요 !");
                baroexit();
            }
        } // while end
    } // whois end


    // 선생 ID 삽입 함수
    static void teachinsertID(String AddteacherID) {
        String[] temp = new String[teacherID.length + 1];
        for (int i = 0; i < teacherID.length; i++) {
            temp[i] = teacherID[i];
        }
        temp[temp.length - 1] = AddteacherID;
        teacherID = temp;
        temp = null;

    }
    // 선생 PW 삽입 함수
    static void teachinsertPW(String AddteacherPW) {
        String[] temp = new String[teacherPW.length + 1];
        for (int i = 0; i < teacherPW.length; i++) {
            temp[i] = teacherPW[i];
        }
        temp[temp.length - 1] = AddteacherPW;
        teacherPW = temp;
        temp = null;

    }

    // 선생 이름 삽입 함수
    static void teachinsertNAME(String Addteacher) {
        String[] temp = new String[teacher.length + 1];
        for (int i = 0; i < teacher.length; i++) {
            temp[i] = teacher[i];
        }
        temp[temp.length - 1] = Addteacher;
        teacher = temp;
        temp = null;

    }



        // 종료 함수
        static void exit () {
            Scanner sc = new Scanner(System.in);
            System.out.println("프로그램을 종료하시겠습니까????? Y or N");
            System.out.print(">> ");
            String naga = sc.next();

            switch (naga) {
                case "Y":
                case "y":
                case "Yes":
                case "yes":
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);

                case "N":
                case "n":
                case "No":
                case "no":
                    System.out.println("프로그램 종료를 취소하셨습니다.");
                    break;
            }
            main(); // 종료 취소하면 메인으로 다시 돌아감
        }

        // 바로종료함수
        static void baroexit() {
            System.exit(0);
        }


        // ====================================================================================== //
        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);

            // 더미 배열 확인
            System.out.println(Arrays.toString(teacher));
            System.out.println(Arrays.toString(teacherID));
            System.out.println(Arrays.toString(teacherPW));
            System.out.println(Arrays.toString(student));
            System.out.println(Arrays.toString(studentID));
            System.out.println(Arrays.toString(studentPW));


            main();
            if (loginUser == teacher) {
                while (true) {
                    teachermain();
                    System.out.print("선택해주세요 >> ");
                    int select = sc.nextInt();

                    if (select == 1) {
                        // 개인관리
                    } else if (select == 2) {
                        // 학생관리
                    } else if (select == 3) {
                        // 성적관리
                    } else if (select == 4) {
                        exit();
                    } else {
                        System.out.println("다시 선택해주세요 !!");
                    }

                } // while end
            } // if end

            if (loginUser == student) {
                while (true) {
                    studentmain();
                    System.out.print("선택해주세요 >> ");
                    int select = sc.nextInt();

                    if (select == 1) {
                        // 성적확인
                    } else if (select == 2) {
                        exit();
                    } else {
                        System.out.println("다시 선택해주세요 !!");
                    }
                } // while end
            } // if end

        } // main end
    // ㅇㅋ
    } // class end
