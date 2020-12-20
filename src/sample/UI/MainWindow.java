package sample.UI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainWindow {
    public MainWindow() {
        authorizationButton.setLayoutX(200);
        root.getChildren().add(dataType);
        root.getChildren().add(authorizationButton);
        stage.setScene(new Scene(root, 1280, 720));
        stage.show();
        authorizationButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                new AuthorizationWindow(obj);
            }
        });
        pupilsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(isAuthorisided){
                    PupilWindow window = new PupilWindow();
                }
                else {
                    Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Authorise");
                    alert.show();
                }

            }
        });
        employeeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(isAuthorisided){
                    EmployeeWindow window = new EmployeeWindow();
                }else {
                    Alert alert=new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Authorise");
                    alert.show();
                }
            }
        });

    }

    MainWindow obj = this;
    public boolean isAuthorisided=false;
    Group root = new Group();
    Button authorizationButton = new Button("authorization");
    Button pupilsButton = new Button("Pupils");
    Button employeeButton = new Button("Employee");
    HBox dataType = new HBox(pupilsButton, employeeButton);
    Stage stage = new Stage();






}
