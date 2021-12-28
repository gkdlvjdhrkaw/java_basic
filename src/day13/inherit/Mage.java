package day13.inherit;

import day02.StdOutput;

import java.util.Random;

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


    public void blizzard (Player ... targets) {

        System.out.printf("# %s 님 눈보라 시전!!!!", this.name);
        System.out.println("==========================");

        Random r = new Random();
        for (Player p : targets) {

            // 맞은 사람이 혹시 나??
            if (p == this) continue;

            // 10 ~15의 랜덤 피해
            int damage = r.nextInt(6) + 10;
            // 실제 체력에서 차감
            p.hp -= damage;


        System.out.printf("%s님이 %s의 피해를 입었습니다.(남은 체력 : %d)\n", p.name, damage, p.hp);

        } // for end
    }

}
