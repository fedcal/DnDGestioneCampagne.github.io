package com.gestionalednd;

import com.utilities.dizionari.base.Arma;
import com.utilities.dizionari.DizionarioArmi;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Classe controller per la gestione della visuale armi contenete informazioni homebrew
 */
public class ArmiHomebrewController implements Initializable {
    /**
     * fx:id che si riferisce al ListView contente tutte le armi
     */
    @FXML
    private ListView listView;

    /**
     * fx:id che si riferisce al Label contenete la descrizione delle armi
     */
    @FXML
    private Label descrizioneArma;

    /**
     * Inizializzatore degli attributi di classi
     * @param url Url del file xml
     * @param resourceBundle Bundle delle risorse
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DizionarioArmi dizionarioArmi=new DizionarioArmi();
        Set<Arma> treeSet=dizionarioArmi.getDizionarioArmi();
        for (Arma arma : treeSet) {
            listView.getItems().add(arma.toString());
        }

    }

    /**
     * Costruttore di classe
     */
    public void dettagliArma( ) {
        String topics;
        topics=listView.getSelectionModel().getSelectedItem().toString();
        DizionarioArmi dizionarioArmi= new DizionarioArmi();
        Set<Arma> setArma=dizionarioArmi.getDizionarioArmi();
        for (Arma arma : setArma) {
            if (arma.getNomeArma().compareTo(topics) == 0) {
                System.out.println();
                descrizioneArma.setText("Nome arma: " + arma.getNomeArma() + "\nTipo arma: " + arma.getTipoArma() + "\nTipo danni: " + arma.getTipoDanni() + "\nProprietà: " + arma.getProprieta() + "\nCosto: " + arma.getCosto() + "\nPeso: " + arma.getPeso() + "Kg" + "\nDanno: " + arma.getDadiDanno());
            }
        }
    }
}
