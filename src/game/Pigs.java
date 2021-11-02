package game;

import java.util.Locale;

public class Pigs {
    private String name;
    private String rank;
    private int hp;
    private boolean isAlive = true;
    private boolean isStunned = false;

    //constructor
    public Pigs(String Name, String Rank){
        name = Name;
        rank = Rank;
        setStaringHp(rank);
    }
    //Getter
    public String getName(){
        return name;
    }
    public String getRank(){
        return rank;
    }
    //Setter
    public void setPigName(String newName){
        name = newName;
    }
    public void setPigRank(String newRank) { rank = newRank; }
    public void setHp(int x){
        hp = x;
    }
    public void setAlive(boolean status){
        isAlive = status;
    }

    //methods
    public void setStaringHp(String currentRank){
        if (currentRank.toLowerCase(Locale.ROOT).equals("grenadier")){
            hp = 120;
        }
        if (currentRank.toLowerCase(Locale.ROOT).equals("paratrooper")){
            hp = 130;
        }
        if (currentRank.toLowerCase(Locale.ROOT).equals("medic") || currentRank.toLowerCase(Locale.ROOT).equals("pyrotech") || currentRank.toLowerCase(Locale.ROOT).equals("sniper")){
            hp = 140;
        }
        if (currentRank.toLowerCase(Locale.ROOT).equals("engineer")){
            hp = 150;
        }

    }
    public boolean isAlive(){
        return isAlive;
    }
    public boolean isStunned(){
        return isStunned;
    }
    public void tranquilized(){
        isStunned = true;
    }
    public void damageHp(int x){
        hp = hp-x;
    }
    public void healed(){
        hp=hp+20;
        if (isStunned()==true){
            this.isStunned = false;
        }
    }
}
