package sample.UI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.data.Employee;
import sample.dataManager.EmployeeDB;

import java.util.Date;

public class EmployeeWindow {
    public EmployeeWindow() {
        createEmployeeTable();
        stage.setScene(new Scene(root,1000,1000));
        stage.show();
    }

    Stage stage = new Stage();

    Button addButton = new Button("Add");
    Button change = new Button("Change");
    Button remove = new Button("Remove");
    Button showContracts = new Button("Contracts");
    Button medEx = new Button("Med exam");
    ObservableList<Employee> employeeTableList= FXCollections.observableArrayList(new Employee("John Smith"));
    TableView<Employee> employeeTableView = new TableView(employeeTableList);
    VBox root = new VBox(addButton,change,remove,employeeTableView );
    EmployeeDB employeeDB = new EmployeeDB();
    public void createEmployeeTable(){

        TableColumn<Employee, Integer> idColumn = new TableColumn<>("Id");
        idColumn.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("id"));

        TableColumn<Employee, String> nameColumn = new TableColumn<>("Full name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("employeeFullName"));
        TableColumn<Employee, String> contactsColumn = new TableColumn<>("Contacts");

        TableColumn<Employee, String> positionColumn = new TableColumn<>("Position");



        TableColumn<Employee, Date> contractColumn = new TableColumn<>("Contract");

        TableColumn<Employee, Integer> contractTermColumn = new TableColumn<>("Contract term");

        TableColumn<Employee, Integer>  medExaminationColumn = new TableColumn<>("Med examination");

        TableColumn<Employee, Double>  rateColumn = new TableColumn<>("Rate");

        TableColumn<Employee, Integer>  experience = new TableColumn<>("Experience");
        this.employeeTableView.getColumns().add(idColumn);
        this.employeeTableView.getColumns().add(nameColumn);
        this.employeeTableView.getColumns().add(contactsColumn);
        this.employeeTableView.getColumns().add(positionColumn);
        this.employeeTableView.getColumns().add(contractColumn);
        this.employeeTableView.getColumns().add(contractTermColumn);
        this.employeeTableView.getColumns().add(medExaminationColumn);
        this.employeeTableView.getColumns().add(rateColumn);
        this.employeeTableView.getColumns().add(experience);


    }
}
