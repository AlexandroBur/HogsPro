package game.controllers;

import game.models.Game;
import game.models.Pigs;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import org.controlsfx.control.SearchableComboBox;

import java.beans.EventHandler;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import java.util.ResourceBundle;


public class MenuController implements Initializable {
    //needed to change scene
    private Stage stage;
    private Scene scene;
    private Parent root;
    // TO DO :
    private SceneController sceneController = new SceneController();
    private Game ThisGame;
    private Pigs Pig11;
    private Pigs Pig12;
    private Pigs Pig13;
    private Pigs Pig14;
    private Pigs Pig15;
    private Pigs Pig21;
    private Pigs Pig22;
    private Pigs Pig23;
    private Pigs Pig24;
    private Pigs Pig25;
    public List<Pigs> GamesPig = new ArrayList<>(10);

    // Definizione di liste con squadre e nomi dei mailaili in base alla squadra
    // Lista delle squadre
    public String[] TeamsList = {"Tommy's Trotters", "Garlic Grunts", "Sow-A-Krauts", "Uncle Ham's Hogs", "Piggystroika", "Sushi Swine", "Mardy Pigs"};// Array id Stringhe con i nomi dei ranghi
    public String[] Ranks = {"Paratrooper", "Pyrotech", "Sniper", "Engineer", "Medic", "Grenadier"};
    // Array di stringhe con nomi dei maiali per ogni squadra
    public String[] UncleHamHogsPigs = {"Chucky", "Bobby-Joe", "Keanu", "Bobby-Jim", "Sly", "John-Boy", "Abraham", "Joey-Bob" };
    public String[] PiggystroikaPigs = {"Duski", "Huski", "Rimski", "Mule", "Jetski", "Snowski", "Muski", "Yehudi"};
    public String[] TommysTrotterPigs = {"Percy", "Ginger", "Basil", "Jones", "Smith", "Dem", "Monty", "Nobby"};
    public String[] GarlicGruntsPigs = {"Cochon", "Le Cont", "Porc", "Glouton", "Goinfer", "Sanglier", "M.Chien", "Gerard"};
    public String[] SowAKrautsPigs = { "Schnitzel", "Herr Kut", "Wolfie", "Lederhos", "Herman", "Schwein", "Herr Raid", "Herr Dry"};
    public String[] SushiSwinePigs = {"Sushi", "Kendo", "Shogun", "Raw Fish", "Kempo", "Tenko", "Feng Shui", "Ninja"};
    public String[] MardyPiPigs = {"Ade", "Fil", "Simon", "Jake", "Andy", "Ricki", "Philip", "Mark", "Ben", "Badders", "Izzy", "Jim", "John", "Tapper", "Sweety", "Dolly", "Paul", "Shorty", "Martin", "James", "Test" };
    public String[] Maps = { "High And Dry", "Grassy Knolls", "Pigs in Space", "Skullduggery", "Pigin'Hell","Graveyard Shift", "Ice-Flow", "You-Hillock", "Upstream", "Frost Fight", "The Lake", "Chill Hill", "Square Off", "One Way System", "Ridge Back", "Route Canal", "Pitch Invasion", "Bridge The Gap", "Canyon", "Well, Well, Well!", "Hedge Maze", "Hillbase", "Over The Top", "Pdrag" , "Death Valley", "Generated" };

    // injection FXML di tutte le menu button, label, choiceBox
    // Parte alta con info generali
    @FXML
    ChoiceBox<String> CbPlayer1Team;
    @FXML
    ChoiceBox<String> CbPlayer2Team;
    @FXML
    TextField Player1NameField;
    @FXML
    TextField Player2NameField;
    //TO DO Label e input nome player

    //Parte con le info dei Pig
    @FXML
    ChoiceBox<String> CbNamePig11;
    @FXML
    ChoiceBox<String> CbRank11;
    @FXML
    ChoiceBox<String> CbNamePig12;
    @FXML
    ChoiceBox<String> CbRank12;
    @FXML
    ChoiceBox<String> CbNamePig13;
    @FXML
    ChoiceBox<String> CbRank13;
    @FXML
    ChoiceBox<String> CbNamePig14;
    @FXML
    ChoiceBox<String> CbRank14;
    @FXML
    ChoiceBox<String> CbNamePig15;
    @FXML
    ChoiceBox<String> CbRank15;

