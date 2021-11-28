package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReciptionWorkFormController {

    public AnchorPane workReciptionContext;
    public AnchorPane menuContext;

    public void newGuestOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddNewGuestForm.fxml");
        Parent load = FXMLLoader.load(resource);
        workReciptionContext.getChildren().clear();
        workReciptionContext.getChildren().add(load);

    }

    public void roomAvailabilityOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomAvailabilityForm.fxml");
        Parent load = FXMLLoader.load(resource);
        workReciptionContext.getChildren().clear();
        workReciptionContext.getChildren().add(load);
    }

    public void mealPlanOnaction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPlanForm.fxml");
        Parent load = FXMLLoader.load(resource);
        workReciptionContext.getChildren().clear();
        workReciptionContext.getChildren().add(load);
    }

    public void paymentDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PaymentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        workReciptionContext.getChildren().clear();
        workReciptionContext.getChildren().add(load);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) workReciptionContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void CustomerDetailsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CustomerLogForm.fxml");
        Parent load = FXMLLoader.load(resource);
        workReciptionContext.getChildren().clear();
        workReciptionContext.getChildren().add(load);
    }

    public void maintenceOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MaintenceForm.fxml");
        Parent load = FXMLLoader.load(resource);
        workReciptionContext.getChildren().clear();
        workReciptionContext.getChildren().add(load);

    }
}
