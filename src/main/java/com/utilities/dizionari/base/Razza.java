package com.utilities.dizionari.base;

import org.jetbrains.annotations.NotNull;

/**
 * Classe per la rappresentazione della Razza di {@literal D&D} a supporto della relativa classe dizionario
 */
public class Razza implements Comparable<Razza>{
    /**
     * String - Nome della razza
     */
    private String nomeRazza;
    /**
     * String - Valori relativo all'incremento dei punteggi caratteristica della razza
     */
    private String incrementoPunteggi;
    /**
     * String - Età della razza
     */
    private String eta;
    /**
     * String - Allineamento tipico della razza
     */
    private String allineamento;
    /**
     * String - Taglia della Razza
     */
    private String taglia;
    /**
     * Float - Velocità della razza
     */
    private float velocita;
    /**
     * String - Linguaggi che la classe può parlare
     */
    private String linguaggi;
    /**
     * String - Manuale di Appartenenza della classe
     */
    private String manualeAppartenza;
    /**
     * String - Altre caratteristiche particolari della razza
     */
    private String altro;
    /**
     * String - Sottorazze della classe principale
     */
    private String sottoRazze;

    /**
     * Costruttore di classe per popolare gli attributi di classe
     * @param nomeRazza String - nome della classe
     * @param incrementoPunteggi String - Incremento dei punteggi caratteristica del personaggio
     * @param eta String - Età della razza
     * @param allineamento String - Allineamenti tipici della razza
     * @param taglia String - Taglia della razza
     * @param velocita Float - Velocità della razza
     * @param linguaggi String - Linguaggi che la razza può parlare
     * @param manualeAppartenza String - Manuale di appartenenza della classe
     * @param altro String - Caratteristiche aggiuntive della razza
     * @param sottoRazze String - Sottorazze della razza
     */
    public Razza(String nomeRazza, String incrementoPunteggi, String eta, String allineamento, String taglia, float velocita, String linguaggi, String manualeAppartenza, String altro, String sottoRazze) {
        this.nomeRazza = nomeRazza;
        this.incrementoPunteggi = incrementoPunteggi;
        this.eta = eta;
        this.allineamento = allineamento;
        this.taglia = taglia;
        this.velocita = velocita;
        this.linguaggi = linguaggi;
        this.manualeAppartenza = manualeAppartenza;
        this.altro = altro;
        this.sottoRazze = sottoRazze;
    }

    /**
     * Metodo per ottenere il nome della razza
     * @return String
     */
    public String getNomeRazza() {
        return nomeRazza;
    }

    /**
     * Metodo per ottenere gli incrementi dei punteggi delle caratteristiche
     * @return String
     */
    public String getIncrementoPunteggi() {
        return incrementoPunteggi;
    }

    /**
     * Metodo per ottenere l'età della razza
     * @return  String
     */
    public String getEta() {
        return eta;
    }

    /**
     * Metodo per ottenere gli allineamenti tipici della razza
     * @return String
     */
    public String getAllineamento() {
        return allineamento;
    }

    /**
     * Metodo per ottenere la taglia della razza
     * @return  String
     */
    public String getTaglia() {
        return taglia;
    }

    /**
     * Metodo per ottenere la velocità della razza
     * @return Float
     */
    public float getVelocita() {
        return velocita;
    }

    /**
     * Metodo per ottenere i linguaggi della razza
     * @return  String
     */
    public String getLinguaggi() {
        return linguaggi;
    }

    /**
     * Metodo per ottenere il manuale di appartenenza della razza
     * @return  String
     */
    public String getManualeAppartenza() {
        return manualeAppartenza;
    }

    /**
     * Metodo per ottenere altri dettagli della razza
     * @return String
     */
    public String getAltro() {
        return altro;
    }

    /**
     * Metodo per ottenere le sottorazze della razza
     * @return String
     */
    public String getSottoRazze() {
        return sottoRazze;
    }

    /**
     *
     * Ovveride del metodo compareTo per stabilire una relazione d'ordine tra i vari oggetti di tipo Razza. Utile quando
     * si crea il dizionario relativo di tipo TreeSet
     * @param o Oggetto di tipo Razza che deve essere confrontato con l'oggetto this
     * @return  Int - -1 se l'oggetto passato come argomento è minore di this, 0 se i due oggetti sono uguali, 1 se l'oggetto
     * passato alla funzione è maggiore rispetto all'oggetto this.
     */
    @Override
    public int compareTo(@NotNull Razza o) {
        if(this.nomeRazza.compareTo(o.getNomeRazza())<0){
            return -1;
        }else if(this.nomeRazza.compareTo(o.getNomeRazza())==0){
            return 0;
        }else{
            return 1;
        }
    }
}
