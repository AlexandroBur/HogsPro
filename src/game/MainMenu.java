package game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
            Parent root = (Parent)FXMLLoader.load(getClass().getResource("menu.fxml"));
            primaryStage.setTitle("Hogs Pro");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
