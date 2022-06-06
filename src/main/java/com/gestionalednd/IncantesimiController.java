package com.gestionalednd;


import com.utilities.dizionari.DizionarioIncantesimi;
import com.utilities.dizionari.Incantesimo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

/**
 * Classe per la gestione delle informazioni homebrew relative agli incantesimi
 */
public class IncantesimiController implements Initializable {

    /**
     * fx:id relativo alla ListView per la visualizzazione dell'elenco relativo agli incantesimi
     */
    @FXML
    private ListView listView;
    /**
     * fx:id relativo alla TextArea per la visualizzazione della descrizione dell'incantesimo selezionato
     */
    @FXML
    private TextArea descrizioneIncantesimo;
    /**
     * fx:id relativo al Button per ottenere le informazioni relative all'incantesimo selezionato
     */
    @FXML
    private Button infoOggetto;
    /**
     * fx:id relativo al Button per eliminare i filtri di ricerca
     */
    @FXML
    private Button eliminaFiltri;
    /**
     * fx:id relativo al ChoiceBox per il filtro del livello dell'incantesimo
     */
    @FXML
    private ChoiceBox filtroLivello;
    /**
     * fx:id relativo al ChoiceBox per il filtro della classe dell'incantesimo
     */
    @FXML
    private ChoiceBox filtroClasse;
    /**
     * fx:id relativo al ChoiceBox per il filtro del tipo dell'incantesimo
     */
    @FXML
    private ChoiceBox filtroTipo;
    /**
     * fx:id relativo al Button per attivare i filtri
     */
    @FXML
    private Button filtroIncantesimi;

    /**
     * Inizializzazione della vista con i dati recuperati dal dizionario relativo e alla creazione dei vari filtri
     * @param url Url relativo alla vista dell'interfaccia
     * @param resourceBundle Bundle dell'interfaccia
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //TODO inizializzazione tree set per ogni filtro
        TreeSet<String> livelloFiltro= new TreeSet<>();
        TreeSet<String> livelloTipo= new TreeSet<>();
        TreeSet<String> livelloClasse= new TreeSet<>();
        DizionarioIncantesimi dizionarioIncantesimi=new DizionarioIncantesimi();
        Set<Incantesimo> treeSet=dizionarioIncantesimi.getDizionarioIncantesimi();
        Iterator<Incantesimo> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            Incantesimo incantesimo=iterator.next();
            listView.getItems().add(incantesimo.getNomeIncantesimo());
            filtroLivello.getItems().add(incantesimo.getLivello());
        }


    }

    /**
     * Visualizza le informazioni relative a un incantesimo nel relativo box
     */
    public void dettagliIncantesimo() {
        String topics;
        topics=listView.getSelectionModel().getSelectedItem().toString();
        DizionarioIncantesimi dizionarioIncantesimi= new DizionarioIncantesimi();
        Set<Incantesimo> setEquipaggiamento= dizionarioIncantesimi.getDizionarioIncantesimi();
        Iterator<Incantesimo> iterator=setEquipaggiamento.iterator();
        while (iterator.hasNext()){
            Incantesimo incantesimo=iterator.next();
            if (incantesimo.getNomeIncantesimo().compareTo(topics)==0){
                descrizioneIncantesimo.setText(incantesimo.toString());
            }
        }
    }

    /**
     * Azzera i filtri i ricerca
     */
    public void deleteFiltri() {
    }

    /**
     * Filtra gli incantesimi in base alle scelte dell'utente
     */
    public void filtraIncantesimi() {
    }
}
