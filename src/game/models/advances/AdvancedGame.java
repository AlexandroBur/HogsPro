package game.models.advances;

public class AdvancedGame {
    private Player player1;
    private Player player2;
    private Battle battle;
    private IniziativeQueue iniziativeQueue;
    private StartingPlayer startingPlayer;
    private int turnsPlayed = 0;
    private Boolean isGameOver = false;
    private int timer;
    private int maxTimerValue;

    // Costruttore
    public AdvancedGame (Player p1, Player p2, int gameTimerMaxInSeconds){
        player1 = p1;
        player2 = p2;
        maxTimerValue = gameTimerMaxInSeconds;
    }

}
