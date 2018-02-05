/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Author: Michael Ganschow
*/
package randombianary;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RandomBianary extends Application {

    private static int HEIGHT = 1000;
    private static int WIDTH = 1000;
    public void start(Stage primaryStage) {


        GridPane pane = new GridPane();
        
        //for loop for column squares in the pane
        for (int i = 0; i < 10; i++) {
            
            //for loop for row squares in the pane
            for (int j = 0; j < 10; j++) {
                
                //Generates random 1's and 0's
                TextField text = new TextField(Integer.toString((int)(Math.random() * 2)));
                
                //sets text alignment to center
                text.setAlignment(Pos.CENTER);
                
                //adjust width of boxes to fill Width of stage(Width must be divisible by 10)
                text.setMinWidth(WIDTH / 10.0);
                text.setMaxWidth(WIDTH / 10.0);
                
                //adjusts height of boxes so it fills stage(Height must be divisible by 10)
                text.setMinHeight(HEIGHT / 10.0);
                text.setMaxHeight(HEIGHT / 10.0);
                
                //put numbers in squares
                pane.add(text, j, i);
            }
        }
        
        // Creates scene in the stage with width and height
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(WIDTH);
        primaryStage.setMinHeight(HEIGHT);
        primaryStage.setTitle("Random 1's and 0's");
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}