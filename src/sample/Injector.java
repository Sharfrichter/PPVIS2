package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.UI.MainWindow;

public class Injector extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MainWindow window = new MainWindow();
    }
    public void run(){
        launch();
    }
}
