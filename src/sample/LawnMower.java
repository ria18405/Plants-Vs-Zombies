package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class LawnMower extends Defender {
    public LawnMower(GridPane pane,int x,int y){
        Image img = new Image(getClass().getResourceAsStream("Pictures/lawn-mower.png"));
//        this.setLayoutX(x);
//        this.setLayoutY(y);
        this.setFitHeight(53);
        this.setFitWidth(62);
        this.setImage(img);
        GridPane.setConstraints(this, x, y); // column=1 row=1
        pane.getChildren().addAll(this);
        System.out.println("LawnMower made");
    }
    public void move(GridPane my_grid_pane) {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration((Duration.seconds(2)));
        transition.setNode(this);
        transition.setFromX(100);
        transition.setToX(500);
        transition.play();
        for (int k = 0; k < 9; k++) {
            if (this.getBoundsInParent().intersects(Level.zombiesAvailable.get(k).getBoundsInParent())) {
                System.out.println("collission detected with LAWNMOWER");
                my_grid_pane.getChildren().remove(Level.zombiesAvailable.get(k));
            }
        }
    }
}