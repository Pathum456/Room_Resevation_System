package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomFormController {
    public AnchorPane roomContext;
    public AnchorPane showcontext;




    public void incomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReportForm.fxml");
        Parent load = FXMLLoader.load(resource);
        showcontext.getChildren().clear();
        showcontext.getChildren().add(load);


    }

    public void goHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("/view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void roomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/EditRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        showcontext.getChildren().clear();
        showcontext.getChildren().add(load);
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPackageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        showcontext.getChildren().clear();
        showcontext.getChildren().add(load);

    }
}
