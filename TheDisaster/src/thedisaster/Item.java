/*
 * 佐藤瑠星 & ザイダトゥル 共同
 */
package thedisaster;
/**
 *
 * @author user
 */
public class Item {
    private String name; //名前
    private int value; //値
    
    /**
     * コンストラクタ
     * @param n 名前
     * @param v 値
     */
    public Item(String n, int v) {
        this.name = n; 
        this.value = v;
    }
    
    /**
     * アイテムの名前を返すメソッド
     * @return 名前
     */
    public String GetName(){
        return name;
    }

    /**
     * アイテムが保有する値を返すメソッド
     * @return 
     */
    public int GetValue(){
        return value;
    }
    
}
