package thedisaster;

import java.util.Scanner;
import static thedisaster.TheDisaster.*;

/*
 * Story.java
 * ストーリーの内容がここにまとまっています。
 * @author プログラム:立野, ストーリー:山口
 */
public class Story {

    public static void Openning() {
        System.out.println(""
                + "※このゲームではフルスクリーンを推奨しています\n"
                + "※最大化、あるいはF11キーでフルスクリーンにすることで、よりゲームを楽しめます▼");
        scan.nextLine();

        System.out.print(""
                + "遠い昔、地球にとある災害が生まれた\n"
                + "その災害は人々に様々な災いをもたらした\n"
                + "人々は天使と協力をすること災害に立ち向かった\n"
                + "長い戦いの末、人間たちと天使は戦いに勝ち\n"
                + "災害は地下のダンジョンに封印されました。\n"
                + "そして長い年月が流れ…▼\n");
        scan.nextLine();

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
        scan.nextLine();
    }

    public static void Tutorial() {
        System.out.println("\n"
                + "ようやく目覚めたか、私は" + DisasterName + "…\n"
                + "この世界における貴様だ。▼");
        scan.nextLine();

        System.out.println(""
                + "私はかつてこの世界に災いをもたらしこのダンジョンに封印された存在らしい。\n"
                + "らしいというのは、現状私は名前を奪われてしまっている。▼");
        scan.nextLine();

        System.out.println(""
                + "災害や化け物にとって名前を奪われるということは存在そのものが不安定になってしまうということだ。\n"
                + "そこで私は私自身の存在を観測してくれる”決意”を持った存在を待ち続けていた。▼");
        scan.nextLine();

        System.out.println(""
                + "私がまた災害として存在する為にだ。\n"
                + "私は力があるが存在がない。貴様は決意ができるがこの世界では無力でしかない。▼");
        scan.nextLine();

        System.out.println(""
                + "またこのダンジョンでは私の復活を望まない奴らが私を狙ってきている。\n"
                + "このダンジョンで封印される寸前に目覚められたのは奇跡でしかないだろう。▼");
        scan.nextLine();

        System.out.println(""
                + "私が殺しこれから殺そうとする連中はただの人間だ。\n"
                + "私は殺せる。微塵の躊躇も無く、一片の後悔も無く鏖殺できる　この私は災害だから。▼");
        scan.nextLine();

        System.out.println(""
                + "行動は私が代わろう。戦闘も私が代わろう。五感に関しても私が伝えよう。\n"
                + "だが行動を決断するのはお前の”決意”だ。▼");
        scan.nextLine();

        System.out.println(""
                + "逃げたいならこの画面を消してこの世界から去ればいい！\n"
                + "さあどうする!!" + DisasterName + "よ！▼");
        scan.nextLine();

        System.out.println("……▼");
        scan.nextLine();

        System.out.println("……▼");
        scan.nextLine();

        System.out.println(""
                + "よく消さなかったな、それでいい。私たちで" + DisasterName + "だ。\n"
                + "さあ誰に命令されているかもわかっていない哀れな兵が来たぞ。▼");
        scan.nextLine();

        System.out.println("私たち…" + DisasterName + "の初陣だ。▼");
        scan.nextLine();
    }

