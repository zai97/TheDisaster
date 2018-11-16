/*
 * 佐藤瑠星 & ザイダトゥル 共同
 */
package thedisaster;
/**
 *
 * @author user
 */
public class item {
    private String name;
    private int PlusHP;
    
    public item(String n, int h) {
        this.name = n;
        this.PlusHP = h;
    }
    
    public int getlow_item(){
        return PlusHP;
    }
    /*    public void setlow_item(int low_item){
    this.low_item=low_item;
    }
    public int getmed_item(){
    return med_item;
    }
    public void setmed_item(int med_item){
    this.med_item=med_item;
    }
    public int gethigh_item(){
    return high_item;
    }
    public void sethigh_item(int high_item){
    this.high_item=high_item;
    }*/
       
       private int knife=10;
       
       public int getknife(){
           return knife;   
       }
       public void setknife(int knife){
           this.knife=knife;
       }
    
}
