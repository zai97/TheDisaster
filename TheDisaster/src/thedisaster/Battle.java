package thedisaster;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author C0116168
 */
public class Battle {

    static Scanner scan = new Scanner(System.in);
    static boolean end = false;

    public static void main(String[] args) {
        String str = "";
        int damage = 0;

        do {
            System.out.println("状況を番号で選択してください");
            System.out.println("1.敵の行動  2.主人公の行動  9.ボスの行動  0.終了");

            str = scan.nextLine();

            switch (str) {
                case "1":
                    System.out.println("敵の行動!");
                    damage = Damage("ENEMY");
                    System.out.print("主人公に " + damage + " のダメージ!▼");

                    scan.nextLine();
                    System.out.println("");
                    break;

                case "2":
                    System.out.println("主人公の行動!");
                    damage = Damage("DISASTER");
                    System.out.print("敵に " + damage + " のダメージ!▼");

                    scan.nextLine();
                    System.out.println("");
                    break;

                case "9":
                    System.out.println("グリムゲルデの行動!");
                    String grimAi = GRIMGERDEAI();
                    System.out.print("グリムゲルデは " + grimAi + " を行った!");

                    if (grimAi.equals("物理攻撃")) {
                        damage = Damage("GRIMGERDEPhysical");
                    } else if (grimAi.equals("魔法攻撃")) {
                        damage = Damage("GRIMGERDEMagic");
                    } else {
                        System.out.print("▼");

                        scan.nextLine();
                        System.out.println("");
                        break;
                    }
                    System.out.println("");
                    System.out.print("主人公に " + damage + " のダメージ!▼");

                    scan.nextLine();
                    System.out.println("");
                    break;

                case "0":
                    end = true;
                    break;

                default:
                    System.out.println("半角数字1文字で正しく入力してください\n");
                    break;
            }

        } while (!end);
    }

    public static int Damage(String move) {
        Random rand = new Random();

        switch (move) {
            case "ENEMY":
                int ENEMYAttack = rand.nextInt(100);
                return ENEMYAttack;

            case "DISASTER":
                int DISASTERAttack = rand.nextInt(7999) + 2000;
                return DISASTERAttack;

            case "GRIMGERDEPhysical":
                int GRIMGERDEPhysicalAttack = rand.nextInt(100) + 200;
                return GRIMGERDEPhysicalAttack;

            case "GRIMGERDEMagic":
                int GRIMGERDEMagicAttack = rand.nextInt(100) + 100;
                return GRIMGERDEMagicAttack;
        }
        return -1;
    }

    public static String GRIMGERDEAI() {
        Random rand = new Random();
        int grimAi = rand.nextInt(99) + 1;

        if (grimAi <= 33) {
            return "物理攻撃";
        } else if (grimAi >= 67) {
            return "物理無効";
        } else {
            return "魔法攻撃";
        }
    }
}
