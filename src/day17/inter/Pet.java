package day17.inter;

public interface Pet {

    // 필드는 무조건 public static final로 자동 처리 -> 상수처리
    String PLAY_GROUND = "애완동물 카페";

    // 인터페이스는 기본적으로 추상매서드 선언하도록 되어 있음.
    void play(); // 애완동물이 노는 기능

}
