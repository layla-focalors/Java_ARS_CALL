import javax.xml.stream.events.StartDocument;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class arc {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World");
        boolean isexit = false;
        int min = 60;
        int sec = min * 60;
//        do{
//            System.out.println("기능을 선택하세요 : ");
//            System.out.println("1. 미국에 전화걸기");
//        }while(!isexit);
        int action;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("메뉴를 선택하세요 : ");
            System.out.println("1. 게임하기");
            System.out.println("2. 게임 설정");
            System.out.println("3. 게임 종료");
            action = sc.nextInt();
            switch (action) {
                case 1 -> {System.out.println("게임을 시작합니다.");
                    isexit= true;
                }
                case 2 -> {
                    System.out.println("게임 설정");
                    System.out.println("시스템에서 사용할 시간을 입력하세요. 최소 값은 10분입니다.");
                    min = sc.nextInt();
                    sec = min * 60;
                }
                case 3 -> {
                    System.out.println("게임을 종료합니다.");
                    isexit = true;
                }
                default -> {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("게임이 시작됩니다.");
                    isexit = true;
                }
            }
        }while(!isexit);
        min = 60;
        sec = min * 60;
        System.out.println("배경 설명 : ");
        System.out.println("당신은 한국 제국의 황제입니다.");
        System.out.println("당신의 국가에서 실수로 세계 최강대국인 중국에 핵미사일을 발사하였습니다. ");
        System.out.println("핵을 막을 수 있는 유일한 수단은 중국에서 미사일을 통해 요격하는 방법뿐입니다.");
        System.out.println("남은 시간은 " + min + "분 입니다.");
        boolean exit_game = false;
        do{
            System.out.println("어느 국가에 전화 하시겠습니까?");
            System.out.println("1. 미합중국 (미국) - 요격강국");
            System.out.println("2. 중국 (China) - 핵강국");
            System.out.println("3. 미사일 발사 지연");
            System.out.println("4. 영국 (United Kingdom) - 과학기술강국");
            System.out.println("5. 호주 (친한나라)");
            System.out.print("메뉴 입력 ");
            int value = sc.nextInt();
            switch (value){
                case 1 -> {
                    int delay_time = (int)(Math.random() * 100);
                    System.out.println("ARS 미합중국에 연락해주셔서 감사합니다. ");
                    System.out.println("현재 접속량이 많아 : " + delay_time + "초 후에 연결됩니다.");
//                    play sound
                    System.out.println("연결중입니다.");
                    System.out.print("[");
                    for(int i = 0; i < delay_time; i ++){
//                        System.out.println("연결중입니다 \n[");
                        System.out.print("||");
                        TimeUnit.SECONDS.sleep(1);
                    }
                    System.out.println("]");
                }
            }
        }while(exit_game);
    }
}
