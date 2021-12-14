package day09;

import java.util.Arrays;

public class MethodQuiz01 {

    static String[] foods = {"치킨", "파스타", "짬뽕"};

    // foods 배열에 새로운 데이터를 끝에 추가하는 함수
    static void push(String newFood) {
        String temp[] = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length - 1] = newFood;
        foods = temp;
        temp = null;
    }

    // 찾는 함수
    static int indexOf(String findFood) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (findFood.equals(foods[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 삭제 함수
    static String remove(String del) {
        while (true) {
            if (indexOf(del) != -1) {
                for (int i = indexOf(del); i < foods.length - 1; i++) {
                    foods[i] = foods[i + 1];
                }

                String[] temp = new String[foods.length - 1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = foods[i];
                }
                foods = temp;
                temp = null;

                System.out.println("삭제함수  " + Arrays.toString(foods));  //  컨트롤 + 알트 + M 누르면 매서드 변환가능
                return del;
            } else {
                System.out.printf("%s 은(는) 존재하지않는 음식명 입니다.\n", del);
                return del;
            }
        } // while end
    }

    // 삽입 함수
    static void insert(int index, String insertFood) {
        String[] temp = new String[foods.length + 1];

        if (index < 0 || index > foods.length - 1) {
            System.out.println("인덱스범위 그거 맞아 ????");
            return;
        }


        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }

        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[index] = insertFood;

        foods = temp;
        temp = null;

        System.out.println("삽입함수  " + Arrays.toString(foods));
    }

    // 수정 함수
    static void modify(int index, String changeFood) {
        if (index < 0 || index > foods.length - 1) {
            System.out.println("인덱스범위 그거 맞아 ????");
            return;
        }

        foods[index] = changeFood;
        System.out.println("수정함수  " + Arrays.toString(foods));
        /*
        String[] temp = new String[foods.length];

        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[index] = changeFood;

        foods = temp;
        temp = null;

        System.out.println("수정함수  " + Arrays.toString(foods));
        return changeFood;
         */
    }

    // 데이터 모두 삭제 함수
    static void clear() {
        foods = new String[0];
        System.out.println("초기화함수  " + Arrays.toString(foods));
    }

    // 음식명을 입력하면 음식이 배열에 저장되었는지 여부 확인
    static boolean include(String findFood) {
        return indexOf(findFood) != 1;
        /*
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (findFood.equals(foods[i])) {
                index = i;
                System.out.println("True");
                break;
            }
        }
        boolean flag = index != -1;
        return flag;
         */
    }


    public static void main(String[] args) {

        push("볶음밥");
        System.out.println(Arrays.toString(foods));

        push("라면");
        System.out.println(Arrays.toString(foods));


        System.out.println("==============================");
        // 1 리턴
        int idx = indexOf("파스타");
        System.out.println("idx = " + idx);

        // 3리턴
        int idx2 = indexOf("볶음밥");
        System.out.println("idx2 = " + idx2);

        // -1리턴
        int idx3 = indexOf("망고");
        System.out.println("idx3 = " + idx3);


        System.out.println("=======================================");
        String del = remove("볶음밥"); // foods 배열에서 볶음밥 제거
        remove("망고"); // 존재하지 않는 음식명입니다 출력.

        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
        modify(2, "닭갈비"); // 2번 인덱스 데이터 닭갈비로 수정

        clear(); // foods 배열 모든 데이터 삭제

        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
    } // main end
}