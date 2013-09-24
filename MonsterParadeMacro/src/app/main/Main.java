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
        primaryStage.setTitle("�����X�^�[�p���[�h�}�N��");
        
    	// FXML�t�@�C�������[�h
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        
        // �\�����e��ݒ�
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        
        // �\��
        primaryStage.show();
    }
}