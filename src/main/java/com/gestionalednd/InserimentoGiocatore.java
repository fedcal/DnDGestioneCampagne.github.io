package com.gestionalednd;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import org.bson.Document;
import org.bson.types.ObjectId;


/**
 * Controller per la gestione dell'inserimento dei giocatori
 */
public class InserimentoGiocatore {

    /**
     * fx:id riferito al Button per inserire un utente dopo aver compilato i campi con i dati
     */
    @FXML
    private Button inserireUtente;

    /**
     * fx:id riferito al TextField per acquisire il nome dell'utente da inserire nel database
     */
    @FXML
    private TextField nomeUtente;

    /**
     * fx:id riferito al TextField per acquisire l'usurname di Telegram dell'utente da inserire nel database
     */
    @FXML
    private TextField usurnameUtente;

    /**
     * fx:id riferito al TextField per acquisire la città dell'utente da inserire nel database
     */
    @FXML
    private TextField cittaUtente;

    /**
     * fx:id riferito al TextField per acquisire la provincia dell'utente da inserire nel database
     */
    @FXML
    private TextField provinciaUtente;

    /**
     * fx:id riferito al TextField per acquisire il gdr a cui gioca l'utente da inserire nel database
     */
    @FXML
    private TextField gdrUtente;

    /**
     * fx:id riferito al TextField per acquisire l'edizione del gdr a cui gioca l'utente da inserire nel database
     */
    @FXML
    private TextField edizioneUtente;

    /**
     * fx:id riferito al TextField per acquisire la modalità online di gioco dell'utente da inserire nel database
     */
    @FXML
    private RadioButton onlineSessione;

    /**
     * fx:id riferito al TextField per acquisire la modalità fisica di gioco dell'utente da inserire nel database
     */
    @FXML
    private RadioButton fisicoSessione;

    /**
     * fx:id riferito al TextField per acquisire la modalità di master dell'utente da inserire nel database
     */
    @FXML
    private RadioButton masterSessione;

    /**
     * fx:id riferito al TextField per acquisire la modalità di giocatore dell'utente da inserire nel database
     */
    @FXML
    private RadioButton giocatoreSessione;

    /**
     * fx:id riferito al TextField per acquisire la modalità di giocatore e master dell'utente da inserire nel database
     */
    @FXML
    private RadioButton entrambiSesione;

    /**
     * fx:id riferito al Label per confermare l'avvenuto inserimento del giocatore all'interno del database
     */
    @FXML
    private Label inserimentoGiocatoreCheck;

    /**
     * Funzione di inserimento del giocatore all'interno del database
     */
    public void inserimentoUtenteDatabase() {
        MongoDatabase mongoDb= Launcher.getDb();
        MongoCollection<Document> playersCollection = mongoDb.getCollection("players");
        Document player= new Document("_id",new ObjectId());

        player.append("player_id",10000d)
                .append("nome",nomeUtente.getText().toString())
                .append("usurnameTelegram",usurnameUtente.getText().toString())
                .append("citta",cittaUtente.getText().toString())
                .append("provincia",provinciaUtente.getText().toString())
                .append("gdrName",gdrUtente.getText().toString())
                .append("edizione",edizioneUtente.getText().toString());
        if(onlineSessione.isSelected()){
            player.append("online", "si");
        }else{
            player.append("online", "no");
        }

        if(masterSessione.isSelected()){
            player.append("ruolo", "master");
        }else if(giocatoreSessione.isSelected()){
            player.append("ruolo", "giocatore");
        }else if(entrambiSesione.isSelected()){
            player.append("ruolo", "entrambi");
        }
        if(nomeUtente.getText().toString().contains("Inserisci")||usurnameUtente.getText().toString().contains("Inserisci")||cittaUtente.getText().toString().contains("Inserisci")||provinciaUtente.getText().toString().contains("Inserisci")||gdrUtente.getText().toString().contains("Inserisci")||edizioneUtente.getText().toString().contains("Inserisci")){
            inserimentoGiocatoreCheck.setTextFill(Color.web("#FF0000"));
            inserimentoGiocatoreCheck.setText("Inserisci tutti i campi");
        }else{
            playersCollection.insertOne(player);
            inserimentoGiocatoreCheck.setTextFill(Color.web("#025a01"));
            inserimentoGiocatoreCheck.setText("Giocatore inserito con successo");
        }

    }
}
