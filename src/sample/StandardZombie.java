package sample;

import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class StandardZombie extends Zombie{

    protected boolean life;
    protected int pos;
//    protected int attackVal=100;

    public StandardZombie(Pane pane, GridPane my_gridPane){

        this.life=true;
        System.out.println("Standard zombie formed");
        Image img = new Image(getClass().getResourceAsStream("Pictures/zombie_normal.gif"));
        Random rand=new Random();
        this.setFitHeight(78);
        this.setFitWidth(91);
        this.setImage(img);
        int y = rand.nextInt((5 - 1) + 1) + 1;
        this.pos=y;
        GridPane.setConstraints(this, 6, y); // column=2 row=0
        my_gridPane.getChildren().add(this);
//        this.setLayoutX(429);s
//        this.setLayoutY(238);
//        pane.getChildren().add(this);

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), ev -> {collision(my_gridPane);    }));
        timeline.setCycleCount(20);
        timeline.play();


    }

    protected void collision(GridPane my_gridPane) {
        for (int i = 1; i < 7; i++) {
//                System.out.println(Level3Controller.Lanes[i][this.pos]);
            if (Level3Controller.Lanes[i][this.pos] != null) {
                System.out.println(Level3Controller.Lanes[i][this.pos]);
                if (this.getBoundsInParent().intersects(Level3Controller.Lanes[i][this.pos].getBoundsInParent())) {
                    System.out.println("collission detected");
                    System.out.println(Level3Controller.Lanes[i][this.pos].getClass().getName());

                    if (Level3Controller.Lanes[i][this.pos].getClass().getName().equals("sample.Walnut")) {
                        System.out.println("heyyyaa");
//                            SequentialTransition seqTransition = new SequentialTransition(this.transition, new PauseTransition(Duration.minutes(0.5)));
//                            seqTransition.play();
//                            try {
//                                TimeUnit.SECONDS.sleep(1);
//                            }
//                            catch (Exception InterruptedException)
//                            {
//                                System.out.println("Exception caught");
//                            }
                        my_gridPane.getChildren().remove(Level3Controller.Lanes[i][this.pos]);
                    }

                    if (Level3Controller.Lanes[i][this.pos].getClass().getName().equals("sample.PeaShooter")) {
//                            System.out.println("heyyyaa");
//                            SequentialTransition seqTransition = new SequentialTransition(this.transition, new PauseTransition(Duration.minutes(0.5)));
//                            seqTransition.play();
//                            this.transition.stop();
//                            try {
////                                TimeUnit.SECONDS.sleep(2);
//                            }
//                            catch (Exception InterruptedException)
//                            {
//                                System.out.println("Exception caught");
//                            }

                        my_gridPane.getChildren().remove(this);
                    }

                    if (Level3Controller.Lanes[i][this.pos].getClass().getName().equals("sample.CherryBomb"))
                    {
//                        Level3Controller.Lanes[i][this.pos].blast(my_gridPane);
                        my_gridPane.getChildren().remove(this);
                        my_gridPane.getChildren().remove(Level3Controller.Lanes[i][this.pos]);


                    }

//                        if (Level3Controller.Lanes[i][this.pos].getClass().getName().equals("sample.CherryBomb")) {
////                            System.out.println("heyyyaa");
////                            SequentialTransition seqTransition = new SequentialTransition(this.transition, new PauseTransition(Duration.minutes(0.5)));
////                            seqTransition.play();
////                            this.transition.stop();
//                            try {
//                                TimeUnit.SECONDS.sleep(2);
//                            }
//                            catch (Exception InterruptedException)
//                            {
//                                System.out.println("Exception caught");
//                            }
//                            Level3Controller.Lanes[i][this.pos].blast();
//
//                            my_gridPane.getChildren().remove(this);
//                        }


//
                }
            }

        }

//        ///////////////////////LAWN MOWERS

        for (int j = 1; j < 5; j++) {

            if (this.getBoundsInParent().intersects(Level.lmowers.get(j).getBoundsInParent())) {
                System.out.println("collission detected with LAWNMOWER");
                Level.lmowers.get(j).move(my_gridPane);
                my_gridPane.getChildren().remove(this);

            }
        }
    }

//    public void collision(Plant p) {
//        if (a.getBoundsInLocal().intersects(b.getBoundsInLocal())) {
//            b.setY(-100);
//            score++;
//        }
//    }
}