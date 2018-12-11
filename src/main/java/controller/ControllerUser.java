package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.NationalLocale;

public class ControllerUser {
    NationalLocale nationalLocale;

    @FXML
    private Label fieldID;
    @FXML
    private TextField fieldUserName, userSurname, fieldUserPassword, fieldUserPasswordConfirm;
    @FXML
    private ComboBox comboBoxUserDepartment;
    @FXML
    private Button buttonUserBack, buttonUserSave;

    @FXML
    public void onActionButtonBackUser(ActionEvent event) {
        Stage stage = (Stage) buttonUserBack.getScene().getWindow();
        stage.close();
    }

    public void setNationalLocale(NationalLocale nationalLocale) {
        this.nationalLocale = nationalLocale;
    }
}
