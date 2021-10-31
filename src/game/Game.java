package game;



public class Game {

    private int turnsPlayed = 0;
    private String Player1;
    private String Player2;
    private String Player1Team;
    private String Player2Team;
    private String mapName = null;

    //Costruttori
    public Game(String P1, String P2, String P1Team,String P2Team){
        Player1 = P1;
        Player2 = P2;
        Player1Team = P1Team;
        Player2Team = P2Team;
    }

    public Game(String P1, String P2, String P1Team,String P2Team, String Map){
        Player1 = P1;
        Player2 = P2;
        Player1Team = P1Team;
        Player2Team = P2Team;
        mapName = Map;
    }
    // Getter
    public String getPlayer1(){
        return Player1;
    }
    public String getPlayer2(){
        return Player2;
    }
    public String getPlayer1Team(){
        return Player1Team;
    }
    public String getPlayer2Team(){
        return Player2Team;
    }
    public String getMapName(){
        return mapName;
    }
    public int getCurrentTurn(){
        return turnsPlayed;
    }
    //Setter
    public void setPlayer1(String newP1){
        Player1 = newP1;
    }
    public void setPlayer2(String newP2){
        Player2 = newP2;
    }
    public void setPlayer1Team(String newP1Team){
        Player1Team = newP1Team;
    }
    public void setPlayer2Team(String newP2Team){
        Player1 = newP2Team;
    }
    public void setMapName(String map){
        mapName = map;
    }
    public void setTurnsPlayed(int newCurrentTurn){
        turnsPlayed = newCurrentTurn;
    }
    public void addTurn(){
        turnsPlayed = turnsPlayed+1;
    }
}
