package com.gestionalednd;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomebrewController {
    public Button armiButton;
    public Button classiButton;
    public Button razzeButton;
    public Button oggettiButton;
    public Button incantesimiButton;
    public Button armatureButton;

    public void armiView() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("armi-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione materiale: Armi");
        stage.show();
    }

    public void armatureView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("armature-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione materiale: Armature");
        stage.show();
    }

    public void oggettiView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("oggetti-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione materiale: Oggetti");
        stage.show();
    }

    public void incantesimiView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("incantesimi-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione materiale: Oggetti");
        stage.show();
    }
}
