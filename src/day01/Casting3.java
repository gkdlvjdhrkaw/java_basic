package day01;

public class Casting3 {

    public static void main(String[] args) {

        // 데이터 크기가 다른 연산은 작은쪽을 큰쪽으로 자동변환하고 연산함
        char c = 'B';
        int i = 2;
        System.out.println(c + i);

        /* int 보다 작은 데이터 (byte, short, char)타입 끼리의 연산은
        결과가 자동으로 int 로 처리됨 */
        byte b1 = 100;
        byte b2 = 120;
        int b3 = b1 + b2;

        System.out.println("=============================");

        int n1 = 27, n2 = 5;
        double res = (double)n1 / n2;
        System.out.println("res = " + res);


    }
}
