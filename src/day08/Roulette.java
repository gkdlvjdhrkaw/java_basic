package day08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Roulette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


            System.out.printf("게임 인원 (2 ~ 4명) ==> ");
            int playerNum = sc.nextInt();

            if (playerNum < 2 || playerNum > 4) {
                System.out.println("인원 수가 올바르지 않습니다. (2 ~ 4명)");
                return;
            }

        // 참여 인원 수대로 이름을 반복 입력 받은 후 배열에 저장
        String[] player = new String[playerNum];

        System.out.println("\n플레이어 이름을 등록합니다.");
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름 : ", i+1);
            player[i] = sc.next();
        }

        // 참여 인원 이름 출력
        System.out.println(Arrays.toString(player) +" 참가 ! ");

        System.out.printf("\n실탄 개수 (1 ~ 5개) ==> ");
        int bullet = sc.nextInt();
        sc.nextLine();

        // 총에 실탄수만큼 총알을 배치해야 함.
        boolean[] magazine = new boolean[6];

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");

        // 입력된 실탄 수만큼 탄창배열의 내부값을 랜덤하게 true 로 바꿔야 함.
        Random r = new Random();

        int success = 0; //정확하게 총알을 장전한 횟수
        while (true) {
            //입력된 실탄 수만큼 탄창배열의 내부값을 랜덤하게 true 로 바꿔야 함.
            int position = r.nextInt(magazine.length);
            if (!magazine[position]) { //탄창안에 실탄이 안들어간 곳에만
                magazine[position] = true; //총알을 넣어라
                success++;
            }
            if (success == bullet) break;
        } // while end


        //System.out.println("탄창 : " + Arrays.toString(magazine));

        // ======= 핵심 게임 로직 ======= //
        // 선턴 플레이어 랜덤 결정
        // 랜덤 인덱스를 플레이어 수 범위 안에서 결정
        int turn = r.nextInt(playerNum);
        System.out.printf("\n총을 돌렸습니다. %s 부터 시작합니다.", player[turn]);

        while (true) {
            /*
             # 1턴 동안 해야할 일
            1. 탄창을 회전시켜서 무작위로 격발구의 위치를 결정 : 랜덤 인덱스(탄창범위 0 ~ 5) 생성
            2. 격발한다 : 위에서 나온 인덱스로 탄창을 조회하여 실탄이 있는지 확인
            3. 사망 판정 : 해당 위치에 실탄이 있었다면(값이 true 였다면)
                          사망 처리 후 게임 종료, 없었다면 다음 턴으로 이동
            4. 턴 조정 : 지금 격발한 플레이어가 마지막 인덱스 플레이어면
                        다음 턴은 0번으로 조정, 아니면 ++로 처리
            */

            int shoot = r.nextInt(magazine.length);
            System.out.printf("\n[%s 의 턴!]  탄창을 무작위로 돌립니다.\n", player[turn]);

            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine();

            // 생존 사망 판정
            if (magazine[shoot]) {
                System.out.println("빵 !!!!! 사망...");

                // 사망자를 players 배열에서 삭제
                for (int i = turn; i < player.length - 1; i++) {
                    player[i] = player[i + 1];
                }
                String[] temp = new String[--playerNum];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = player[i];
                }
                player = temp;
                temp = null;

                // 탄창 배열에서 총알이 나간 위치값을 재조정
                magazine[shoot] = false;
                bullet--;

                // 게임 종료 조건
                // 남은 플레이어가 1명일 때
                if (playerNum == 1) {
                    System.out.printf("\n# 단 한명만 살아남았습니다. 게임을 종료합니다.");
                    System.out.printf("# 최후 생존자 : [%s]\n", player[0]);
                    break;
                }
                // 총알이 0개 일때
                else if (bullet == 0) {
                    System.out.println("\n# 총알이 모두 소진되었습니다. 게임을 종료합니다.");
                    System.out.printf("# 생존한 인원 : %s\n", Arrays.toString(player));
                    break;
                }
                // 계속 게임을 진행할 떄
                else {
                    System.out.println("\n# 남은 인원으로 게임을 계속합니다.");
                    System.out.printf("# 생존한 인원 : %s\n", Arrays.toString(player));
                    // 마지막 플레이어가 죽었을 경우엔 turn 을 0으로 재조정
                    if (turn == player.length) {
                        turn = 0;
                    }
                    continue;
                }

            } else {
                System.out.println("생존하셨슴.");
                if (turn == player.length - 1) {
                    turn = 0;
                } else {
                    turn++;
                }
            }

        }// while end
        System.out.println("# 게임을 종료합니다.");


    }// main end
}
