package com.gestionalednd;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Controller della classe home
 */
public class HomeController {
    /**
     * fx:id identificativo del Button relativo al materiale di gioco
     */
    public Button materiale;

    /**
     *  fx:id identificativo del Label per la visualizzazione degli errori
     */
    @FXML
    private Label errorLabel;


    /**
     * Funzione per aprire la vista dei dadi
     * @throws IOException Il metodo può generare questa eccezione
     */
    @FXML
    private void dadiView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dadi-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Gestionale D&D - Sezione dadi");
        stage.setResizable(false);
        stage.show();
    }

    /**
     *  Funzione per visualizzare la vista dei combattimenti
     * @throws IOException Il metodo può generare questa eccezione
     */
    @FXML
    private void combattimentiView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("combattimento-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione combattimento");
        stage.show();
    }

    /**
     * Funzione per settare i  link della community
     * @throws URISyntaxException Il metodo genera questa eccezione se non riesce a collegarsi all'url
     * @throws IOException Il metodo genera questa eccezione se non riesce a richiamare l'interfaccia
     */
    @FXML
    private void linkWorldInn() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://worldsinn.net"));
    }

    /**
     * Funzione per impostare il link del gruppo chat di Telegram
     * @throws URISyntaxException Il metodo genera questa eccezione se non riesce a collegarsi all'url
     * @throws IOException Il metodo genera questa eccezione se non riesce a richiamare l'interfaccia
     */
    @FXML
    private void linkGruppoChat() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://t.me/s/DnDChatITA"));
    }

    /**
     * Metodo per impostare il link per le proposte
     * @throws URISyntaxException Il metodo genera questa eccezione se non riesce a collegarsi all'url
     * @throws IOException Il metodo genera questa eccezione se non riesce a richiamare l'interfaccia
     */
    @FXML
    private void linkProposte() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://docs.google.com/forms/d/1rftN6WwSHZ8JubceY8jll8KKNEUk5hsot4QEx3RZdWo/edit"));
    }

    /**
     * Metodo sito web personale
     * @throws URISyntaxException Il metodo genera questa eccezione se non riesce a collegarsi all'url
     * @throws IOException Il metodo genera questa eccezione se non riesce a richiamare l'interfaccia
     */
    @FXML
    private void linkFederico() throws URISyntaxException,IOException{
        Desktop.getDesktop().browse(new URI("https://federicocalo.it"));
    }

    /**
     * Metodo per impostare il link della documentazione
     * @throws URISyntaxException Il metodo genera questa eccezione se non riesce a collegarsi all'url
     * @throws IOException Il metodo genera questa eccezione se non riesce a richiamare l'interfaccia
     */
    @FXML
    private void linkDocumentazione() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("https://github.com/fedcal/DnDGestioneCampagne/blob/master/README.md"));
    }

    /**
     * Metodo per visualizzare la vista per la ricerca dei giocatori
     */
    @FXML
    private void listaGiocatoriview() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ricercaGiocatore-view.fxml"));
            Parent root = (Parent) fxmlLoader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.setTitle("Gestionale D&D - Sezione ricerca giocatori");
            stage.show();
        }catch (NullPointerException e){
            System.out.println(e.toString()+" NullPointerException");
        } catch (IOException e) {
            errorLabel.setText("Per utilizzare questa funzione devi essere collegato a internet");
        }

    }

    /**
     * Metodao per visualizzare la vista della creazione delle schede
     * @throws IOException Il metodo genera questa eccezione se non riesce a richiamare l'interfaccia
     */
    @FXML
    private void creazioneSchedaView() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("schedaPg-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione crea scheda");
        stage.show();
    }

    /**
     * Metodo per visualizzare la vista del materiale homebrew
     * @throws IOException Genera un IOException se il metodo non riesce a trovare il file fxml
     */
    public void materialeView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("homebrew-view.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Gestionale D&D - Sezione crea scheda");
        stage.show();
    }
}