package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public Button buttonExit;
    @FXML
    public Button buttonNewUser;

    @FXML
    public void onActionButtonExitMainScene(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void onActionButtonNewUser(ActionEvent actionEvent) {
        try {
            String fxmlFile = "/fxml/user.fxml";
            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(getClass().getResourceAsStream(fxmlFile));
            Stage stage = new Stage();
            stage.setTitle("Task manager Help Desk");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
