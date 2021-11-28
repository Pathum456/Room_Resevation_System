package controller;

import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminloginformController {
    public AnchorPane adminForm;
    Scanner input= new Scanner(System.in);
    String pass="Admin";



        public void ok (ActionEvent actionEvent) throws IOException {
                URL resource = getClass().getResource("../view/RoomForm.fxml");
                Parent load = FXMLLoader.load(resource);
                Stage window = (Stage) adminForm.getScene().getWindow();
                window.setScene(new Scene(load));

    }


        public void back (ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminForm.getScene().getWindow();
        window.setScene(new Scene(load));
    }

        public void passwordOnAction (ActionEvent actionEvent){


    }
}
