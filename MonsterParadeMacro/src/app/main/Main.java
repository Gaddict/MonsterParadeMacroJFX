package app.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("モンスターパレードマクロ");
        
    	// FXMLファイルをロード
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        
        // 表示内容を設定
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        // 表示
        primaryStage.show();
    }
}