package thedisaster;

import static thedisaster.TheDisaster.*;

/*
 * Story.java
 * ストーリーの内容がここにまとまっています。
 * @author 山口
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
    public static void senpai(){
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
        System.out.println(""
                + "マールート「キヒヒヒヒ！！崩ス者ノ登場サ！」\n"
                + "ハールート「やぁ、初めまして。災害。」▼");
        scan.nextLine();
        System.out.println(""
                + "初めまして、そしてさようなら。貴様らは私の前に立った。\n"
                + "それだけの理由で地獄に落ちる。▼");
        scan.nextLine();
        System.out.println(""
                + "マールート「堕チルヨ堕チル深淵ニ、\n"
                + "名前諸共忘レ去ラレル運命サ！」▼");
        scan.nextLine();

        System.out.println(""
                + "ハールート「そう殺戮に急がなくてもいいだろう？\n"
                + "そんなことは最早分かりきっているんだ。」▼");
        scan.nextLine();

        System.out.println(""
                + "そうであるなら一刻も早く物言わぬ屍になれ。\n"
                + "こうしている時間が惜しい。▼");
        scan.nextLine();
        
        System.out.println(""
                + "マールート「自ラ死ニ急グガ有象無象ノ救ワレル道？」\n"
                + "ハールート「此処で１秒でも時間を費やすことが我らの勝利に近づくんだ。\n"
                + "そう簡単には心臓を止めない。来るなら来いバケモノが。」▼");
        scan.nextLine();
        
        System.out.println(""
                + "さっさと終わらせるぞ。\n"
                + "先程の奴らと同じかそれ以下だ。▼");
        scan.nextLine();


    }
    public static void stage2After(){
        System.out.println(""
                + "マールート「キヒッ…遊ビハ終ワリ？」\n"
                + "ハールート「存外儚い人生だったな…」▼");
        scan.nextLine();
        System.out.println(""
                + "分かっただろう、貴様らが何人費やそうと結末は変わらないと\n"
                + "マールート「変ワラナイ…変ワラナイ……世界ガ辿ル結末ハ…」▼");
        scan.nextLine();
System.out.println(""
                + "ハールート「それでも俺らは突破口を探す…。\n"
                + "何百何千の仲間の屍を踏み超えて進む…。かつて神に挑んだ時のように…。」▼");
        scan.nextLine();
System.out.println(""
                + "マールート「穢キ王ガ…統ベル世界…。\n"
                + "オマエニ…ハ変エラレル……？」▼");
        scan.nextLine();
        
System.out.println(""
                + "ハールート「俺たちは…一度負け、神はこの世を統べた…。今回も屍となるとしよう…。\n"
                + "しかし、お前は…最後まで勝って…いられるのか？楽しみに…しているよ……。」▼");
        scan.nextLine();
System.out.println(""
                + "愚問だったな。私達"+ DisasterName +"には敵などいない。\n"
                + "先に進むぞ。▼");
        scan.nextLine();

    }
    public static void choice2(){ 
        System.out.println(""
                + "ここには敵がいないようだな…。\n"
                + "フライパンが落ちているな。▼");
        scan.nextLine();
System.out.println(""
                + "金属で作られている割には軽いな。\n"
                + "▼");
        scan.nextLine();
System.out.println(""
                + "武器ではないが、このフライパンで殴れば相応の痛みは与えられることができるだろう。\n"
                + "しかしフライパンか…。▼");
        scan.nextLine();
System.out.println(""
                + "回復アイテムも落ちているがどちらを取るか…。\n"
                + "こんな時こそお前の出番だ。▼");
        scan.nextLine();
System.out.println(""
                + "フライパンと回復アイテムどちらを選ぶ？\n"
                + ""+ DisasterName +"にとって大事だと思う方を選んで欲しい。▼");
        scan.nextLine();
System.out.println(""
                + "どちらを取るかを決めるのはお前だ。\n"
                + ""+ DisasterName +"はどちらを選ぶ？▼");
        scan.nextLine();
    }
    public static void choice3(){
     System.out.println(""
                + "これはマスケット銃か！\n"
                + "私がいた時代には無かった武器だ。▼");
        scan.nextLine();
System.out.println(""
                + "なんで知っているのか？だと？具体的な名前は忘れたが、\n"
                + "黄色いリボン使いの少女(?)が魔法でこれを出していただろう？▼");
        scan.nextLine();
System.out.println(""
                + "このマスケット銃があれば人間であっても猛獣を倒せるだろうな。\n"
                + "こんなのが量産されでもしたら神や天使も大騒ぎだろうな。▼");
        scan.nextLine();
System.out.println(""
                + "この武器相手ではせっかく召喚した幻獣なんぞすぐに殺されてしまうだろう。\n"
                + "いやはや恐ろしい時代になったものだ。▼");
        scan.nextLine();
   System.out.println(""
                + "このマスケット銃を拾うか？\n"
                + "回復アイテムもあるがどうする？▼");
        scan.nextLine();

        System.out.println(""
                + ""+ DisasterName +"にとって大事だと思う方を選んで欲しい。\n"
                + "どちらを取るかを決めるのはお前だ。▼");
        scan.nextLine();
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
    public static void specialVictory(){
    }
}
