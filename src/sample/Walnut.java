package sample;

import javafx.scene.layout.Pane;

import javafx.scene.image.*;
public class Walnut extends Plant
{

    public Walnut(Pane pane)
    {
//      Image img = new Image("file:src/sample/Pictures/peashooter_gif.gif", 50, 50, false, false);

        Image img = new Image(getClass().getResourceAsStream("Pictures/walnut_full_life.gif"));
        this.setLayoutX(100);
        this.setLayoutY(200);
        this.setFitHeight(53);
        this.setFitWidth(62);
        this.setImage(img);
        pane.getChildren().add(this);
//		for(int i=0;i<10;i++){
//			this.pea=new Pea(pane);
//			this.pea.shoot();
//		}

        System.out.println("walnut made");

    }
}