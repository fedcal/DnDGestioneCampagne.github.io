package com.gestionalednd;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe per la gestione del combattimento
 */
public class CombattimentoController{
    /**
     * fx:id del TextField per impostare il nome del PG/PNG/Mostro nell'elenco dell'iniziativa
     */
    @FXML
    private TextField nomePersonaggio;

    /**
     * fx:id del TextField per impostare la vita del PG/PNG/Mostro nell'elenco dell'iniziativa
     */
    @FXML
    private TextField vitaPersonaggio;

    /**
     * fx:id del TextField per impostare l'iniziativa del PG/PNG/Mostro nell'elenco dell'iniziativa
     */
    @FXML
    private TextField iniziativaPersonaggio;

    /**
     * fx:id del TextField per ottenere il nome del PG/PNG/Mostro nell'elenco dell'iniziativa per modificarne la vita
     */
    @FXML
    private TextField modificaNome;

    /**
     * fx:id del TextField per ottenere la vita da aggiungere al PG/PNG/Mostro nell'elenco dell'iniziativa
     */
    @FXML
    private TextField aggiungiVita;

    /**
     * fx:id del TextField per ottenere la vita da togliere al PG/PNG/Mostro nell'elenco dell'iniziativa
     */
    @FXML
    private TextField togliVita;

    /**
     * fx:id della ListView contenente i PG/PNG/Mostri che partecipano al combattimento
     */
    @FXML
    private ListView listaIniziativa;

    /**
     * Funzione per scorrere la lista dei PG/PNG/Mostri che partecipano al combattimento. Inizialmente è visualizzato in ordine per iniziativa
     */
    public void nextTurn() {
        List<Object> listaTemp=new LinkedList<>();
        Object temp;
        int j;
        for(int i=0;i<listaIniziativa.getItems().size();i++){
            listaTemp.add(listaIniziativa.getItems().get(i));
        }
        for (int i=0;i<listaTemp.size()-1;i++){
            j=i+1;
            temp=listaTemp.get(j);
            listaTemp.set(j,listaTemp.get(i));
            listaTemp.set(i,temp);
        }
        for (int i=0;i<listaTemp.size();i++){
            listaIniziativa.getItems().set(i,listaTemp.get(i));
        }


    }

    /**
     * Funzione per aggiungere un PG/PNG/Mostro alla lista del combattimento, viene sempre aggiunto in ordine di iniziativa
     */
    public void addPersonaggio() {
        List<Object> listaTemp=new LinkedList<>();
        for(int i =0; i< listaIniziativa.getItems().size();i++){
            listaTemp.add(listaIniziativa.getItems().get(i));
        }
        listaIniziativa.getItems().clear();
        String datiPg="";
        datiPg= iniziativaPersonaggio.getText() + " " + nomePersonaggio.getText() + " " + vitaPersonaggio.getText();
        listaTemp.add(datiPg);

        int j;
        Object temp;
        //sort on linkedlist
        for (int i=0;i<listaTemp.size()-1;i++) {
            for(j=i+1; j<listaTemp.size();j++){
                String temp1, temp2;
                temp1 = listaTemp.get(i).toString();
                temp2 = listaTemp.get(j).toString();
                String[] split1 = temp1.split(" ");
                String[] split2 = temp2.split(" ");

                if (Integer.parseInt(split1[0]) < Integer.parseInt(split2[0])) {
                    temp = listaTemp.get(j);
                    listaTemp.set(j, listaTemp.get(i));
                    listaTemp.set(i, temp);
                }
            }

        }
        //linkedlist to listview
        for (Object o : listaTemp) {
            this.listaIniziativa.getItems().add(o);
        }


    }

    /**
     * Funzione per modificare la vita a un PG/PNG/Mostro all'interno dell'iniziativa
     */
    public void changeVita() {
        String rebuild;
        int vita=0;
        for(int i=0; i<listaIniziativa.getItems().size();i++){
            String[] split =listaIniziativa.getItems().get(i).toString().split(" ");
            if(split[1].compareTo(modificaNome.getText())==0){
                vita  = Integer.parseInt(split[2]);
                if(aggiungiVita.getText().trim().isEmpty()){
                    vita+=0;
                }else {
                    vita += Integer.parseInt(aggiungiVita.getText());
                }

                if(togliVita.getText().trim().isEmpty()){
                    vita-=0;
                }else {
                    vita -= Integer.parseInt(togliVita.getText());
                }

                rebuild=split[0]+" "+split[1]+" "+vita;
                listaIniziativa.getItems().set(i,rebuild);
            }


        }

    }
}

