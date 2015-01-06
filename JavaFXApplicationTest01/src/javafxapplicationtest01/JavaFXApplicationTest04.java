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
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * ウェブビューを試してみた
 * @author Shun2
 */
public class JavaFXApplicationTest04 extends Application {
    
    /**
     * スタートメソッド.
     * @param stage ステージ
     */
    @Override
    public void start(Stage stage) {
        // FXMLファイルからPaneを取得する
        try {
            // ウェブビューのウェブエンジンにＵＲＬをセットする
            
            
            Pane pane = (Pane)FXMLLoader.load(getClass().getResource("fxmlTest04.fxml"));
            WebView webView = (WebView) pane.lookup("#webView");
            webView.getEngine().load("http://skrb.hatenablog.com/entry/20110527/p3");
            
            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXApplicationTest04.class.getName()).log(Level.SEVERE, null, ex);
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
