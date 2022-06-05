package com.gestionalednd;


import com.utilities.dizionari.DizionarioIncantesimi;
import com.utilities.dizionari.Incantesimo;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

public class IncantesimiController implements Initializable {


    public ListView listView;
    public TextArea descrizioneIncantesimo;
    public Button infoOggetto;
    public Button eliminaFiltri;
    public ChoiceBox filtroLivello;
    public ChoiceBox filtroClasse;
    public ChoiceBox filtroTipo;
    public Button filtroIncantesimi;

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

    public void deleteFiltri() {
    }

    public void filtraIncantesimi() {
    }
}
