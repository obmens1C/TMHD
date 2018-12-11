import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.NationalLocale;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainApp extends Application {

    NationalLocale nationalLocale;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        NationalLocale LocaleUSA = new NationalLocale(0, "en", Locale.ENGLISH, new Image("/img/united-states.png"));
        NationalLocale LocaleRUS = new NationalLocale(1, "ru", new Locale("ru"), new Image("/img/russia.png"));
        setNationalLocale(LocaleUSA);

        try {
            String FXML_FILE = "/fxml/mainscene.fxml";
            String I18N_LOCALE = "i18n/mainscene";

            FXMLLoader loader = new FXMLLoader();

            ResourceBundle resourceBundle = ResourceBundle.getBundle(I18N_LOCALE, nationalLocale.getLocale());
            loader.setResources(resourceBundle);

            Parent root = loader.load(getClass().getResourceAsStream(FXML_FILE));
            stage.setTitle(resourceBundle.getString("mainscene.Title"));
            stage.setScene(new Scene(root));
            Controller controller = loader.getController();
            controller.setNationalLocale(nationalLocale);
            stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setNationalLocale(NationalLocale nationalLocale) {
        this.nationalLocale = nationalLocale;
    }
}