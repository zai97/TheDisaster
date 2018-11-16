/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedisaster;

/**
 *
 * @author C0116168
 */
public class Dungeon {

    private String roomName; //部屋名
    private int enemyNumber; //敵の数
    private String enemyDrop; //敵が何を落とすか
    private String item; //部屋に落ちている回復アイテム
    private String Wepon; //部屋に落ちている武器

    public Dungeon(String roomName, int enemyNumber, String enemyDrop, String item, String Wepon) {
        this.roomName = roomName;
        this.enemyNumber = enemyNumber;
        this.enemyDrop = enemyDrop;
        this.item = item;
        this.Wepon = Wepon;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getEnemyNumber() {
        return enemyNumber;
    }

    public String getEnemyDrop() {
        return enemyDrop;
    }

    public String getItem() {
        return item;
    }

    public String getWepon() {
        return Wepon;
    }

}
