package thedisaster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * メインのファイル。
 */
public class TheDisaster {

    static String DisasterName;
    static Character Disaster;
    static Grim grimgerde;
    
    static List<Dungeon> dungeonList = new ArrayList<Dungeon>();
    static List<Item> itemList = new ArrayList<Item>();
    
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        init(); //初期化
        Story.Openning(); //オープニング
        PutDisasterName(); //名前決定
        DamageOverTime(); //HP減少開始
        Story.Tutorial(); //チュートリアル
        //BattleWithMessiah(); //制作中
        Story.TutorialBattleAfter(); //チュートリアル戦後
    }

    private static void init() {
        itemList.add(new Item("小回復", 10));
        itemList.add(new Item("中回復", 20));
        itemList.add(new Item("大回復", 30));
        itemList.add(new Item("特大回復", 150));
        
        grimgerde = new Grim("Grimgerde", 10000);

        dungeonList.add(new Dungeon("チュートリアル", 2, "", "", ""));
        dungeonList.add(new Dungeon("選択1", 0, "", "", "ナイフ"));
        dungeonList.add(new Dungeon("810", 0, "", "", "おもちゃのナイフ"));
        dungeonList.add(new Dungeon("ステージ1", 2, "小", "", ""));
        dungeonList.add(new Dungeon("SP", 0, "", "中", "魔法のフライパン"));
        dungeonList.add(new Dungeon("ステージ2", 2, "中", "", "ニワトコの杖"));
        dungeonList.add(new Dungeon("選択2", 0, "", "大", "マスケット銃"));
        dungeonList.add(new Dungeon("ステージ3", 4, "特大", "", "水鉄砲"));
        dungeonList.add(new Dungeon("イージーマス", 0, "", "", ""));
        dungeonList.add(new Dungeon("ラスボス", 1, "", "", ""));

    }

    /**
     * Disasterの名前を決定するメソッド
     */
    public static void PutDisasterName() {
        boolean roop;
        do {
            roop = false;

            //netbeans環境では入力された日本語は文字化けする？みたいです。cmd上では正常表示されます
            System.out.println("災害(主人公)の名前を入力してください");
            DisasterName = scan.nextLine();

            System.out.println(DisasterName + " でよろしいですか? (y/n)");

            if (TwoChoices("y", "n").equals("n")) {
                roop = true;
            }
        } while (roop);
        Disaster = new Character(DisasterName, 2000, "なし");
    }
    
    public void DisasterGetWepon(){
    
    }

    /**
     * 二択の選択結果を返すメソッド
     *
     * @param Choice1 選択肢1
     * @param Choice2 選択肢2
     * @return 選択結果
     */
    public static String TwoChoices(String Choice1, String Choice2) {
        boolean roop;
        do {
            roop = false;
            String input = scan.nextLine();

            if (input.toLowerCase().equals(Choice1)) {
                return Choice1;
            } else if (input.toLowerCase().equals(Choice2)) {
                return Choice2;
            } else {
                System.out.println(Choice1 + " か " + Choice2 + "のどちらかを半角で入力して下さい");
                roop = true;
            }
        } while (roop);
        return "0";
    }

    /**
     * 1秒ごとにDisasterのHPを減らすメソッド
     */
    public static void DamageOverTime() {
        Timer timer = new Timer(false);
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                Disaster.SetHP(-1);
                System.out.println("HP: " + Disaster.getHP());

                if (Disaster.getHP() <= 0) {
                    timer.cancel();
                    DisasterDead();
                }
            }
        };
        timer.schedule(task, 0, 1000);
    }

    public static void DisasterDead() {
        //scan.nextline()の処理の途中でscan.close()が入ると、nextlineの処理終了後にcloseするようです。
        //scan.close();
        
        System.out.println(DisasterName + "は死亡した");
        System.exit(0);
    }
}
