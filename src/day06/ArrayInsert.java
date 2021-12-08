package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {50, 150, 200, 250, 300};
        System.out.println("추가 전 : " + Arrays.toString(arr));

        int newNumber = 100;  // 신규 삽입데이터
        int targetIndex = 1;  // 삽입 위치

        int[] temp = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        int InsertIdx = 5;
        for (int i = temp.length - 1; i > targetIndex; i--) {
            temp[i] = temp[i-1];
        }

        temp[targetIndex] = newNumber;

        arr = temp;
        temp = null;


        System.out.println("추가 후 : " + Arrays.toString(arr));
    }
}
