package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReciptionLoginFormController {
    public AnchorPane reciptionContext;

    public void okOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReciptionWorkForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) reciptionContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void homeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) reciptionContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
