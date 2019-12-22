package sample;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class Level2 extends Level
{

    public Level2()
    {
        System.out.println("Level1 initialised");
        this.unlocked=true;
        this.lawnmower =new boolean[5];

        this.lawnmower[2]=true;

    }

    protected static void initializeLevel(Pane pane,GridPane my_grid_pane)
    {
        initialiseCharacters(pane, my_grid_pane);
        placeLawnMowers(my_grid_pane);
    }

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
            int x=rand.nextInt((150+1)-1)+200;
            Sun trysun = new Sun(pane,my_gridPane, x, 25);
            trysun.fallsun(pane,my_gridPane);
            Zombie devil=new StandardZombie(pane, my_gridPane);
            devil.move();


        }));
        timeline.setCycleCount(15);
        timeline.play();


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
//        LawnMower firstlawnMower=new LawnMower(my_grid_pane);
    }

}