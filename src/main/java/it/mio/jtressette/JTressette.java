package it.mio.jtressette;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class JTressette extends Application{
    
    public void start(Stage stage){
        stage.setTitle("JTressette");
       
        Label label = new Label("Giochiamo a Tressette!");
        Scene scene = new Scene(label,400,400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main( String[] args ){
        launch(args);
    }
}
