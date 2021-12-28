package day15.poly.casting;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        System.out.println("======================");

        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();

        System.out.println("======================");

        Parent upChild =  new Child();
        System.out.println(upChild);

        upChild.m1();
        upChild.m2();
        // upChild.m3();
        ((Child)upChild).m3();  // upChild 를 Child 로 강제로 변환시켜서 가능

        System.out.println("======================");

        // Child p = (Child)new Parent();  // 강제 변환을 시켜도 부모가 자식을 받아 올 수 없음


    }
}
