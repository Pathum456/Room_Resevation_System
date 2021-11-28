package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {
    public AnchorPane dashBoard;



    public void adminLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)dashBoard.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void reciptionistLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReciptionLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage)dashBoard.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
