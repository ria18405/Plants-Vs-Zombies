package sample;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class BucketZombie extends Zombie {
    protected boolean life;
    protected int pos;

    public BucketZombie(Pane pane, GridPane my_gridPane) {
        Image img = new Image(getClass().getResourceAsStream("Pictures/bucket.png"));
        this.setFitHeight(78);
        this.setFitWidth(91);
        this.setImage(img);
        GridPane.setConstraints(this, 6, 1);
        my_gridPane.getChildren().add(this);

    }

    public void collision(GridPane my_gridPane) {
        for (int j = 1; j < 6; j++) {

            if (this.getBoundsInParent().intersects(Level.lmowers.get(j).getBoundsInParent())) {
                System.out.println("collission detected with LAWNMOWER");
                Level.lmowers.get(j).move(my_gridPane);
                my_gridPane.getChildren().remove(this);

            }
        }
        for (int i = 1; i < 7; i++) {

            if (Level3Controller.Lanes[i][this.pos] != null) {
                System.out.println(Level3Controller.Lanes[i][this.pos]);
                if (this.getBoundsInParent().intersects(Level3Controller.Lanes[i][this.pos].getBoundsInParent())) {
                    System.out.println("collission detected");
                    System.out.println(Level3Controller.Lanes[i][this.pos].getClass().getName());

                    if (Level3Controller.Lanes[i][this.pos].getClass().getName().equals("sample.Walnut")) {
                        System.out.println("heyyyaa");
                        my_gridPane.getChildren().remove(Level3Controller.Lanes[i][this.pos]);
                    }

                    if (Level3Controller.Lanes[i][this.pos].getClass().getName().equals("sample.PeaShooter")) {
//
                        my_gridPane.getChildren().remove(this);
                    }
                }

            }
        }
    }
}