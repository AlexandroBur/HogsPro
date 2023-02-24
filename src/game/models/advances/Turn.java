package game.models.advances;
import game.models.Pigs;

import java.util.List;

public class Turn {
    private int turnNumber;
    private Pigs activePig;
    private List<PigsAction> actions;

    public Turn(int currentTurnNumber, Pigs currentActivePig){
        turnNumber = currentTurnNumber;
        activePig = currentActivePig;
    }
}
