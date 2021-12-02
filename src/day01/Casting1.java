package day01;

public class Casting1 {

    public static void main(String[] args) {

        // 암시적 형변환 (upcating, promotion)
        // 작은곳에서 큰곳으로 옮기면 자동으로 형변환을 해준다
        byte a = 100;  //  1바이트

        int b = a;  //  4바이트

        double c = b;  //  8바이트

        System.out.println("c = " + c);
    }
    // ㅇㄹ //
}
