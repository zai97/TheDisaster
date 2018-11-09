
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Normalizer;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * 
 */
public class TheDisaster {

    static boolean end = false;
    static String DisasterName = "";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Opening();
        Tutorial();
        //Command();
    }

    public static void Opening() {
        try {
            System.out.println(""
                    + "※このゲームではフルスクリーンを推奨しています\n"
                    + "※最大化、あるいはF11キーでフルスクリーンにすることで、よりゲームを楽しめます▼");
            br.readLine();

            System.out.print(""
                    + "遠い昔、地球にとある災害が生まれた\n"
                    + "その災害は人々に様々な災いをもたらした\n"
                    + "人々は天使と協力をすること災害に立ち向かった\n"
                    + "長い戦いの末、人間たちと天使は戦いに勝ち\n"
                    + "災害は地下のダンジョンに封印されました。\n"
                    + "そして長い年月が流れ…▼\n");
            br.readLine();

            System.out.println(""
                    + "┌---------------------------------------------------------------------------------------------------------------------------┐\n"
                    + "｜                                    ■■■■■■■■  ■            ■    ■■■■■■                                    ｜\n"
                    + "｜                                          ■          ■            ■    ■                                              ｜\n"
                    + "｜                                          ■          ■            ■    ■                                              ｜\n"
                    + "｜                                          ■          ■            ■    ■                                              ｜\n"
                    + "｜                                          ■          ■■■■■■■■    ■■■■■                                      ｜\n"
                    + "｜                                          ■          ■            ■    ■                                              ｜\n"
                    + "｜                                          ■          ■            ■    ■                                              ｜\n"
                    + "｜                                          ■          ■            ■    ■                                              ｜\n"
                    + "｜                                          ■          ■            ■    ■■■■■■                                    ｜\n"
                    + "｜                                                                                                                          ｜\n"
                    + "｜                                                  ■                                                                      ｜\n"
                    + "｜■■■■■■        ■        ■■■■          ■■          ■■■■    ■■■■■■■■  ■■■■■■    ■■■■■    ｜\n"
                    + "｜■        ■■      ■      ■      ■■        ■■        ■      ■■        ■          ■              ■      ■■  ｜\n"
                    + "｜■          ■■    ■      ■                ■■  ■      ■                  ■          ■              ■        ■  ｜\n"
                    + "｜■            ■    ■      ■■              ■    ■      ■■                ■          ■              ■      ■■  ｜\n"
                    + "｜■            ■    ■          ■■■        ■    ■■        ■■■          ■          ■■■■■      ■■■■      ｜\n"
                    + "｜■            ■    ■              ■■    ■■■■■■            ■■        ■          ■              ■    ■■    ｜\n"
                    + "｜■          ■■    ■                ■    ■        ■              ■        ■          ■              ■      ■■  ｜\n"
                    + "｜■        ■■      ■      ■        ■  ■■        ■■  ■        ■        ■          ■              ■        ■  ｜\n"
                    + "｜■■■■■          ■        ■■■■    ■            ■    ■■■■          ■          ■■■■■■    ■        ■■｜\n"
                    + "└---------------------------------------------------------------------------------------------------------------------------┘\n"
                    + "\n");
            System.out.println("PRESS ENTER▼");
            br.readLine();

            boolean nameYN = false;
            do {
                System.out.println("災害(主人公)の名前を入力してください");
                DisasterName = br.readLine();

                System.out.println(DisasterName + " でよろしいですか? (y/n)");

                String line = "";
                //Normalizerを使うと全角を半角に(正しくはUnicode準拠に)してくれる。検索すると正しい情報がわかるよ
                while ((line = Normalizer.normalize(br.readLine(), Normalizer.Form.NFKC)) != null) {
                    if (line.equals("y")) {
                        nameYN = true;
                        break;
                    } else if (line.equals("n")) {
                        break;
                    } else {
                        System.out.println("y/nで入力してください");
                    }
                }
            } while (!nameYN);
        } catch (IOException e) {
            System.out.println("入力エラー:" + e.getMessage());
        }
    }

    public static void Tutorial() {
        try {
            System.out.println("\n"
                    + "ようやく目覚めたか、私は" + DisasterName + "…\n"
                    + "この世界における貴様だ。▼");
            br.readLine();

            System.out.println(""
                    + "私はかつてこの世界に災いをもたらしこのダンジョンに封印された存在らしい。\n"
                    + "らしいというのは、現状私は名前を奪われてしまっている。▼");
            br.readLine();

            System.out.println(""
                    + "災害や化け物にとって名前を奪われるということは存在そのものが不安定になってしまうということだ。\n"
                    + "そこで私は私自身の存在を観測してくれる”決意”を持った存在を待ち続けていた。▼");
            br.readLine();

            System.out.println(""
                    + "私がまた災害として存在する為にだ。\n"
                    + "私は力があるが存在がない。貴様は決意ができるがこの世界では無力でしかない。▼");
            br.readLine();

            System.out.println(""
                    + "またこのダンジョンでは私の復活を望まない奴らが私を狙ってきている。\n"
                    + "このダンジョンで封印される寸前に目覚められたのは奇跡でしかないだろう。▼");
            br.readLine();

            System.out.println(""
                    + "私が殺しこれから殺そうとする連中はただの人間だ。\n"
                    + "私は殺せる。微塵の躊躇も無く、一片の後悔も無く鏖殺できる　この私は災害だから。▼");
            br.readLine();

            System.out.println(""
                    + "行動は私が代わろう。戦闘も私が代わろう。五感に関しても私が伝えよう。\n"
                    + "だが行動を決断するのはお前の”決意”だ。▼");
            br.readLine();

            System.out.println(""
                    + "逃げたいならこの画面を消してこの世界から去ればいい！\n"
                    + "さあどうする!!" + DisasterName + "よ！▼");
            br.readLine();

            System.out.println("……▼");
            br.readLine();

            System.out.println("……▼");
            br.readLine();

            System.out.println(""
                    + "よく消さなかったな、それでいい。私たちで"+ DisasterName + "だ。\n"
                    + "さあ誰に命令されているかもわかっていない哀れな兵が来たぞ。▼");
            br.readLine();

            System.out.println("私たち…" + DisasterName + "の初陣だ。▼");
            br.readLine();
            
            System.out.println("ここまでしか出来てない!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (IOException e) {
            System.out.println("入力エラー:" + e.getMessage());
        }
    }

    public static void Command() {
        String str = "";
        int damage = 0;

        do {
            System.out.println("状況を番号で選択してください");
            System.out.println("1.敵の行動  2." + DisasterName + "の行動  9.ボスの行動  0.終了");

            try {
                str = br.readLine();

                switch (str) {
                    case "1":
                        System.out.println("敵の行動!");
                        damage = Damage("ENEMY");
                        System.out.print("主人公に " + damage + " のダメージ!▼");

                        br.readLine();
                        System.out.println("");
                        break;

                    case "2":
                        System.out.println("主人公の行動!");
                        damage = Damage("DISASTER");
                        System.out.print("敵に " + damage + " のダメージ!▼");

                        br.readLine();
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

                            br.readLine();
                            System.out.println("");
                            break;
                        }
                        System.out.println("");
                        System.out.print("主人公に " + damage + " のダメージ!▼");

                        br.readLine();
                        System.out.println("");
                        break;

                    case "0":
                        end = true;
                        break;

                    default:
                        System.out.println("半角数字1文字で正しく入力してください\n");
                        break;
                }
            } catch (IOException e) {
                System.out.println("入力エラー:" + e.getMessage());
                end = true;
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
