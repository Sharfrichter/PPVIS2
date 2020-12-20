package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Arrays;

public class Main  {




    public static void main(String[] args) throws Exception {
        Injector injector = new Injector();
        injector.run();


        //launch(args);
    }
}
