package game;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class GameViewController {

    Game TestGame = new Game("AxBy94","Adb95","Uncle Ham Hogs","Piggystroicka", "Uppstream");
    Pointer ObjPointer = new Pointer(true);

    //Turn label
    @FXML
    Label currentTurn;

    public void displayCurrentTurn(Label currentTurn) {
        int currentTurnValue = TestGame.getCurrentTurn();
        currentTurn.setText("Current Turn : " + currentTurnValue );
    }

    //Map Name Label
    @FXML
    Label mapName;
    public void displayCurrentMapName(Label mapName){
        mapName.setText(TestGame.getMapName());
        if(TestGame.getMapName() == null){
            mapName.setText("No Map Selected");
        }
    }

    //P1 Label
    @FXML
    Label P1Name;
    public void displayCurrentPlayer1(Label P1Name){
        P1Name.setText((TestGame.getPlayer1()));
    }
    //P1 TeamName Label
    @FXML
    Label P1TeamL;
    public void displayCurrentPlayer1Team(Label P1TeamL){
        P1TeamL.setText((TestGame.getPlayer1Team()));
    }

    //P2 Label
    @FXML
    Label P2Name;
    public void displayCurrentPlayer2(Label P2Name){
        P2Name.setText((TestGame.getPlayer2()));
    }

    //P2 TeamName Label
    @FXML
    Label P2TeamL;
    public void displayCurrentPlayer2Team(Label P2TeamL){
        P2TeamL.setText((TestGame.getPlayer2Team()));
    }

    //Circle Shaped Pointer
    @FXML
    Circle turnPointer;
    //start position of pointer
    public void setStarAndNextLayoutP(Circle turnPointer){
        turnPointer.setLayoutX(ObjPointer.getCurrentPointLayoutX());
        turnPointer.setLayoutY(ObjPointer.getCurrentPointLayoutY());
        ObjPointer.setNextPoint();
    }


    // function called by button
    // start Game
    public void startGame(){
        displayCurrentMapName(mapName);
        displayCurrentPlayer1(P1Name);
        displayCurrentPlayer2(P2Name);
        displayCurrentPlayer1Team(P1TeamL);
        displayCurrentPlayer2Team(P2TeamL);
        setStarAndNextLayoutP(turnPointer);
    }

    // next Turn
    public void addTurn(){
        TestGame.addTurn();
        displayCurrentTurn(currentTurn);
        setStarAndNextLayoutP(turnPointer);
    }

}
