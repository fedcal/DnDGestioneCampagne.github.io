package com.gestionalednd;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.LinkedList;

/**
 * Controller per la gestione del lancio dei dadi
 */
public class DadiController {

    /**
     * fx:id per identificare il RadioButton relativo al dado a 3 facce
     */
    @FXML
    private RadioButton tre;

    /**
     * fx:id per identificare il RadioButton relativo al dado a 4 facce
     */
    @FXML
    private RadioButton quattro;

    /**
     * fx:id per identificare il RadioButton relativo al dado a 6 facce
     */
    @FXML
    private RadioButton sei;

    /**
     * fx:id per identificare il RadioButton relativo al dado a 100 facce
     */
    @FXML
    private RadioButton cento;

    /**
     * fx:id per identificare il RadioButton relativo al dado a 20 facce
     */
    @FXML
    private RadioButton venti;

    /**
     * fx:id per identificare il RadioButton relativo al dado a 12 facce
     */
    @FXML
    private RadioButton dodici;

    /**
     * fx:id per identificare il RadioButton relativo al dado a 10 facce
     */
    @FXML
    private RadioButton dieci;

    /**
     * fx:id per identificare il RadioButton relativo al dado a 8 facce
     */
    @FXML
    private RadioButton otto;

    /**
     * fx:id per identificare il TextFiled relativo al numero di dadi da lanciare
     */
    @FXML
    private TextField numeroDadi;

    /**
     * fx:id per identificare il Label relativo al totale del lancio dei dadi
     */
    @FXML
    private Label totaleDadi;

    /**
     * fx:id per identificare la ListView relativa ai singoli lanci dei vari dadi
     */
    @FXML
    private ListView listaTiri;

    /**
     * fx:id per identificare il TextField relativo all'espressione che l'utente inserisce per il lancio dei dadi
     */
    @FXML
    private TextField espressioneDadi;

    /**
     * Lista contenente i lanci di un singolo dado
     */
    private LinkedList<Integer> tiriSingoli;

    /**
     * Funzione per il lancio dei dadi. In base al RadioButton che viene selezionato, richiama in maniera opportuna
     * la funzione randomLancio(int numeriDadi, int tipoDado)
     */
    @FXML
    protected void lanciaDadi(){
        if(!listaTiri.getItems().isEmpty()){
            listaTiri.getItems().clear();
        }
        if(tre.isSelected()){
            randomLancio(Integer.parseInt(numeroDadi.getText()),3);
        }else if(quattro.isSelected()){
            randomLancio(Integer.parseInt(numeroDadi.getText()),4);
        }else if(sei.isSelected()){
            randomLancio(Integer.parseInt(numeroDadi.getText()),6);
        }else if(otto.isSelected()){
            randomLancio(Integer.parseInt(numeroDadi.getText()),8);
        }else if(dieci.isSelected()){
            randomLancio(Integer.parseInt(numeroDadi.getText()),10);
        }else if(dodici.isSelected()){
            randomLancio(Integer.parseInt(numeroDadi.getText()),12);
        }else if(venti.isSelected()){
            randomLancio(Integer.parseInt(numeroDadi.getText()),20);
        }else if(cento.isSelected()){
            randomLancio(Integer.parseInt(numeroDadi.getText()),100);
        }

    }

    /**
     * Funzione per popolare la lista di lanci relativa al dado che si vuole lancire.
     *
     * @param numeriDadi quanti dadi si vuole lanciare
     * @param tipoDado tipo di dado che si vuole lanciare
     */
    private void randomLancio(int numeriDadi, int tipoDado){
        int totale=0;
        int rand=0;
        tiriSingoli= new LinkedList<>();
        listaTiri.getItems().add("Lanci dado a "+tipoDado+" facce");
        for(int i=0;i<numeriDadi;i++){
            switch (tipoDado){
                case 3:
                    rand= (int)(Math.random()*2)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 4:
                    rand= (int)(Math.random()*3)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 6:
                    rand= (int)(Math.random()*5)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 8:
                    rand= (int)(Math.random()*7)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 10:
                    rand= (int)(Math.random()*9)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 12:
                    rand= (int)(Math.random()*11)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 20:
                    rand= (int)(Math.random()*19)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 100:
                    rand= (int)(Math.random()*99)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
            }
        }
        listaTiri.getItems().add("");
        totaleDadi.setText(String.valueOf(totale));
    }

    /**
     * Funzione che risolve l'espressione inserita dall'utente per il lancio dei dadi, verificando se contiene o meno il termine +.
     * L'espressione inserita dall'utente può essere di due tipi: '1d20' per lanciare solo un dado a 20 facce oppure '5d20+3d8' per lanciare
     * 5 dadi a 20 facce più 3 dadi a 8 facce
     */
    public void lanciaEspressioneDadi() {
        int facce, numeroDadi;
        if(!espressioneDadi.getText().contains("+")){
            if(!listaTiri.getItems().isEmpty()){
                listaTiri.getItems().clear();
            }
            String[] splitDado=espressioneDadi.getText().split("d");
            numeroDadi=Integer.parseInt(splitDado[0]);
            facce=Integer.parseInt(splitDado[1]);
            randomLancio(numeroDadi,facce);
        }else{
            if(!listaTiri.getItems().isEmpty()){
                listaTiri.getItems().clear();
            }
            String bySplit="\\+";
            String[] splitDado=espressioneDadi.getText().split(bySplit);
            int totaleDadiEspressione=0;
            for(int i=0; i<splitDado.length;i++){
                totaleDadiEspressione+=lanciaEspressione(splitDado[i]);
            }
            totaleDadi.setText(String.valueOf(totaleDadiEspressione));
        }
    }

    /**
     * Funzione per risolvere l'espressione del lancio del dado inserita dall'utente nel caso in cui contenga solo la lettera 'd'
     * @param espressione di tipo String, rappresentante l'espressione inserita dall'utente
     * @return restituisce un intero, rappresentate il risultato del lancio di uno specifico dado
     */
    private int lanciaEspressione(String espressione){
        int facce, numeroDadi;
        String[] splitDado=espressione.split("d");
        numeroDadi=Integer.parseInt(splitDado[0]);
        facce=Integer.parseInt(splitDado[1]);
        return randomLancioEspressione(numeroDadi,facce);
    }

    /**
     * Metodo per il lancio del dado mediante un'espressione. Popola la lista dei tiri singoli e ne calcola il totale
     * @param numeriDadi int - numero di dadi
     * @param tipoDado int - tipo di dado rappresentante il numero di facce su di esso
     * @return int - totale dei tiri
     */
    private int randomLancioEspressione(int numeriDadi, int tipoDado){
        int totale=0;
        int rand=0;
        tiriSingoli= new LinkedList<>();
        listaTiri.getItems().add("Lanci dado a "+tipoDado+" facce");
        for(int i=0;i<numeriDadi;i++){
            switch (tipoDado){
                case 3:
                    rand= (int)(Math.random()*2)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 4:
                    rand= (int)(Math.random()*3)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 6:
                    rand= (int)(Math.random()*5)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 8:
                    rand= (int)(Math.random()*7)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 10:
                    rand= (int)(Math.random()*9)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 12:
                    rand= (int)(Math.random()*11)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 20:
                    rand= (int)(Math.random()*19)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
                case 100:
                    rand= (int)(Math.random()*99)+1;
                    listaTiri.getItems().add(rand);
                    totale+=rand;
                    break;
            }
        }
        listaTiri.getItems().add("");
        listaTiri.getItems().add("Totale lancio dado a "+tipoDado+" facce: "+totale);
        return totale;
    }
}
