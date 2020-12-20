package sample.UI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.data.Pupil;
import sample.dataManager.PupilDB;

public class PupilWindow {
    public PupilWindow() {
       stage.setScene(new Scene(root,800,600));
       stage.show();
    }


    Stage stage = new Stage();
    ObservableList<Pupil> pupilTableList= FXCollections.observableArrayList();
    TableView<Pupil> pupilTableView = new TableView(pupilTableList);
    Button addButton = new Button("Add");
    Button change = new Button("Change");
    Button remove = new Button("Remove");
    VBox root = new VBox(addButton,change,remove,pupilTableView );
    PupilDB pupilDB = new PupilDB();
}
