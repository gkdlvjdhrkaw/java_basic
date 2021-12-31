package day17.inter;

public class Main {

    public static void main(String[] args) {

        // 타입변환이 많아짐 = 부모클래스를 인터페이스로 다중상속 가능
        Pet dog = new Dog();
        Huntable tiger = new Tiger();
        Wild shark = new Shark();

    }
}