    @FXML
    ChoiceBox<String> CbNamePig21;
    @FXML
    ChoiceBox<String> CbRank21;
    @FXML
    ChoiceBox<String> CbNamePig22;
    @FXML
    ChoiceBox<String> CbRank22;
    @FXML
    ChoiceBox<String> CbNamePig23;
    @FXML
    ChoiceBox<String> CbRank23;
    @FXML
    ChoiceBox<String> CbNamePig24;
    @FXML
    ChoiceBox<String> CbRank24;
    @FXML
    ChoiceBox<String> CbNamePig25;
    @FXML
    ChoiceBox<String> CbRank25;
    @FXML
    SearchableComboBox<String> CbMap;


    // metodi relativi agli elementi in view
    public void setPig10ChoiceBox(){
        String team = CbPlayer1Team.getValue();
        String[] ToUseArray = MardyPiPigs;
        switch (team)
        {
            case "Tommy's Trotters":
                ToUseArray = TommysTrotterPigs;
                break;
            case "Garlic Grunts":
                ToUseArray = GarlicGruntsPigs;
                break;
            case "Sow-A-Krauts":
                ToUseArray = SowAKrautsPigs;
                break;
            case "Sushi Swine":
                ToUseArray = SushiSwinePigs;
                break;
            case "Uncle Ham's Hogs":
                ToUseArray = UncleHamHogsPigs;
                break;
            case "Piggystroika":
                ToUseArray = PiggystroikaPigs;
                break;
            case "Mardy Pigs" :
                ToUseArray = MardyPiPigs;
                break;
            default :
                System.out.println("Please Select a Team");
        }
        CbNamePig11.getItems().addAll(ToUseArray);
        CbNamePig12.getItems().addAll(ToUseArray);
        CbNamePig13.getItems().addAll(ToUseArray);
        CbNamePig14.getItems().addAll(ToUseArray);
        CbNamePig15.getItems().addAll(ToUseArray);
    }
    public void setPig20ChoiceBox(){
        String team = CbPlayer2Team.getValue();
        String[] ToUseArray = MardyPiPigs; // MardyPigs is Set as a Default Option
        switch (team)
        {
            case "Tommy's Trotters":
                ToUseArray = TommysTrotterPigs;
                break;
            case "Garlic Grunts":
                ToUseArray = GarlicGruntsPigs;
                break;
            case "Sow-A-Krauts":
                ToUseArray = SowAKrautsPigs;
                break;
            case "Sushi Swine":
                ToUseArray = SushiSwinePigs;
                break;
            case "Uncle Ham's Hogs":
                ToUseArray = UncleHamHogsPigs;
                break;
            case "Piggystroika":
                ToUseArray = PiggystroikaPigs;
                break;
            case "Mardy Pigs" :
                ToUseArray = MardyPiPigs;
                break;
            default :
                System.out.println("Please Select a Team");
        }
        CbNamePig21.getItems().addAll(ToUseArray);
        CbNamePig22.getItems().addAll(ToUseArray);
        CbNamePig23.getItems().addAll(ToUseArray);
        CbNamePig24.getItems().addAll(ToUseArray);
        CbNamePig25.getItems().addAll(ToUseArray);
    }
    public void deleteChoiceBoxContent10(){
        CbNamePig11.getItems().remove(0,8);
        CbNamePig12.getItems().remove(0,8);
        CbNamePig13.getItems().remove(0,8);
        CbNamePig14.getItems().remove(0,8);
        CbNamePig15.getItems().remove(0,8);
    }
    public void deleteChoiceBoxContent20(){
        CbNamePig21.getItems().remove(0,8);
        CbNamePig22.getItems().remove(0,8);
        CbNamePig23.getItems().remove(0,8);
        CbNamePig24.getItems().remove(0,8);
        CbNamePig25.getItems().remove(0,8);
    }

    public void setRanksChoiceBox(){
        CbRank11.getItems().addAll(Ranks);
        CbRank12.getItems().addAll(Ranks);
        CbRank13.getItems().addAll(Ranks);
        CbRank14.getItems().addAll(Ranks);
        CbRank15.getItems().addAll(Ranks);
        CbRank21.getItems().addAll(Ranks);
        CbRank22.getItems().addAll(Ranks);
        CbRank23.getItems().addAll(Ranks);
        CbRank24.getItems().addAll(Ranks);
        CbRank25.getItems().addAll(Ranks);
    }

