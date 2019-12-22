package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class LoadgameController  {

    @FXML
    protected void loadGame(ActionEvent event) throws IOException {

        System.out.println("Hello World");
//        Parent x = FXMLLoader.load(getClass().getResource("gamepage2.fxml"));
//        Scene y = new Scene((x));
//        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
//        theWindow.setScene(y);
//        theWindow.show();
    }

}


