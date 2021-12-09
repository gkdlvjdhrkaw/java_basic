package day07;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        int[] number = {};

        int count = 0;
        while (true) {
            System.out.printf("x[%d] : ", count);
            int inNumber = sc.nextInt();
            count++;

            if (inNumber == -1) {
                System.out.println("반전했습니다.");
                break;
            }

            int[] temp = new int[number.length + 1];
            for (int i = 0; i < number.length; i++) {
                temp[i] = number[i];
            }
            temp[temp.length - 1] = inNumber;

            for (int i = count; i < temp.length - 1; i++) {
                temp[i] = temp[i + 1];
            }

            number = temp;
            temp = null;

        } // while end
        System.out.println(Arrays.toString(number));

        int[] reVer = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            for (int k = 0; k < reVer.length; k--) {
                number[i] = reVer[k];
            }
        }
        reVer = null;

        for (int i = 0; i < number.length; i--) {
            System.out.printf("x[%d] : %d", i, number[i]);
        }

        sc.close();
         */



        int[] arr = new int[7];

        //7번 입력받아 배열의 값을 초기화
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("입력받은 배열 : " + Arrays.toString(arr));

        for (int i = 0; i< arr.length / 2; i++ ) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("역정렬후 배열 : " + Arrays.toString(arr));

    }
}
