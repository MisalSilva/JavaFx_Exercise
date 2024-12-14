package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class Page2Controller {

    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void goToPage1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Page1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
