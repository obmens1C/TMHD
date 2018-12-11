package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.NationalLocale;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {
    NationalLocale nationalLocale;
    ObservableList<ImageView> options = null;

    NationalLocale LocaleUSA = new NationalLocale(0, "en", Locale.ENGLISH, new Image("/img/united-states.png"));
    NationalLocale LocaleRUS = new NationalLocale(1, "ru", new Locale("ru"), new Image("/img/russia.png"));

    @FXML
    public Button buttonExit, buttonNewUser;
    @FXML
    public ComboBox<ImageView> changeLanguage = new ComboBox<>();

    @FXML
    public void onActionButtonExitMainScene(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void onActionChangeLanguage(ActionEvent actionEvent) throws FileNotFoundException {

        options = FXCollections.observableArrayList(LocaleUSA.getImageView(), LocaleRUS.getImageView());
        changeLanguage.getItems().addAll(options);
    }

    @FXML
    public void onActionButtonNewUser(ActionEvent actionEvent) {
        try {
            String FXML_FILE = "/fxml/user.fxml";
            String I18N_LOCALE = "i18n/user";

            FXMLLoader loader = new FXMLLoader();

            ResourceBundle resourceBundle = ResourceBundle.getBundle(I18N_LOCALE, nationalLocale.getLocale());
            loader.setResources(resourceBundle);

            Parent root = loader.load(getClass().getResourceAsStream(FXML_FILE));
            Stage stage = new Stage();
            stage.setTitle(resourceBundle.getString("user.Title"));
            stage.setScene(new Scene(root));

            ControllerUser controllerUser = loader.getController();
            controllerUser.setNationalLocale(nationalLocale);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setNationalLocale(NationalLocale nationalLocale) {
        this.nationalLocale = nationalLocale;
    }
}
