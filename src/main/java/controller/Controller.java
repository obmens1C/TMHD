package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    public Button Exit;

    @FXML
    public void buttonExitMainScene(ActionEvent actionEvent) {
        System.exit(0);
    }

}
