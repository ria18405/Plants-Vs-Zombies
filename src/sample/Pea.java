package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;
import javafx.scene.layout.Pane;

import java.io.Serializable;
import java.util.Random;

public class Pea extends Plant implements Serializable {
    public Pea(Pane pane,GridPane my_grid_pane, int x,int y){
        Image img = new Image(getClass().getResourceAsStream("Pictures/Pea.png"));
//        this.setLayoutX(x);
//        this.setLayoutY(y);
        this.setFitHeight(12);
        this.setFitWidth(12);
        this.setImage(img);
//        pane.getChildren().add(this);
        GridPane.setConstraints(this, x, y); // column=2 row=0
        my_grid_pane.getChildren().addAll(this);
        System.out.println("New sun has been initialized");
        System.out.println("Pea is formed");
    }
//    public void shoot(){
//        TranslateTransition peatransition=new TranslateTransition();
//        peatransition.setDuration((Duration.seconds(2)));
//        peatransition.setNode(this);
//        peatransition.setFromX(-10);
//
//        peatransition.setToX(500);
//
////        peatransition.setCycleCount(10);
//        peatransition.play();
//        System.out.println("Pea is shooting");




//    }
}