package sample;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.Serializable;

public class Sun extends ImageView implements Serializable {

    public Sun(Pane pane, GridPane my_gridPane,int x, int y) {
        Image img = new Image(getClass().getResourceAsStream("Pictures/sun.png"));
//        this.setLayoutX(x);
//        this.setLayoutY(y);
        this.setFitHeight(40);
        this.setFitWidth(40);
        this.setImage(img);
        GridPane.setConstraints(this, x, y); // column=2 row=0
        my_gridPane.getChildren().addAll(this);

//        pane.getChildren().add(this);
//        System.out.println("New sun has been initialized");
    }

    public void fallsun(Pane pane,GridPane my_gridPane) {
        TranslateTransition transition=new TranslateTransition();
        transition.setDuration((Duration.seconds(15)));
        transition.setNode(this);
        transition.setFromY(-500);
//        transition.setFromX(5);
        transition.setToY(500);
        transition.play();

        this.setOnMouseClicked(event -> {
            System.out.println("SUN CLICKED");
            Level.token_collected+=50;
            my_gridPane.getChildren().remove(this);
            System.out.println("Level "+Level.token_collected);
//            label_token.setText("score "+Level.token_collected);
        });
    }
}