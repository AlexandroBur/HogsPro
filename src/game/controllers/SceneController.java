package game.controllers;

import game.models.Game;
import game.models.Pigs;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

// This class just handles scene changes and what date is passed
public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public SceneController(){

    }

    public void switchToSceneMenu(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("../xmlLayouts/menu.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void switchToSceneGameView(ActionEvent e, Game gameMenu, List<Pigs> ListPigs) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../xmlLayouts/gameView.fxml"));
        root = loader.load();
        GameViewController GVController = loader.getController();
        GVController.setGame(gameMenu);
        GVController.setPigsList(ListPigs);
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
