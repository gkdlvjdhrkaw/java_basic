package day01;

public class DataType {

    public static void main(String[] args) {

        // 정수 타입
        byte a = 127;
        short b = 32767;
        int c =  2147483647;
        long d = 2147483648L;  //  L을 붙여줘서 long 타입으로 바꿔줘야합

        // 실수 타입
        float f1 = 1.2345678901234F;  //  F를 붙여서 float 타입으로 바꿔줘야함
        double d1 = 1.2345678901234;

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        // 논리 타입
        boolean b1 = true;
        boolean b2 = false;

        // 문자 타입
        char c1 = 'A';
        char c2 = 51002;
        System.out.println("c2 = " + c2);

        // String 타입은 문자열을 저장하며 기본타입이 아닌 참조타입니다.
        String s1 = "hey!!";
        String s2 = "it is so \"easy\"!";
        System.out.println("s2 = " + s2);



    }
    // ㅇㄹ //
}
