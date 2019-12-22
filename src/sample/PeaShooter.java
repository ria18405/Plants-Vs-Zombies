package sample;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.*;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class PeaShooter extends Plant
{
	protected double shootSpeed;
	protected Pea pea;
	int pos_Y;
	int pos_X;

	public PeaShooter(Pane pane, GridPane my_gridPane, int x, int y) {
//      Image img = new Image("file:src/sample/Pictures/peashooter_gif.gif", 50, 50, false, false);

		Image img = new Image(getClass().getResourceAsStream("Pictures/PeaShooter.png"));
		this.pos_Y=y;
		this.pos_X=x;
//		this.setLayoutX(100);
//		this.setLayoutY(this.pos_Y);
		this.setFitHeight(53);
		this.setFitWidth(62);
		this.setImage(img);

		pane.getChildren().add(this);
		System.out.println("peaShooter made");
		this.shoot(pane,my_gridPane);

	}
	public void shoot(Pane pane,GridPane my_grid_pane){
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(8), ev -> {
//			Random rand=new Random();
//      int y=rand.nextInt((350-70)+1)+70;
			int y=this.pos_Y;
//			int x=160;
			int x=this.pos_X;
			Pea trypea=new Pea(pane,my_grid_pane,x,y);
			TranslateTransition peatransition=new TranslateTransition();
			peatransition.setDuration((Duration.seconds(3)));
			peatransition.setNode(trypea);
			peatransition.setFromX(100);
			peatransition.setToX(500);
			peatransition.setToY(this.pos_Y);
//			GridPane.setConstraints(trypea, 6, y);
			peatransition.play();


		}));
		timeline.setCycleCount(15);
		timeline.play();

	}
}