    @FXML
    Button NewGameButton;
    @FXML
    Button StartNewGameBtn;
    @FXML
    Button StartOpenCVAnalysis;
    @FXML
    Label ErrorLabel;
    @FXML
    Label infoLabel;
    @FXML
    Label LabelPig11;
    @FXML
    Label LabelPig12;
    @FXML
    Label LabelPig13;
    @FXML
    Label LabelPig14;
    @FXML
    Label LabelPig15;
    @FXML
    Label LabelPig21;
    @FXML
    Label LabelPig22;
    @FXML
    Label LabelPig23;
    @FXML
    Label LabelPig24;
    @FXML
    Label LabelPig25;

    // This method checks if the name and team of the 2 player are selected and then makes the Pigs Name/rank tag visible and the other buttons appear
    public void startPreGame(){
        // If the required field are not filled then infoLable changes
        if(Player1NameField.getText().isEmpty() || Player2NameField.getText().isEmpty() || CbPlayer1Team.getValue().isEmpty() || CbPlayer2Team.getValue().isEmpty()){
            infoLabel.setTextFill(Paint.valueOf("BLACK"));
            infoLabel.setBackground(Background.fill(Paint.valueOf("WHITE")));
        } else {
            setCenterPartVisible();
            StartNewGameBtn.setLayoutX(530);
            StartNewGameBtn.setLayoutY(100);
            StartNewGameBtn.setVisible(true);
            StartNewGameBtn.setText("Start Pen and Paper Mode");
            StartOpenCVAnalysis.setLayoutX(530);
            StartOpenCVAnalysis.setLayoutY(200);
            StartOpenCVAnalysis.setVisible(true);
            StartOpenCVAnalysis.setText("Start Analysis Mode");
            setRanksChoiceBox();
            infoLabel.setVisible(false);
            NewGameButton.setVisible(false);
        }
    }

    private Boolean isOneOfCenterPartEmpty(){
        try{
            return CbNamePig11.getValue().isEmpty()||
            CbNamePig12.getValue().isEmpty() ||
            CbNamePig13.getValue().isEmpty() ||
            CbNamePig15.getValue().isEmpty() ||
            CbNamePig21.getValue().isEmpty() ||
            CbNamePig22.getValue().isEmpty() ||
            CbNamePig23.getValue().isEmpty() ||
            CbNamePig24.getValue().isEmpty() ||
            CbNamePig25.getValue().isEmpty() ||
            CbRank11.getValue().isEmpty() ||
            CbRank12.getValue().isEmpty() ||
            CbRank13.getValue().isEmpty() ||
            CbRank14.getValue().isEmpty() ||
            CbRank15.getValue().isEmpty() ||
            CbRank21.getValue().isEmpty() ||
            CbRank22.getValue().isEmpty() ||
            CbRank23.getValue().isEmpty() ||
            CbRank24.getValue().isEmpty() ||
            CbRank25.getValue().isEmpty();
        } catch (NullPointerException e){
            return true;
        }
    }

    private void setCenterPartVisible() {
        CbNamePig11.setVisible(true);
        CbNamePig12.setVisible(true);
        CbNamePig13.setVisible(true);
        CbNamePig14.setVisible(true);
        CbNamePig15.setVisible(true);
        CbNamePig21.setVisible(true);
        CbNamePig22.setVisible(true);
        CbNamePig23.setVisible(true);
        CbNamePig24.setVisible(true);
        CbNamePig25.setVisible(true);
        CbRank11.setVisible(true);
        CbRank12.setVisible(true);
        CbRank13.setVisible(true);
        CbRank14.setVisible(true);
        CbRank15.setVisible(true);
        CbRank21.setVisible(true);
        CbRank22.setVisible(true);
        CbRank23.setVisible(true);
        CbRank24.setVisible(true);
        CbRank25.setVisible(true);
        LabelPig11.setVisible(true);
        LabelPig12.setVisible(true);
        LabelPig13.setVisible(true);
        LabelPig14.setVisible(true);
        LabelPig15.setVisible(true);
        LabelPig21.setVisible(true);
        LabelPig22.setVisible(true);
        LabelPig23.setVisible(true);
        LabelPig24.setVisible(true);
        LabelPig25.setVisible(true);
    }

