/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationtest01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Shun2
 */
public class JavaFXApplicationTest01 extends Application {
    
    /**
     * スタートメソッド.
     * @param stage ステージ
     */
    @Override
    public void start(Stage stage) {
        
        // ボタンの設定
        Button button = new Button();
        button.setText("Say 'Hello World'");
        button.setOnAction((ActionEvent)-> {
                System.out.println("Hello World!");
        });
        
        // ステージの設定
        StackPane root = new StackPane();
        root.getChildren().add(button);
        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * メインメソッド.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
