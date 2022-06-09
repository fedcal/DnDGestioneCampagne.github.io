package com.gestionalednd;


import com.utilities.dizionari.DizionarioIncantesimi;
import com.utilities.dizionari.base.Incantesimo;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.*;

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
     * Dizionario incantesimi
     */
    private final DizionarioIncantesimi dizionarioIncantesimi=new DizionarioIncantesimi();

    /**
     * Inizializzazione della vista con i dati recuperati dal dizionario relativo e alla creazione dei vari filtri
     * @param url Url relativo alla vista dell'interfaccia
     * @param resourceBundle Bundle dell'interfaccia
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeSet<String> livelloFiltro= new TreeSet<>();
        TreeSet<String> livelloTipo= new TreeSet<>();
        TreeSet<String> livelloClasse= new TreeSet<>();
        TreeSet<Incantesimo> treeSet=this.dizionarioIncantesimi.getDizionarioIncantesimi();
        for (Incantesimo incantesimo : treeSet) {
            livelloFiltro.add(incantesimo.getLivello());
            livelloTipo.add(incantesimo.getTipo());
            String[] classiIncantesimo = incantesimo.getClassiAppartenenza();
            Collections.addAll(livelloClasse, classiIncantesimo);
        }
        for (String s : livelloFiltro) {
            this.filtroLivello.getItems().add(s);
        }
        for (String s : livelloTipo) {
            this.filtroTipo.getItems().add(s);
        }
        for (String s : livelloClasse) {
            this.filtroClasse.getItems().add(s);
        }
        for (Incantesimo incantesimo : treeSet) {
            this.listView.getItems().add(incantesimo.getNomeIncantesimo());
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
        for (Incantesimo incantesimo : setEquipaggiamento) {
            if (incantesimo.getNomeIncantesimo().compareTo(topics) == 0) {
                this.descrizioneIncantesimo.setText(incantesimo.toString());
            }
        }
    }

    /**
     * Azzera i filtri i ricerca
     */
    public void deleteFiltri() {
        if(!this.filtroTipo.getSelectionModel().isEmpty()){
            this.filtroTipo.valueProperty().set(null);
        }
        if(!this.filtroLivello.getSelectionModel().isEmpty()){
            this.filtroLivello.valueProperty().set(null);
        }
        if(!this.filtroClasse.getSelectionModel().isEmpty()){
            this.filtroClasse.valueProperty().set(null);
        }
        listView.getItems().clear();
        for (Incantesimo incantesimo : this.dizionarioIncantesimi.getDizionarioIncantesimi()) {
            this.listView.getItems().add(incantesimo.getNomeIncantesimo());
        }

    }
    //TODO eliminare il contorno blu dalla visualizzazione dell'incantesimo

    /**
     * Filtra gli incantesimi in base alle scelte dell'utente
     */
    public void filtraIncantesimi() {
        String filterLivello = " ";
        String filterClasse = " ";
        String filterTipo = " ";

        if ((this.filtroTipo.getSelectionModel().isEmpty()) && (this.filtroClasse.getSelectionModel().isEmpty()) && (this.filtroLivello.getSelectionModel().isEmpty())) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Inserire almeno un filtro");
            a.show();
        } else {
            if (!this.filtroLivello.getSelectionModel().isEmpty()) {
                filterLivello = this.filtroLivello.getSelectionModel().getSelectedItem().toString();
            }
            if (!this.filtroClasse.getSelectionModel().isEmpty()) {
                filterClasse = this.filtroClasse.getSelectionModel().getSelectedItem().toString();
            }
            if (!this.filtroTipo.getSelectionModel().isEmpty()) {
                filterTipo = this.filtroTipo.getSelectionModel().getSelectedItem().toString();
            }
            LinkedList<String> filterLit = new LinkedList<>();
            filterLit.add(filterLivello);
            filterLit.add(filterClasse);
            filterLit.add(filterTipo);
            boolean livelloVerifica = false, tipoVerifica = false, classeVerifica = false;
            TreeSet<String> treeSetFiltrato = new TreeSet<>();
            for (Incantesimo temp : this.dizionarioIncantesimi.getDizionarioIncantesimi()) {
                if (!filterLit.get(0).equals(" ")) {
                    livelloVerifica = filterLit.get(0).equals(temp.getLivello());
                }
                if (!filterLit.get(2).equals(" ")) {
                    tipoVerifica = filterLit.get(2).equals(temp.getTipo());
                }
                if (!filterLit.get(1).equals(" ")) {
                    String[] classiTemp = temp.getClassiAppartenenza();
                    for (String s : classiTemp) {
                        if (s.equals(filterLit.get(1))) {
                            classeVerifica = true;
                        }
                    }
                }
                if (classeVerifica || tipoVerifica || livelloVerifica) {
                    treeSetFiltrato.add(temp.getNomeIncantesimo());
                }
            }
            this.listView.getItems().clear();
            for (String setFiltrato : treeSetFiltrato) {
                this.listView.getItems().add(setFiltrato.toString());
            }
        }
    }

}
