package com.gestionalednd;

import com.utilities.dizionari.Armature;
import com.utilities.dizionari.DizionarioEquipaggiamento;
import com.utilities.dizionari.Equipaggiamento;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Controller per la sezione homebrew degli oggetti
 */
public class OggettiController implements Initializable {
    /**
     * fx:id della ListView per visualizzare l'elenco degli oggetti
     */
    @FXML
    private ListView listView;
    /**
     * fx:id del label contenente la descrizione dell'oggetto selezionato dall'utente
     */
    @FXML
    private Label descrizioneOggetto;
    /**
     * fx:id del Button che l'utente preme per ottenere le informazioni relative all'oggetto
     */
    @FXML
    private Button infoOggetto;

    /**
     * Inizializza i valori della ListView contenente l'elenco degli oggetti selezionabili dall'utente
     * @param url url relativo al file fxml
     * @param resourceBundle Bundle della risorsa
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DizionarioEquipaggiamento dizionarioEquipaggiamento=new DizionarioEquipaggiamento();
        Set<Equipaggiamento> treeSet=dizionarioEquipaggiamento.getDizionarioEquipaggiamento();
        Iterator<Equipaggiamento> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            listView.getItems().add(iterator.next().getNomeEquipaggiamento());
        }

    }

    /**
     * Visualizza le informazioni dell'oggetto selezionato dall'utente
     */
    public void dettagliOggetto() {
        String topics;
        topics=listView.getSelectionModel().getSelectedItem().toString();
        DizionarioEquipaggiamento dizionarioEquipaggiamento= new DizionarioEquipaggiamento();
        Set<Equipaggiamento> setEquipaggiamento= dizionarioEquipaggiamento.getDizionarioEquipaggiamento();
        Iterator<Equipaggiamento> iterator=setEquipaggiamento.iterator();
        while (iterator.hasNext()){
            Equipaggiamento equipaggiamento=iterator.next();
            if (equipaggiamento.getNomeEquipaggiamento().compareTo(topics)==0){
                descrizioneOggetto.setText(equipaggiamento.toString());
            }
        }
    }
}
