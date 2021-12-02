package day01;

public class Casting2 {

    public static void main(String[] args) {

        // 명시적 형변환 (downcasting)
        // 큰곳에서 작은곳으로 가면 자동으로 형변환을 해줄 수 없다
        // 큰곳에서 작은곳으로 옮기면 데이터가 뒤틀릴 수 있다
        int n = 1000;  //  4바이트
        // byte m = n;  //  1바이트
        byte m = (byte) n;
        System.out.println("m = " + m);

        double k = 5.556;
        int j = (int) k;
        System.out.println("j = " + j);


    }
    // ㅇㄹ //
}
