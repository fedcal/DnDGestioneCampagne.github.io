package com.gestionalednd;



import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Classe per la gestione delle varie viste per il materiale homebrew
 */
public class HomebrewController {


    /**
     * Gestore per l'apertura della vista delle armi
     * @throws IOException può generare un'eccezione IOException se non riesce a trovare tra le risorse la vista
     */
    public void armiView() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("armi-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione materiale: Armi");
        stage.show();
    }

    /**
     * Gestore per l'aperture della vista delle armature
     * @throws IOException può generare un'eccezione IOException se non riesce a trovare tra le risorse la vista
     */
    public void armatureView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("armature-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione materiale: Armature");
        stage.show();
    }

    /**
     * Gestore per l'aperture della vista degli oggetti
     * @throws IOException può generare un'eccezione IOException se non riesce a trovare tra le risorse la vista
     */
    public void oggettiView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("oggetti-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione materiale: Oggetti");
        stage.show();
    }

    /**
     * Gestore per la gestione della vista degli incantesimi
     * @throws IOException Gestore per l'aperture della vista delle armature
     */
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
