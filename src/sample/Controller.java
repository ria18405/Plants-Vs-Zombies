package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.Serializable;

public class Controller implements Serializable {

    @FXML
    protected void newGame(ActionEvent event) throws IOException {

        Parent x = FXMLLoader.load(getClass().getResource("NewUser.fxml"));
        Scene y = new Scene((x));
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();
    }

    @FXML
    protected void loadGame(ActionEvent event) throws IOException {

        System.out.println("Game deserialised");
        Parent x = FXMLLoader.load(getClass().getResource("Levels.fxml"));
        Scene y = new Scene((x));
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();

    }

    @FXML
    protected void levelScreen(ActionEvent event) throws IOException
    {
        Parent x = FXMLLoader.load(getClass().getResource("Levels.fxml"));
        Scene y = new Scene((x));
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();
    }
    @FXML
    protected void exitGame(ActionEvent event) throws IOException {
        System.exit(0);
    }

}


