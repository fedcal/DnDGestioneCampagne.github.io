package com.gestionalednd;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.utilities.PlayersData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import org.bson.Document;

import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * Controller per la gestione dei giocatori
 *
 */
public class ListaGiocatori implements Initializable {

    /**
     * fx:id ListView per la visualizzazione della lista dei giocatori
     */
    @FXML
    private ListView vistaGiocatoriRicerca;

    /**
     * fx:id  ChoiceBox per quanto riguarda il filtro da applicare sui gdr
     */
    @FXML
    private ChoiceBox gdrGiocatoriRicerca;

    /**
     * fx:id ChoiceBox per quanto riguarda il filtro da applicare all'edizione del gdr nella ricerca
     */
    @FXML
    private ChoiceBox edizioneGiocatoriRicerca;

    /**
     * fx:id ChoiceBox reltivo al filtro della provincia da applicare alla ricerca dei giocatori
     */
    @FXML
    private ChoiceBox provinciaGiocatoriRicerca;

    /**
     * fx:id ChoiceBox relativo al filtro della città da applcare alla ricerca dei giocatori
     */
    @FXML
    private ChoiceBox cittaGiocatoriRicarca;

    /**
     * Lista giocatori filtrata dal database da visualizzare
     */
    private ArrayList<PlayersData> playersData;

    /**
     * Funzione per richiamare la vista per aggiungere un giocatore all'interno del database
     * @throws IOException Eccezione nel caso in cui l'applicazione non riesce ad ottenere la classe fxml
     */
    public void aggiungiGiocatoreView() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addPlayers-view.fxml"));
        Parent root =  fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * Funzione per applicare i filtri della ricerca alla lista dei giocatori e visualizzarla nella ListView relativa
     */
    public void ricercaGiocatoreDb() {
        String[] queryFilters = {cittaGiocatoriRicarca.getValue().toString(),provinciaGiocatoriRicerca.getValue().toString(),gdrGiocatoriRicerca.getValue().toString(),edizioneGiocatoriRicerca.getValue().toString()};
        LinkedList<PlayersData> listaRicerca=new LinkedList<>();
        if(!queryFilters[0].contains("Seleziona")){
            for (PlayersData playersDatum : playersData) {
                if (playersDatum.getCitta().contains(queryFilters[0])) {
                    listaRicerca.add(playersDatum);
                }
            }
        }

        if(!queryFilters[1].contains("Seleziona")){
            if(listaRicerca.isEmpty()){
                for (PlayersData playersDatum : playersData) {
                    if (playersDatum.getProvincia().contains(queryFilters[1])) {
                        listaRicerca.add(playersDatum);
                    }
                }
            }else{
                for (PlayersData playersDatum : playersData) {
                    if (!playersDatum.getProvincia().contains(queryFilters[1])) {
                        listaRicerca.remove(playersDatum);
                    }
                }
            }
        }

        if(!queryFilters[2].contains("Seleziona")){
            if(listaRicerca.isEmpty()){
                for (PlayersData playersDatum : playersData) {
                    if (playersDatum.getGdrName().contains(queryFilters[2])) {
                        listaRicerca.add(playersDatum);
                    }
                }
            }else{
                for (PlayersData playersDatum : playersData) {
                    if (!playersDatum.getGdrName().contains(queryFilters[2])) {
                        listaRicerca.remove(playersDatum);
                    }
                }
            }
        }

        if(!queryFilters[3].contains("Seleziona")){
            if(listaRicerca.isEmpty()){
                for (PlayersData playersDatum : playersData) {
                    if (playersDatum.getEdizione().contains(queryFilters[3])) {
                        listaRicerca.add(playersDatum);
                    }
                }
            }else{
                for (PlayersData playersDatum : playersData) {
                    if (!playersDatum.getEdizione().contains(queryFilters[3])) {
                        listaRicerca.remove(playersDatum);
                    }
                }
            }
        }
        for (PlayersData data : listaRicerca) {
            vistaGiocatoriRicerca.getItems().add(data.toString());
        }
    }

    /**
     * Funzione per inizializzare i filtri della ricerca andando a recuperare i dati dal database
     * @param location Url del file relativo alla vista
     * @param resources Risorsa collegata
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.playersData=new ArrayList<>();
        MongoDatabase mongoDb= Launcher.getDb();
        MongoCollection<Document> playersCollection = mongoDb.getCollection("players");
        //Seleziono tutti gli utenti dal database e li inserisco in una lista di oggetti PlayersData
        MongoCursor<Document> cursorPlayers = playersCollection.find(new Document("player_id",10000)).cursor();



        int index=0;
        //Recupero i dati splittando il document contenente il risultato della query
        while(cursorPlayers.hasNext()){
            String playerData=cursorPlayers.next().toString();
            String[] playerDataSplit=playerData.split(" ");
            PlayersData playersDataTemp= new PlayersData();
            playersDataTemp.setNome(playerDataSplit[2].split("=")[1].replace(",",""));
            playersDataTemp.setUsurnameTelegram(playerDataSplit[3].split("=")[1].replace(",",""));
            playersDataTemp.setCitta(playerDataSplit[4].split("=")[1].replace(",",""));
            playersDataTemp.setProvincia(playerDataSplit[5].split("=")[1].replace(",",""));
            playersDataTemp.setGdrName(playerDataSplit[6].split("=")[1].replace(",",""));
            playersDataTemp.setEdizione(playerDataSplit[7].split("=")[1].replace(",",""));
            playersDataTemp.setOnline(playerDataSplit[8].split("=")[1].replace(",",""));
            playersDataTemp.setRuolo(playerDataSplit[9].split("=")[1].replace("}}",""));
            playersData.add(index,playersDataTemp);
            index++;
        }



        //inserimento dei dati dei giocatori all'interno di insiemi per poi utilizzarli nei choicebox come filtri
        TreeSet<String> cittaUtenteLista=new TreeSet<>();
        TreeSet<String> provinciaUtenteLista=new TreeSet<>();
        TreeSet<String> gdrUtenteLista=new TreeSet<>();
        TreeSet<String> edizioneUtenteLista=new TreeSet<>();

        for (PlayersData playersDatum : playersData) {
            cittaUtenteLista.add(playersDatum.getCitta());
            provinciaUtenteLista.add(playersDatum.getProvincia());
            gdrUtenteLista.add(playersDatum.getGdrName());
            edizioneUtenteLista.add(playersDatum.getEdizione());
        }
        //riempimento choicebox
        //città
        for (String s : cittaUtenteLista) {
            cittaGiocatoriRicarca.getItems().add(s);
        }
        //provincia
        for (String s : provinciaUtenteLista) {
            provinciaGiocatoriRicerca.getItems().add(s);
        }
        //gdr
        for (String s : gdrUtenteLista) {
            gdrGiocatoriRicerca.getItems().add(s);
        }

        //edizione
        for (String s : edizioneUtenteLista) {
            edizioneGiocatoriRicerca.getItems().add(s);
        }
    }
}
