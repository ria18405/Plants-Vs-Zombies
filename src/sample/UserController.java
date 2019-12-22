package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.nio.channels.NonReadableChannelException;

public class UserController {

    protected User u;



//    public static AnchorPane n;

    @FXML
    protected TextField username;

//    protected static String user;


//    @FXML
    protected void NewUser(){
        String name=username.getText();
        User player = new User(name);
        this.u=player;

    }
  @FXML
    protected void startgame(ActionEvent event) throws IOException {
        NewUser();
        Parent x = FXMLLoader.load(getClass().getResource("Levels.fxml"));
        Scene y = new Scene((x));
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();
        Serialise.serialize(this.u);

    }
    @FXML
    protected void mainscreen(ActionEvent event) throws IOException
    {
        Parent x = FXMLLoader.load(getClass().getResource("ss.fxml"));
        Scene y = new Scene((x));
        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        theWindow.setScene(y);
        theWindow.show();
    }

}