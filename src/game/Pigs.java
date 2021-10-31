package game;

public class Pigs {
    private int Id;
    private String name;
    private String rank;
    private int hp;
    private boolean isAlive = true;
    private boolean isStunned = false;

    public boolean isAlive(){
        return isAlive;
    }
    public boolean isStunned(){
        return isStunned;
    }
    public void tranquilized(){
        isStunned = true;
    }
    public void setHp(int x){
        hp = x;
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
    public void setPigName(String newName){
        name = newName;
    }
}
