package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public SceneController(){

    }

    public void switchToSceneMenu(ActionEvent e) throws IOException{
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        scene = new Scene(root);
        stage.show();
    }


    public void switchToSceneGameView(ActionEvent e, Game gameMenu, List<Pigs> ListPigs) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("gameView.fxml"));
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
