package game;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

import java.util.List;

public class GameViewController {
    //Game TestGame = new Game("AxBy94","Adb95","Uncle Ham Hogs","Piggystroicka", "Uppstream");
    Pointer ObjPointer = new Pointer(true);
    //Pigs Pig11 = new Pigs("Sushi", "Sapper");
    //Getting info from MenuController
    MenuController menuController =  new MenuController();
    Game TestGame = menuController.getThisGame();
    List<Pigs> InGamePigs = menuController.getGamePigs();
    Pigs Pig11 = InGamePigs.get(0);

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

    //Pig1.1 Labels & img
    @FXML
    Label Pig11Name;
    public void displayCurrentPig11Name(Label Pig11Name) { Pig11Name.setText(Pig11.getName());}

    @FXML
    Label Pig11Rank;
    public void displayCurrentPig11Rank(Label Pig11Rank) { Pig11Rank.setText(Pig11.getRank());}

    @FXML
    ImageView Pig11Img;

    @FXML
    Image ripImage = new Image(getClass().getResourceAsStream("img/Rip.jpg"));
    public void displayRipPig11(){
        Pig11Img.setImage(ripImage);
        Pig11.setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(0,true);
    }
    // background image
    @FXML
    ImageView backGrImgV;
    //@FXML  -  This code might get handy in the future
    //Image background = new Image(getClass().getResourceAsStream("img/pigbkpc.jpg"));

    //Circle Shaped Pointer
    @FXML
    Circle turnPointer;
    //start position of pointer
    public void setStarAndNextLayoutP(Circle turnPointer, Game currentGame){
        ObjPointer.setNextPoint(currentGame);
        turnPointer.setLayoutX(ObjPointer.getCurrentPointLayoutX());
        turnPointer.setLayoutY(ObjPointer.getCurrentPointLayoutY());
    }


    // function called by button
    // start Game
    public void startGame(){
        displayCurrentMapName(mapName);
        displayCurrentPlayer1(P1Name);
        displayCurrentPlayer2(P2Name);
        displayCurrentPlayer1Team(P1TeamL);
        displayCurrentPlayer2Team(P2TeamL);
        displayCurrentPig11Name(Pig11Name);
        displayCurrentPig11Rank(Pig11Rank);
        addTurn();
    }

    // next Turn called by button
    public void addTurn(){
        TestGame.addTurn();
        displayCurrentTurn(currentTurn);
        setStarAndNextLayoutP(turnPointer, TestGame);
    }

}
