package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LevelController {

    public static Scene scene;

    @FXML
    protected void BackGame(ActionEvent event) throws IOException {

//    System.out.println("Hello World");
        Parent x = FXMLLoader.load(getClass().getResource("ss.fxml"));
        Scene y = new Scene((x));
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();
    }
    @FXML
    protected void level_3(ActionEvent event) throws IOException {

        Parent x = FXMLLoader.load(getClass().getResource("gamepage2.fxml"));
        Scene y = new Scene((x));
//        scene=y;
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();

    }

    @FXML
    protected void level_4(ActionEvent event) throws IOException {

        Parent x = FXMLLoader.load(getClass().getResource("Level4.fxml"));
        Scene y = new Scene((x));
//        scene=y;
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();

    }

    @FXML
    protected void level_1(ActionEvent event) throws IOException {

        Parent x = FXMLLoader.load(getClass().getResource("Level1.fxml"));
        Scene y = new Scene((x));
//        scene=y;
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();

    }

    @FXML
    protected void level_2(ActionEvent event) throws IOException {

        Parent x = FXMLLoader.load(getClass().getResource("Level2.fxml"));
        Scene y = new Scene((x));
//        scene=y;
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();

    }

}