    public static void TutorialBattleAfter() {
        System.out.println(""
                + "所詮人間なんてこんなものか。\n"
                + "こんな無謀な戦いに先陣を切らされるということは物好きか役立たずだろう。▼");
        scan.nextLine();

        System.out.println(""
                + "まあその人間に封印されかけていて1秒ごとに1ダメージを受けているというのが現状の私か…むなしいものだな。\n"
                + "次へ進もう。▼");
    }
    public static void choice1(){
         System.out.println(""
                + "このダンジョンでは昔ながらのダンジョンみたいに\n"
                + "武器や回復アイテムが落ちているだろう▼");
        scan.nextLine();
        System.out.println(""
                + "本来はどちらもいただきたいが、封印があるため時間が惜しい片方だけを取ることにしよう。\n"
                + "どちらを選ぶのかは貴様にゆだねる。▼");
        scan.nextLine();
        System.out.println(""
                + "このダンジョンには他にも武器があるが持てるのは一つだけだ。\n"
                + "それまでに武器を持っていたら武器を取り換えた時点で捨ててしまう。▼");
        scan.nextLine();
        System.out.println(""
                + "今回の武器はナイフか。\n"
                + "さあナイフと回復アイテムどちらを選ぶ？▼");
        scan.nextLine();
    }
    public static void 810(){
        System.out.println("……▼");
        scan.nextLine();
        
        System.out.println(""
                + "???「入って、どうぞ」\n"
                + "なんだこいつは…私を倒そうとしてるようには見えないが…、むしろ歓迎している…？▼");
        scan.nextLine();
        
        System.out.println(""
                + "???「アイスティーしかなかったんだけどいいかな？」\n"
                + "いや、私はいらない▼");
        scan.nextLine();
        
        System.out.println(""
                + "???「まずうちさぁ、武器・・・あんだけど・・・持ってかない？」\n"
                + "なんだこいつ、さっきから会話が繋がっている気がしない…。▼");
        scan.nextLine();
        
        System.out.println(""
                + "RPGのNPCと話している気分だ。\n"
                + "???「ホラ、見ろよ！見ろよ！ホラ」▼");
        scan.nextLine();
        
        System.out.println(""
                + "おもちゃのナイフがある\n"
                + "どうする？▼");
        scan.nextLine();
        
        System.out.println(""
                + "家を出た。\n"
                + "なんだったんだあいつは…?▼");
        scan.nextLine();
    }
    public static void stage1(){
        System.out.println(""
                + "エクスシア「どうやら抜け駆けは失敗したらしい。」\n"
                + "スローネ「嗚呼、どちらが先に封印するのか賭けていたのに。この場合どうするよ？」▼");
        scan.nextLine();
        System.out.println(""
                + "エクスシア「知ったことか。引き分けなんて考えてもいない。」\n"
                + "ほぅ、どうやら世界を救うメサイア様は自信に満ち溢れているな。▼");
        scan.nextLine();
        
        System.out.println(""
                + "いや、過信に溺れていると言うべきか？\n"
                + "エクスシア「それはお互い様だろう？」▼");
        scan.nextLine();
        
        System.out.println(""
                + "ほぅ？何故そう宣う？\n"
                + "エクスシア「お前は何分、いや何秒であいつらを殺った？４０か？２０か？」▼");
        scan.nextLine();
        
        System.out.println(""
                + "スローネ「あいつらを殺ることは蟻を殺すようだったろう？\n"
                + "容易であり造作もない行為だったろう？\n"
                + "そしてお前の前に立つ虫けらを同じように屠る気でいる。違うのか？」▼");
        scan.nextLine();
        
        System.out.println(""
                + "そうだと言ったら？\n"
                + "どうせ貴様らも同じ道を辿る。▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「その発言が証拠だ。\n"
                + "生憎、おいそれと死んでしまってはあいつらに、大事な飲み仲間にヴァルハラで顔向けできない。」▼");
        scan.nextLine();
        System.out.println(""
                + "スローネ「お前の大切な時間をこの命の限り奪い、あいつらへの土産話としよう。\n"
                + "酒の肴にはもってこいだ。」▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「掛け金の行方もその時話し合おうじゃないか。」\n"
                + "スローネ「賛成。」▼");
        scan.nextLine();
        
        System.out.println(""
                + "来るぞ。\n"
                + "構えろ!▼");
        scan.nextLine();
    }
    public static void stage1After(){
        System.out.println(""
                + "啖呵を切った割にはあっけないものだな。\n"
                + "もう終わりか？▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「だとよ…どう思う？…」\n"
                + "スローネ「ハハ…こいつは向こうで笑い話にしかならないな…」▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「まぁ…捨て駒なりに時間は稼げただろ？…」\n"
                + "スローネ「そうだな…こちとら団体戦だ…目の前の悪魔が此処で失った数秒に…後で泣いてくれることを祈るね…」▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「ハッ…違ぇねぇ…」\n"
                + "次に行くぞ。▼");
        scan.nextLine();
        
        System.out.println(""
                + "そろそろ要領は掴んだだろう。\n"
                + "貴様のやることは何ら変わることはない。▼");
        scan.nextLine();
    }
    public static void stage2(){
    }
    public static void stage2After(){
    }
    public static void choice2{ 
    }
    public static void choice3(){
    }
    public static void stage3(){
    }
    public static void stage3After(){
    }
    public static void security(){
    }
   　public static void lastBattle(){
    }
    public static void lastBattleAfter(){
    }
    public static void epilogue(){
    }
    public static void Special victory(){
    }
}