    public void startGame(ActionEvent event) {
        if(isOneOfCenterPartEmpty()){
            ErrorLabel.setLayoutX(520);
            ErrorLabel.setLayoutY(300);
            ErrorLabel.setVisible(true);
            ErrorLabel.setText("Enter all the Pig and Player information correctly");
        } else {
            try {
                ThisGame = new Game(Player1NameField.getText(), Player2NameField.getText(), CbPlayer1Team.getValue(), CbPlayer2Team.getValue(), CbMap.getValue());
                Pig11 = new Pigs(CbNamePig11.getValue(), CbRank11.getValue());
                Pig12 = new Pigs(CbNamePig12.getValue(), CbRank12.getValue());
                Pig13 = new Pigs(CbNamePig13.getValue(), CbRank13.getValue());
                Pig14 = new Pigs(CbNamePig14.getValue(), CbRank14.getValue());
                Pig15 = new Pigs(CbNamePig15.getValue(), CbRank15.getValue());
                Pig21 = new Pigs(CbNamePig21.getValue(), CbRank21.getValue());
                Pig22 = new Pigs(CbNamePig22.getValue(), CbRank22.getValue());
                Pig23 = new Pigs(CbNamePig23.getValue(), CbRank23.getValue());
                Pig24 = new Pigs(CbNamePig24.getValue(), CbRank24.getValue());
                Pig25 = new Pigs(CbNamePig25.getValue(), CbRank25.getValue());
            } catch (NullPointerException e) {
                ErrorLabel.setLayoutX(520);
                ErrorLabel.setLayoutY(300);
                ErrorLabel.setText("Enter all the Pig and Player information correctly");
            } catch (Exception e) {
                System.out.println(e);
            }
            GamesPig.add(0, Pig11);
            GamesPig.add(1, Pig12);
            GamesPig.add(2, Pig13);
            GamesPig.add(3, Pig14);
            GamesPig.add(4, Pig15);
            GamesPig.add(5, Pig21);
            GamesPig.add(6, Pig22);
            GamesPig.add(7, Pig23);
            GamesPig.add(8, Pig24);
            GamesPig.add(9, Pig25);
            // Go to Scene:: GameView
            try {
                sceneController.switchToSceneGameView(event, getThisGame(), getGamePigs());
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }

    public void changeSelectionsOnComboBox10(){
        String currentTeamSelection = CbPlayer1Team.getValue();
        setPig10ChoiceBox();
        if(CbNamePig11.getItems().size() > getSizeOfTeams(currentTeamSelection)){
            deleteChoiceBoxContent10();
        }
    }

    public void changeSelectionsOnComboBox20(){
        String currentTeamSelection = CbPlayer2Team.getValue();
        setPig20ChoiceBox();
        if(CbNamePig21.getItems().size() > getSizeOfTeams(currentTeamSelection)){
            deleteChoiceBoxContent20();
        }
    }

    public int getSizeOfTeams(String teamName){
        int res = 0;
        switch (teamName) {
            case "Tommy's Trotters":
                res = TommysTrotterPigs.length;
                break;
            case "Garlic Grunts":
                res = GarlicGruntsPigs.length;
                break;
            case "Sow-A-Krauts":
                res = SowAKrautsPigs.length;
                break;
            case "Sushi Swine":
                res = SushiSwinePigs.length;
                break;
            case "Uncle Ham's Hogs":
                res = UncleHamHogsPigs.length;
                break;
            case "Piggystroika":
                res = PiggystroikaPigs.length;
                break;
            case "Mardy Pigs":
                res = MardyPiPigs.length;
                break;
            default:
                System.out.println("Somrthig's wrong in team selection");
        }
        return res;

    }

    public void startGameAnalysis(ActionEvent event){}

    public List<Pigs> getGamePigs(){
        return GamesPig;
    }
    public Game getThisGame(){
        return ThisGame;
    }

    public void printValue(Event e){
        System.out.println(e.toString());
        System.out.println(CbMap.getValue());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CbPlayer1Team.getItems().addAll(TeamsList);
        CbPlayer2Team.getItems().addAll(TeamsList);
        CbMap.getItems().addAll(Maps);
        StartNewGameBtn.setVisible(false);
    }

}


