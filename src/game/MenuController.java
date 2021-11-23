package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class MenuController implements Initializable {
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
    public String[] MardyPiPigs = {"Ade", "Fil", "Simon", "Jake", "Andy", "Ricki", "Philip", "Mark"};

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
        CbNamePig21.getItems().addAll(ToUseArray);
        CbNamePig22.getItems().addAll(ToUseArray);
        CbNamePig23.getItems().addAll(ToUseArray);
        CbNamePig24.getItems().addAll(ToUseArray);
        CbNamePig25.getItems().addAll(ToUseArray);
    }

    public void deleteChoiceBoxContent(){
        CbNamePig11.getItems().remove(0, 8);
        CbNamePig12.getItems().remove(0, 8);
        CbNamePig13.getItems().remove(0, 8);
        CbNamePig14.getItems().remove(0, 8);
        CbNamePig15.getItems().remove(0, 8);
        CbNamePig21.getItems().remove(0, 8);
        CbNamePig22.getItems().remove(0, 8);
        CbNamePig23.getItems().remove(0, 8);
        CbNamePig24.getItems().remove(0, 8);
        CbNamePig25.getItems().remove(0, 8);
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
    Label ErrorLabel;

    public void testStart(){
        if(CbNamePig11.getItems().isEmpty() == false && CbNamePig21.getItems().isEmpty() == false){
            deleteChoiceBoxContent();
        } else {
            StartNewGameBtn.setLayoutX(530);
            StartNewGameBtn.setLayoutY(100);
            StartNewGameBtn.setText("Click Me When Ready");
        }
        setPig10ChoiceBox();
        setPig20ChoiceBox();
        setRanksChoiceBox();
        NewGameButton.setText("If you need to change team press me again");
    }

    public void startGame(ActionEvent event){
        //TO DO :: aggiungere un try catch di modo che appaia un messaggio di errore se gli oggetti non sono completi
        try {
            ThisGame = new Game(Player1NameField.getText(), Player2NameField.getText(), CbPlayer1Team.getValue(), CbPlayer2Team.getValue());
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
        } catch(NullPointerException e){
            testStart();
            ErrorLabel.setLayoutX(520);
            ErrorLabel.setLayoutY(300);
            ErrorLabel.setText("Enter all the Pig and Player information correctly");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        GamesPig.add(0,Pig11);
        GamesPig.add(1,Pig12);
        GamesPig.add(2,Pig13);
        GamesPig.add(3,Pig14);
        GamesPig.add(4,Pig15);
        GamesPig.add(5,Pig21);
        GamesPig.add(6,Pig22);
        GamesPig.add(7,Pig23);
        GamesPig.add(8,Pig24);
        GamesPig.add(9,Pig25);
        // Go to Scene:: GameView
        try {
            sceneController.switchToSceneGameView(event);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public List<Pigs> getGamePigs(){
        return GamesPig;
    }
    public Game getThisGame(){
        return ThisGame;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CbPlayer1Team.getItems().addAll(TeamsList);
        CbPlayer2Team.getItems().addAll(TeamsList);
    }

    // trovare sistema per passare tutti i dati raccolti
    // passare i dati alla gameView tramite istanza di questa view.

}


