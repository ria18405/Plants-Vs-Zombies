package sample;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class Level1 extends Level
{

	public Level1()
	{
		System.out.println("Level1 initialised");
		this.unlocked=true;
		this.lawnmower =new boolean[5];
		this.lmowers=new ArrayList<LawnMower>();

		this.lawnmower[2]=true;

	}

	protected static void initializeLevel(Pane pane,GridPane my_grid_pane)
	{
		initialiseCharacters(pane, my_grid_pane);
		placeLawnMowers(my_grid_pane);
	}
@FXML
protected Label textfield;
	public static void initialiseCharacters(Pane pane, GridPane my_gridPane)
	{
		plantsUnlocked = new ArrayList<Plant>();
		zombiesAvailable=new ArrayList<Zombie>();
//		PeaShooter firstpeashooter=new PeaShooter(pane);
//		Zombie devil=new StandardZombie(pane, my_gridPane);
//		devil.move();
//		Sunflower firstsunflower=new Sunflower(pane,my_gridPane,200,170);

//falling sun
		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(8), ev -> {
			Random rand=new Random();
			int x=rand.nextInt((200-150)+1)+150;
			Sun trysun = new Sun(pane,my_gridPane, x, 25);
			trysun.fallsun(pane,my_gridPane);
			Zombie devil=new StandardZombie(pane, my_gridPane);
			Level.zombiesAvailable.add(devil);
			devil.move();


		}));
		timeline.setCycleCount(10);
		timeline.play();
		Zombie devil_2=new BucketZombie(pane, my_gridPane);
		Level.zombiesAvailable.add(devil_2);
		devil_2.move();
		System.out.println("ZOMBIES ATE YOUR BRAIN");
//		TextField.setText("ZOMBIES ATE YOUR BRAIN");

//		System.exit(0);


//    Timer timer =new Timer();
//    TimerTask task = new TimerTask() {
//      public void run() {
//
//        for (int sunfalling = 0; sunfalling < 15; sunfalling++) {
//
//          Sun trysun = new Sun(pane, 350, 25);
//          trysun.fallsun(pane);
//
//        }
//      }
//    };

//    //kill sun
//    pane.getChildren().remove(firstsunflower.sun);

//    firstsunflower.releaseSun(pane,x,y);
		/////////////////////////////////////////////////////sunflower releasing suns/////////////////////////////////////////////////
//    final Timeline animation = new Timeline(
//        new KeyFrame(Duration.seconds(5),
//            new EventHandler<ActionEvent>() {
//              @Override public void handle(ActionEvent actionEvent) {
////                sunflower_button.setDisable(false);
//                pane.getChildren().remove(firstsunflower.sun);
//              }
//            }));
//    animation.setCycleCount(1);
//    animation.play();



	}

	public static void placeLawnMowers(GridPane my_grid_pane)
	{
		System.out.println("placeLawnMowers");

		for(int i=1;i<6;i++) {
			LawnMower firstlawnMower = new LawnMower(my_grid_pane,1,i);
//			GridPane.setConstraints(firstlawnMower, i, 1); // column=2 row=0
//			my_grid_pane.getChildren().addAll(firstlawnMower);

			lmowers.add(firstlawnMower);
		}
	}

}