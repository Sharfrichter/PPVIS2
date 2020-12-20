package sample.UI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AuthorizationWindow {
    private static String testLogin="Alex";
    private static String testPassword="0001";
    public AuthorizationWindow(MainWindow window) {
        log.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(login.getText(0,login.getLength()).equals(testLogin)&&password.getText(0,password.getLength()).equals(testPassword)){
                    window.isAuthorisided=true;
                    stage.close();
                }else{

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Wrong password or login");
                    alert.show();
                }


            }
        });
        data.setSpacing(10);
        data.setLayoutX(130);
        data.setLayoutY(100);
        root.getChildren().add(data);
        stage.setScene(new Scene(root,400,400));
        stage.show();
    }

    Group root = new Group();
    Stage stage = new Stage();
    TextField login = new TextField("login");
    TextField password = new TextField("password");
    Button log = new Button("Log in");
    VBox data = new VBox(login,password,log);


}
