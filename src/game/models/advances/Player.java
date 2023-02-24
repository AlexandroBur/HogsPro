package game.models.advances;

import game.models.Pigs;

import java.util.List;

public class Player {
    private String nickName;
    private Team selectedTeam;
    private List<Pigs> lineUp;

    Player(String nick, Team currentlySelectedTeam, List<Pigs> currentLineUp){
        this.nickName = nick;
        this.selectedTeam = currentlySelectedTeam;
        this.lineUp = currentLineUp;
    }


}
