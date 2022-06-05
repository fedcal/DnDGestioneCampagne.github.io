package com.gestionalednd;

import com.utilities.dizionari.Armature;
import com.utilities.dizionari.DizionarioEquipaggiamento;
import com.utilities.dizionari.Equipaggiamento;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;

public class OggettiController implements Initializable {
    public ListView listView;
    public Label descrizioneOggetto;
    public Button infoOggetto;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DizionarioEquipaggiamento dizionarioEquipaggiamento=new DizionarioEquipaggiamento();
        Set<Equipaggiamento> treeSet=dizionarioEquipaggiamento.getDizionarioEquipaggiamento();
        Iterator<Equipaggiamento> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            listView.getItems().add(iterator.next().getNomeEquipaggiamento());
        }

    }

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
