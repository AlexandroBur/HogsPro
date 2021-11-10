package game;

import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    // TO DO :
    // Definizione di liste con squadre e nomi dei mailaili in base alla squadra
    List<MenuItem> TeamsList1 = Arrays.asList(new MenuItem("Tommy's Trotters"),new MenuItem("Garlic Grunts"),new MenuItem("Sow-A-Krauts"),new MenuItem("Uncle Ham's Hogs"),new MenuItem("Piggystroika"),new MenuItem("Sushi Swine"),new MenuItem("Mardy Pigs"));
    List<MenuItem> TeamsList2 = Arrays.asList(new MenuItem("Tommy's Trotters"),new MenuItem("Garlic Grunts"),new MenuItem("Sow-A-Krauts"),new MenuItem("Uncle Ham's Hogs"),new MenuItem("Piggystroika"),new MenuItem("Sushi Swine"),new MenuItem("Mardy Pigs"));
    // injection FXML di tutte le menu button, label,
    // trovare sistema per passare tutti i dati raccolti
    // passare i dati alla gameView tramite istanza di questa view.

    @FXML
    MenuButton Player1TeamMenu;
    @FXML
    MenuButton Player2TeamMenu;
    @FXML
    MenuButton pig11NameMenuB;

    public void setPig10MenuB(){
        pig11NameMenuB.getItems().addAll(TeamsList1);
    }
    public void setPig20MenuB(){

    }

    @FXML
    Button NewGameButton;

    public void testStart(){
        setPig10MenuB();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Player1TeamMenu.getItems().addAll(TeamsList1);
        Player2TeamMenu.getItems().addAll(TeamsList2);
    }

}


