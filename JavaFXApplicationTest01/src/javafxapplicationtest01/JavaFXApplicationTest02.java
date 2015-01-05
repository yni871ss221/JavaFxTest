/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplicationtest01;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Shun2
 */
public class JavaFXApplicationTest02 extends Application {
    
    /**
     * スタートメソッド.
     * @param stage ステージ
     */
    @Override
    public void start(Stage stage) {
        // FXMLファイルからPaneを取得する
        try {
            Pane pane = (Pane)FXMLLoader.load(getClass().getResource("fxmlTest.fxml"));
            Scene scene = new Scene(pane,200,100);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXApplicationTest02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * メインメソッド.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
