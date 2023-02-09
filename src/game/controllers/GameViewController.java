package game.controllers;


import game.models.Game;
import game.models.Pigs;
import game.models.Pointer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class GameViewController implements Initializable {
    private Parent root;
    //Game TestGame = new Game("AxBy94","Adb95","Uncle Ham Hogs","Piggystroicka", "Uppstream");
    private Pointer ObjPointer;
    //Pigs Pig11 = new Pigs("Sushi", "Sapper");
    //Getting info from MenuController
    //MenuController menuController =  new MenuController();
    private Game CurrentGame;
    private List<Pigs> InGamePigs;

    //Turn label
    @FXML
    Label currentTurn;

    public void displayCurrentTurn(Label currentTurn) {
        int currentTurnValue = CurrentGame.getCurrentTurn();
        currentTurn.setText("Current Turn : " + currentTurnValue );
    }

    //Map Name Label
    @FXML
    Label mapName;
    public void displayCurrentMapName(Label mapName){
        mapName.setText(CurrentGame.getMapName());
        if(CurrentGame.getMapName() == null){
            mapName.setText("No Map Selected");
        }
    }

    @FXML
    Button StartBtn;

    //P1 Label
    @FXML
    Label P1Name;
    public void displayCurrentPlayer1(Label P1Name){
        P1Name.setText((CurrentGame.getPlayer1()));
    }
    //P1 TeamName Label
    @FXML
    Label P1TeamL;
    public void displayCurrentPlayer1Team(Label P1TeamL){
        P1TeamL.setText((CurrentGame.getPlayer1Team()));
    }

    //P2 Label
    @FXML
    Label P2Name;
    public void displayCurrentPlayer2(Label P2Name){
        P2Name.setText((CurrentGame.getPlayer2()));
    }

    //P2 TeamName Label
    @FXML
    Label P2TeamL;
    public void displayCurrentPlayer2Team(Label P2TeamL){
        P2TeamL.setText((CurrentGame.getPlayer2Team()));
    }

    //Pig1.1 Labels & img
    @FXML
    Label Pig11Name;
    public void displayCurrentPig11Name(Label Pig11Name) { Pig11Name.setText(InGamePigs.get(0).getName());}

    @FXML
    Label Pig11Rank;
    public void displayCurrentPig11Rank(Label Pig11Rank) { Pig11Rank.setText(InGamePigs.get(0).getRank());}
    //Pig1.2 Labels & img
    @FXML
    Label Pig12Name;
    public void displayCurrentPig12Name(Label Pig12Name) { Pig12Name.setText(InGamePigs.get(1).getName());}

    @FXML
    Label Pig12Rank;
    public void displayCurrentPig12Rank(Label Pig12Rank) { Pig12Rank.setText(InGamePigs.get(1).getRank());}
    //Pig1.3 Labels & img
    @FXML
    Label Pig13Name;
    public void displayCurrentPig13Name(Label Pig13Name) { Pig13Name.setText(InGamePigs.get(2).getName());}

    @FXML
    Label Pig13Rank;
    public void displayCurrentPig13Rank(Label Pig13Rank) { Pig13Rank.setText(InGamePigs.get(2).getRank());}
    //Pig1.4 Labels & img
    @FXML
    Label Pig14Name;
    public void displayCurrentPig14Name(Label Pig14Name) { Pig14Name.setText(InGamePigs.get(3).getName());}
    @FXML
    Label Pig14Rank;
    public void displayCurrentPig14Rank(Label Pig14Rank) { Pig14Rank.setText(InGamePigs.get(3).getRank());}
    //Pig1.5 Labels & img
    @FXML
    Label Pig15Name;
    public void displayCurrentPig15Name(Label Pig15Name) { Pig15Name.setText(InGamePigs.get(4).getName());}

    @FXML
    Label Pig15Rank;
    public void displayCurrentPig15Rank(Label Pig15Rank) { Pig15Rank.setText(InGamePigs.get(4).getRank());}

    //Pig2.1 Labels & img
    @FXML
    Label Pig21Name;
    public void displayCurrentPig21Name(Label Pig21Name) { Pig21Name.setText(InGamePigs.get(5).getName());}

    @FXML
    Label Pig21Rank;
    public void displayCurrentPig21Rank(Label Pig21Rank) { Pig21Rank.setText(InGamePigs.get(5).getRank());}
    //Pig1.2 Labels & img
    @FXML
    Label Pig22Name;
    public void displayCurrentPig22Name(Label Pig22Name) { Pig22Name.setText(InGamePigs.get(6).getName());}

    @FXML
    Label Pig22Rank;
    public void displayCurrentPig22Rank(Label Pig22Rank) { Pig22Rank.setText(InGamePigs.get(6).getRank());}
    //Pig2.3 Labels & img
    @FXML
    Label Pig23Name;
    public void displayCurrentPig23Name(Label Pig23Name) { Pig23Name.setText(InGamePigs.get(7).getName());}

    @FXML
    Label Pig23Rank;
    public void displayCurrentPig23Rank(Label Pig23Rank) { Pig23Rank.setText(InGamePigs.get(7).getRank());}
    //Pig2.4 Labels & img
    @FXML
    Label Pig24Name;
    public void displayCurrentPig24Name(Label Pig24Name) { Pig24Name.setText(InGamePigs.get(8).getName());}
    @FXML
    Label Pig24Rank;
    public void displayCurrentPig24Rank(Label Pig24Rank) { Pig24Rank.setText(InGamePigs.get(8).getRank());}
    //Pig1.5 Labels & img
    @FXML
    Label Pig25Name;
    public void displayCurrentPig25Name(Label Pig25Name) { Pig25Name.setText(InGamePigs.get(9).getName());}

    @FXML
    Label Pig25Rank;
    public void displayCurrentPig25Rank(Label Pig25Rank) { Pig25Rank.setText(InGamePigs.get(9).getRank());}
    @FXML
    Button AddTurnBtn;
    //Rip Img
    @FXML
    Image ripImage = new Image(getClass().getResourceAsStream("../img/Rip.png"));

    @FXML
    ImageView Pig11Img;
    public void displayRipPig11(){
        Pig11Img.setImage(ripImage);
        InGamePigs.get(0).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(0,true);
    }
    @FXML
    ImageView Pig12Img;

    public void displayRipPig12(){
        Pig12Img.setImage(ripImage);
        InGamePigs.get(1).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(1,true);
    }
    @FXML
    ImageView Pig13Img;

    public void displayRipPig13(){
        Pig13Img.setImage(ripImage);
        InGamePigs.get(2).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(2,true);
    }
    @FXML
    ImageView Pig14Img;

    public void displayRipPig14(){
        Pig14Img.setImage(ripImage);
        InGamePigs.get(3).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(3,true);
    }
    @FXML
    ImageView Pig15Img;

    public void displayRipPig15(){
        Pig15Img.setImage(ripImage);
        InGamePigs.get(4).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(4,true);
    }
    @FXML
    ImageView Pig21Img;

    public void displayRipPig21(){
        Pig21Img.setImage(ripImage);
        InGamePigs.get(5).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(0,false);
    }
    @FXML
    ImageView Pig22Img;

    public void displayRipPig22(){
        Pig22Img.setImage(ripImage);
        InGamePigs.get(6).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(1,false);
    }
    @FXML
    ImageView Pig23Img;

    public void displayRipPig23(){
        Pig23Img.setImage(ripImage);
        InGamePigs.get(7).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(2,false);
    }
    @FXML
    ImageView Pig24Img;

    public void displayRipPig24(){
        Pig24Img.setImage(ripImage);
        InGamePigs.get(8).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(3,false);
    }
    @FXML
    ImageView Pig25Img;

    public void displayRipPig25(){
        Pig25Img.setImage(ripImage);
        InGamePigs.get(9).setAlive(false);
        ObjPointer.pointerRemoveFromLineUp(4,false);
    }
    @FXML
    ToggleGroup Start = new ToggleGroup();
    @FXML
    RadioButton P1Starts;
    @FXML
    RadioButton P2Starts;

    // Define active RadioButton and Init new Pointer
    public void definePointer(){
        if(P1Starts.isSelected() == true){
            ObjPointer = new Pointer(true);
        }
        else if(P2Starts.isSelected() == true){
            ObjPointer = new Pointer(false);
        }
        else{
            currentTurn.setText("Plz select starting player");
        }
        P1Starts.setVisible(false);
        P2Starts.setVisible(false);
        AddTurnBtn.setVisible(true);
    }

    //Circle Shaped Pointer
    @FXML
    Circle turnPointer;
    //start position of pointer
    public void setStarAndNextLayoutP(Circle turnPointer, Game currentGame){
        ObjPointer.setNextPoint(currentGame);
        turnPointer.setLayoutX(ObjPointer.getCurrentPointLayoutX());
        turnPointer.setLayoutY(ObjPointer.getCurrentPointLayoutY());
    }
    //Setters used by the fxml loader to pas info from MenuController to GameViewController
    public void setGame(Game usableGame){
        CurrentGame =  usableGame;
    }
    public void setPigsList(List<Pigs> usablePigs){
        InGamePigs = usablePigs;
    }


    // function called by button
    // start Game

    public void startGame(){
        definePointer();
        //display game info
        displayCurrentMapName(mapName);
        displayCurrentPlayer1(P1Name);
        displayCurrentPlayer2(P2Name);
        displayCurrentPlayer1Team(P1TeamL);
        displayCurrentPlayer2Team(P2TeamL);
        //Display left line up
        displayCurrentPig11Name(Pig11Name);
        displayCurrentPig11Rank(Pig11Rank);
        displayCurrentPig12Name(Pig12Name);
        displayCurrentPig12Rank(Pig12Rank);
        displayCurrentPig13Name(Pig13Name);
        displayCurrentPig13Rank(Pig13Rank);
        displayCurrentPig14Name(Pig14Name);
        displayCurrentPig14Rank(Pig14Rank);
        displayCurrentPig15Name(Pig15Name);
        displayCurrentPig15Rank(Pig15Rank);
        //Display right line up
        displayCurrentPig21Name(Pig21Name);
        displayCurrentPig21Rank(Pig21Rank);
        displayCurrentPig22Name(Pig22Name);
        displayCurrentPig22Rank(Pig22Rank);
        displayCurrentPig23Name(Pig23Name);
        displayCurrentPig23Rank(Pig23Rank);
        displayCurrentPig24Name(Pig24Name);
        displayCurrentPig24Rank(Pig24Rank);
        displayCurrentPig25Name(Pig25Name);
        displayCurrentPig25Rank(Pig25Rank);
        setPigsPortrait();
        StartBtn.setVisible(false);
        addTurn();
    }

    // next Turn called by button
    public void addTurn(){
        CurrentGame.addTurn();
        displayCurrentTurn(currentTurn);
        //To do questo sistema di controllo non fuinziona
        if(ObjPointer.otherLineUp.chekIfEmpty() == true || ObjPointer.startingPlayerLineUp.chekIfEmpty() == true){
            currentTurn.setText("The game is over");
        } else {
            setStarAndNextLayoutP(turnPointer, CurrentGame);
        }
    }

    //Sets the correct Pig Img based on team
    public void setPigsPortrait(){
        switch (CurrentGame.getPlayer1Team()) {
            case "Tommy's Trotters":
                Pig11Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig1Green.png")));
                Pig12Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig2Green.png")));
                Pig13Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig3Green.png")));
                Pig14Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig4Green.png")));
                Pig15Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig5Green.png")));
                break;
            case "Garlic Grunts":
                Pig11Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig1Blue.png")));
                Pig12Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig2Blue.png")));
                Pig13Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig3Blue.png")));
                Pig14Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig4Blue.png")));
                Pig15Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig5Blue.png")));
                break;
            case "Sow-A-Krauts":
                Pig11Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig1Black.png")));
                Pig12Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig2Black.png")));
                Pig13Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig3Black.png")));
                Pig14Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig4Black.png")));
                Pig15Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig5Black.png")));
                break;
            case "Sushi Swine":
                Pig11Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig1Yellow.png")));
                Pig12Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig2Yellow.png")));
                Pig13Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig3Yellow.png")));
                Pig14Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig4Yellow.png")));
                Pig15Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig5Yellow.png")));
                break;
            case "Uncle Ham's Hogs":
                Pig11Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig1SkyBlue.png")));
                Pig12Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig2SkyBlue.png")));
                Pig13Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig3SkyBlue.png")));
                Pig14Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig4SkyBlue.png")));
                Pig15Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig5SkyBlue.png")));
                break;
            case "Piggystroika":
                Pig11Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig1Red.png")));
                Pig12Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig2Red.png")));
                Pig13Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig3Red.png")));
                Pig14Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig4Red.png")));
                Pig15Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig5Red.png")));
                break;
            case "Mardy Pigs":
                Pig11Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig1Purple.png")));
                Pig12Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig2Purple.png")));
                Pig13Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig3Purple.png")));
                Pig14Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig4Purple.png")));
                Pig15Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig5Purple.png")));
                break;
        }
        switch (CurrentGame.getPlayer2Team()) {
            case "Tommy's Trotters":
                Pig21Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig1Green.png")));
                Pig22Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig2Green.png")));
                Pig23Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig3Green.png")));
                Pig24Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig4Green.png")));
                Pig25Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Green/Pig5Green.png")));
                break;
            case "Garlic Grunts":
                Pig21Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig1Blue.png")));
                Pig22Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig2Blue.png")));
                Pig23Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig3Blue.png")));
                Pig24Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig4Blue.png")));
                Pig25Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Blue/Pig5Blue.png")));
                break;
            case "Sow-A-Krauts":
                Pig21Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig1Black.png")));
                Pig22Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig2Black.png")));
                Pig23Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig3Black.png")));
                Pig24Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig4Black.png")));
                Pig25Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Black/Pig5Black.png")));
                break;
            case "Sushi Swine":
                Pig21Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig1Yellow.png")));
                Pig22Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig2Yellow.png")));
                Pig23Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig3Yellow.png")));
                Pig24Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig4Yellow.png")));
                Pig25Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Yellow/Pig5Yellow.png")));
                break;
            case "Uncle Ham's Hogs":
                Pig21Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig1SkyBlue.png")));
                Pig22Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig2SkyBlue.png")));
                Pig23Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig3SkyBlue.png")));
                Pig24Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig4SkyBlue.png")));
                Pig25Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/SkyBlue/Pig5SkyBlue.png")));
                break;
            case "Piggystroika":
                Pig21Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig1Red.png")));
                Pig22Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig2Red.png")));
                Pig23Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig3Red.png")));
                Pig24Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig4Red.png")));
                Pig25Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Red/Pig5Red.png")));
                break;
            case "Mardy Pigs":
                Pig21Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig1Purple.png")));
                Pig22Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig2Purple.png")));
                Pig23Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig3Purple.png")));
                Pig24Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig4Purple.png")));
                Pig25Img.setImage(new Image(getClass().getResourceAsStream("../img/Pigs/Purple/Pig5Purple.png")));
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        P1Starts.setToggleGroup(Start);
        P2Starts.setToggleGroup(Start);
        AddTurnBtn.setVisible(false);
    }
}
