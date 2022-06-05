package com.gestionalednd;

import com.utilities.dizionari.Armature;
import com.utilities.dizionari.DizionarioArmature;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.Set;

public class ArmatureController implements Initializable {
    public ListView listView;
    public Label descrizioneArma;
    public Button infoArmatura;

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
