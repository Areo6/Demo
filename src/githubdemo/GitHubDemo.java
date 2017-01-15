/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author eubule
 */
public class GitHubDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        Label hallo=new Label("Hey there");
        btn.setText("Say 'Hello World'");
        btn.setOnAction(evt->
                System.out.println("Hello World!")
            
        );
        
        StackPane root = new StackPane();
        root.getChildren().addAll(hallo,btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
