package day13.inherit;

public class Mage extends Player {

    public int mana;

    public Mage(String name) {
        super(name);
        /*
        this.name = name;
        this.level = 1;
        this.hp = 50;
         */
    }

    @Override // 오버라이딩 룰 검증
    public void info() {
        super.info();
        /*
        System.out.println("\n========== 캐릭터 정보 ==========");
        System.out.println("# 아이디 : " + name);
        System.out.println("# 레벨 : " + level);
        System.out.println("# 체력 : " + hp);
         */
        System.out.println("# 마나 : " + mana);
    }

    public void blizzard() {

    }
}
