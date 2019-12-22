package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.Random;

public class Sunflower extends Plant
{
	@FXML
	protected float releaseTime;
	int pos_X;
	int pos_Y;

	public Sunflower(Pane pane, GridPane my_gridPane, int x, int y){
		this.pos_X=x;
		this.pos_Y=y;
		Image img = new Image(getClass().getResourceAsStream("Pictures/sunflowerfinal.png"));
//		this.setLayoutX(x);
//		this.setLayoutY(y);
		this.setFitHeight(53);
		this.setFitWidth(62);
		this.setImage(img);
//		GridPane.setConstraints(this, x, y); // column=2 row=0
//		my_gridPane.getChildren().addAll(this);

//		pane.getChildren().add(this);
		releaseSun(pane,my_gridPane,x,y);



	}

	public void releaseSun(Pane pane,GridPane my_gridPane, int x, int y){
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(8), ev -> {
			Sun releasingsun=new Sun(pane,my_gridPane,this.pos_X,this.pos_Y);

			releasingsun.setOnMouseClicked(event -> {
				System.out.println("SUN CLICKED");
				Level.token_collected+=50;
//				my_gridPane.getChildren().removeIf(node -> GridPane.getRowIndex(node) == x);
				my_gridPane.getChildren().remove(releasingsun);

				System.out.println("Level "+Level.token_collected);
			});

		}));

		timeline.setCycleCount(15);
		timeline.play();

	}


}