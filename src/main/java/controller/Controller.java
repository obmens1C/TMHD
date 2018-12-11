package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    public Button buttonExit, buttonNewUser;
    @FXML
    public ComboBox changeLanguage;

    @FXML
    public void onActionButtonExitMainScene(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void onActionChangeLanguage(ActionEvent actionEvent) {

    }

    @FXML
    public void onActionButtonNewUser(ActionEvent actionEvent) {
        try {
            String FXML_FILE = "/fxml/user.fxml";
            String I18N_LOCALE = "i18n/user";

            FXMLLoader loader = new FXMLLoader();

            ResourceBundle resourceBundle = ResourceBundle.getBundle(I18N_LOCALE, Locale.getDefault());
            loader.setResources(resourceBundle);

            Parent root = loader.load(getClass().getResourceAsStream(FXML_FILE));
            Stage stage = new Stage();
            stage.setTitle(resourceBundle.getString("user.Title"));
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
