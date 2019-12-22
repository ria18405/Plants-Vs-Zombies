package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.io.Serializable;

public class Level3Controller  implements Serializable {

    protected boolean plantSelected;
//    protected boolean plantPlaced;
    protected String plant_to_place;
    @FXML
    public AnchorPane acp;

    public static boolean[][] arr = new boolean[7][6];

    public static Plant[][] Lanes = new Plant[7][6];

    @FXML
    public GridPane my_gridPane;

    @FXML
    protected Button sunflower_button;

    @FXML
    protected Button peashooter_button;

    @FXML
    protected Button walnut_button;

    @FXML
    protected void sunflower_selection(ActionEvent event) throws IOException
    {
        this.plant_to_place="sunflower";
        this.plantSelected=true;
    }

    @FXML
    protected void walnut_selection(ActionEvent event) throws IOException
    {
        this.plant_to_place="walnut";
        this.plantSelected=true;
    }

    @FXML
    protected void peashooter_selection(ActionEvent event) throws IOException
    {
        this.plant_to_place="peashooter";
        this.plantSelected=true;
    }

    @FXML
    protected void exitGame(ActionEvent event) throws IOException {

//        Parent x = FXMLLoader.load(getClass().getResource("Levels.fxml"));
//        Scene y = new Scene((x));
//        Stage theWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
//        theWindow.setScene(y);
//        theWindow.show();
        System.exit(0);
    }

    @FXML
    private void handleMouseEntered(ActionEvent event){
        System.out.println("MouseEntered");
    }
//    @FXML
//    private void mouseEntered(MouseEvent e) {
//        System.out.println("Yo, I have entered the function");
//        Node source = (Node)e.getSource() ;
//        Integer colIndex = GridPane.getColumnIndex(source);
//        Integer rowIndex = GridPane.getRowIndex(source);
//        System.out.printf("Mouse entered cell [%d, %d]%n", colIndex.intValue(), rowIndex.intValue());
//    }
@FXML
protected Label label_token;
    @FXML
    private void mouseEntered(MouseEvent e) {
        label_token.setText("score "+Level.token_collected);
        System.out.println("entered Function");
        Node target = (Node) e.getTarget();
        // traverse towards root until userSelectionGrid is the parent node
        if (target != my_gridPane) {
            Node parent;
            while ((parent = target.getParent()) != my_gridPane)
            {
                target = parent;
            }
        }
        Integer colIndex = my_gridPane.getColumnIndex(target);
        Integer rowIndex = my_gridPane.getRowIndex(target);
        if (colIndex == null || rowIndex == null) {
            System.out.println("BOO");
        } else {
//            System.out.println("everyone rox");
            System.out.println("Mouse entered cell "+ colIndex.intValue()+" "+ rowIndex.intValue());
            if(this.plantSelected==true && arr[colIndex.intValue()][rowIndex.intValue()]==false)
            {
                System.out.println(this.plant_to_place+" selected to be placed");
                this.plantSelected=false;
                if (this.plant_to_place=="sunflower" && Level.token_collected>=50)
                {
                    Sunflower s = new Sunflower(acp, my_gridPane,colIndex.intValue(), rowIndex.intValue() );
                    GridPane.setConstraints(s, colIndex.intValue(), rowIndex.intValue()); // column=2 row=0
                    my_gridPane.getChildren().addAll(s);
                    arr[colIndex.intValue()][rowIndex.intValue()]=true;
                    Lanes[colIndex.intValue()][rowIndex.intValue()]=s;
//                    System.out.println("vals "+colIndex.intValue()+" "+ rowIndex.intValue() );
//                    System.out.println( Lanes[colIndex.intValue()][rowIndex.intValue()] );
                    Level.token_collected-=50;


                    sunflower_button.setDisable(true);

                    final Timeline animation = new Timeline(
                            new KeyFrame(Duration.seconds(5),
                                    new EventHandler<ActionEvent>() {
                                        @Override public void handle(ActionEvent actionEvent) {
                                            sunflower_button.setDisable(false);
                                        }
                                    }));
                    animation.setCycleCount(1);
                    animation.play();

                }

                if (this.plant_to_place=="peashooter" && Level.token_collected>=100)
                {
                    PeaShooter p = new PeaShooter(acp,my_gridPane,colIndex.intValue(), rowIndex.intValue());
                    GridPane.setConstraints(p, colIndex.intValue(), rowIndex.intValue()); // column=2 row=0
                    my_gridPane.getChildren().addAll(p);
                    arr[colIndex.intValue()][rowIndex.intValue()]=true;
                    Lanes[colIndex.intValue()][rowIndex.intValue()]=p;
//                    System.out.println("vals "+colIndex.intValue()+" "+ rowIndex.intValue() );
//                    System.out.println( Lanes[colIndex.intValue()][rowIndex.intValue()] );
                    Level.token_collected-=100;

                    peashooter_button.setDisable(true);

                    final Timeline animation = new Timeline(
                            new KeyFrame(Duration.seconds(7),
                                    new EventHandler<ActionEvent>() {
                                        @Override public void handle(ActionEvent actionEvent) {
                                            peashooter_button.setDisable(false);
                                        }
                                    }));
                    animation.setCycleCount(1);
                    animation.play();

                }

                if (this.plant_to_place=="walnut" && Level.token_collected>=25)
                {
                    Walnut w = new Walnut(acp);
                    GridPane.setConstraints(w, colIndex.intValue(), rowIndex.intValue()); // column=2 row=0
                    my_gridPane.getChildren().addAll(w);
                    arr[colIndex.intValue()][rowIndex.intValue()]=true;
                    Lanes[colIndex.intValue()][rowIndex.intValue()]=w;
                    Level.token_collected-=25;

//                    System.out.println("vals "+colIndex.intValue()+" "+ rowIndex.intValue() );
//                    System.out.println( Lanes[colIndex.intValue()][rowIndex.intValue()] );

                    walnut_button.setDisable(true);

                    final Timeline animation = new Timeline(
                            new KeyFrame(Duration.seconds(7),
                                    new EventHandler<ActionEvent>() {
                                        @Override
                                        public void handle(ActionEvent actionEvent) {
                                            walnut_button.setDisable(false);
                                        }
                                    }));
                    animation.setCycleCount(1);
                    animation.play();

                }


            }
        }
    }


    @FXML
    public void initialize() {
        Level1.initializeLevel(acp, my_gridPane);
//        my_gridPane.setGridLinesVisible(true);
        label_token.setText("score "+Level.token_collected);
    }
}



