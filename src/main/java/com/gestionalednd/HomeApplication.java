package com.gestionalednd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Classe che avvia l'interfaccia grafica della homepage dell'applicazione
 */
public class HomeApplication extends Application {
    /**
     * Metodo start della classe Application, il quale viene sovrascritto per impostare il file fxml della home dell'applicazione
     * @param stage Stage - contenitore principale dell'applicazione
     * @throws IOException Nel caso in cui non si dovesse riuscire a recuperare il file fxml relativo alla schermata principale
     */
    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HomeApplication.class.getResource("home-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Worlds' Inn - Gestionale D&D");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }catch (Error e){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Impossibile avviare l'applicazione. Controllare di aver installato il software Bellsoft" +
                    " e di essere connesso a Internet");
        }

    }

    /**
     * Metodo main per far avviare l'applicazione
     * @param args parametri dell'applicazione
     */
    public static void main(String[] args) {
        launch();
    }
}