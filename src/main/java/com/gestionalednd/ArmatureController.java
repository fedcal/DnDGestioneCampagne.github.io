package com.gestionalednd;

import com.utilities.dizionari.Armature;
import com.utilities.dizionari.DizionarioArmature;
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
 * Controller riferito alla visualizzazione del materiale homebrew per le armature
 */
public class ArmatureController implements Initializable {
    /**
     * fx:id relativo alla listView per la visualizzazione delle armature
     */
    @FXML
    private ListView listView;

    /**
     * fx:id relativo al Label per contenere la descrizione dell'armatura selezionata
     */
    @FXML
    private Label descrizioneArma;

    /**
     * fx:id relativo al Button che l'utente preme per ottenere le informazioni dell'armatura
     */
    @FXML
    private Button infoArmatura;

    /**
     * Costruttore di classe
     */
    public void dettagliArmatura( ) {
        String topics;
        topics=listView.getSelectionModel().getSelectedItem().toString();
        DizionarioArmature dizionarioArmi= new DizionarioArmature();
        Set<Armature> setArma=dizionarioArmi.getDizionarioArmature();
        Iterator<Armature> iterator=setArma.iterator();
        while (iterator.hasNext()){
            Armature arma=iterator.next();
            if (arma.getNomeArmatura().compareTo(topics)==0){
                System.out.println();
                descrizioneArma.setText(arma.toString());
            }
        }
    }

    /**
     * Inizializzatore dei campi della classe
     * @param url Url del file xml
     * @param resourceBundle Bundle delle risorse
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DizionarioArmature dizionarioArmi=new DizionarioArmature();
        Set<Armature> treeSet=dizionarioArmi.getDizionarioArmature();
        Iterator<Armature> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            listView.getItems().add(iterator.next().getNomeArmatura());
        }

    }
}
