package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.math.*;
public class Controller implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Pane pane;
    @FXML
    private GridPane gridPane;
    @FXML
    private Label ans;
    @FXML
    private  Label origAns;
    @FXML
    private MenuButton function;
    @FXML
    private TextField que;
    @FXML
    private Button submit;

    @FXML
    private Separator s;
    @FXML
    private Label degreeL;
    @FXML
    private Label radianL;
    @FXML
    private Button convert;
    @FXML
    private TextField deg;
    @FXML
    private TextField rad;

    //Getter for que
    public TextField getQue() {
        return que;
    }
    //Setter for que
    public void setQue(TextField que) {
        this.que = que;
    }

    //getter for degree
    public TextField getDeg() {
        return deg;
    }

    //setter for degree
    public void setDeg(TextField deg) {
        this.deg = deg;
    }

    @FXML
    private void submitButtonAction(ActionEvent event) {
        try {
            String s = que.getText();
            double ans = Math.sin(Double.parseDouble(s));
            origAns.setText(String.valueOf((ans)));
        }catch(Exception e){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
            errorAlert.showAndWait();
        }
    }

    @FXML
    private void convertButtonAction(ActionEvent event) {
        try {
            String s = deg.getText();
            double ans = Math.toRadians(Double.parseDouble((s)));
            rad.setText(String.valueOf((ans)));
        }catch(Exception e){
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("Input not valid");
            errorAlert.setContentText("The size of First Name must be between 2 and 25 characters");
            errorAlert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
