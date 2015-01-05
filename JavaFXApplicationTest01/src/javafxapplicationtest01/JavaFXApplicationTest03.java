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
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Shun2
 */
public class JavaFXApplicationTest03 extends Application {
    
    //FXMLのフィールド
    @FXML TextArea textArea01;
    @FXML TextField textField01;
    
    /**
     * スタートメソッド.
     * @param stage ステージ
     */
    @Override
    public void start(Stage stage) {
        // FXMLファイルからPaneを取得する
        try {
            Pane pane = (Pane)FXMLLoader.load(getClass().getResource("fxmlTest03.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXApplicationTest03.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    protected void doAction(ActionEvent ev){
        String text01 = textField01.getText();
        textArea01.setText(text01);
    }
    
    /**
     * メインメソッド.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
