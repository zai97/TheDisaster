/*
 * 山口雄也
 */
package thedisaster;

import javafx.scene.input.KeyCode;

/**
 *
 * @author c0116272
 */
public class Character {

    //フィールド
    private String name;    //キャラクター名
    private int HP;      //体力
    private String Wepon; //武器の名前

    //コンストラクタ
    public Character(String n, int h, String w) {
        this.name = n;
        this.HP = h;
        this.Wepon = w;
    }

//フィールドnameを返すメソッド
    public String getName() {
        return name;
    }

    //フィールドHPを返すメソッド
    public int getHP() {
        return HP;
    }

    //フィールドweponを返すメソッド
    public String getWepon() {
        return Wepon;
    }

    //HPをセットするメソッド
    public void SetHP(int H) {
        this.HP += H;
    }

    //Weponをセットするメソッド
    public void SetWepon(String W) {
        this.Wepon = W;
    }
}
