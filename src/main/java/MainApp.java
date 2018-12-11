import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainApp extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            String FXML_FILE = "/fxml/mainscene.fxml";
            String I18N_LOCALE = "i18n/mainscene";

            FXMLLoader loader = new FXMLLoader();

            Locale locale = new Locale("ru");

            ResourceBundle resourceBundle = ResourceBundle.getBundle(I18N_LOCALE, locale);
            loader.setResources(resourceBundle);

            Parent root = loader.load(getClass().getResourceAsStream(FXML_FILE));
            stage.setTitle(resourceBundle.getString("mainscene.Title"));
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}