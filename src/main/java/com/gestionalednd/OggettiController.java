package com.gestionalednd;

import com.utilities.dizionari.DizionarioEquipaggiamento;
import com.utilities.dizionari.base.Equipaggiamento;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
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
     * Inizializza i valori della ListView contenente l'elenco degli oggetti selezionabili dall'utente
     * @param url url relativo al file fxml
     * @param resourceBundle Bundle della risorsa
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DizionarioEquipaggiamento dizionarioEquipaggiamento=new DizionarioEquipaggiamento();
        Set<Equipaggiamento> treeSet=dizionarioEquipaggiamento.getDizionarioEquipaggiamento();
        for (Equipaggiamento equipaggiamento : treeSet) {
            listView.getItems().add(equipaggiamento.getNomeEquipaggiamento());
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
        for (Equipaggiamento equipaggiamento : setEquipaggiamento) {
            if (equipaggiamento.getNomeEquipaggiamento().compareTo(topics) == 0) {
                descrizioneOggetto.setText(equipaggiamento.toString());
            }
        }
    }
}
