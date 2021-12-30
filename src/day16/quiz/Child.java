package day16.quiz;

public class Child extends Parent {

    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String) call");
    }

    /*
    public Child(String name) {
        // super(name);  // 기본 생성자를 안만들시 수퍼() 를 씀
        this.name = name;
    }
    */

}
