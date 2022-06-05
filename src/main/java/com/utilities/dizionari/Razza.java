package com.utilities.dizionari;

import org.jetbrains.annotations.NotNull;

public class Razza implements Comparable<Razza>{
    private String nomeRazza;
    private String incrementoPunteggi;
    private String eta;
    private String allineamento;
    private String taglia;
    private float velocita;
    private String linguaggi;
    private String manualeAppartenza;
    private String altro;
    private String sottoRazze;

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

    public String getNomeRazza() {
        return nomeRazza;
    }

    public String getIncrementoPunteggi() {
        return incrementoPunteggi;
    }

    public String getEta() {
        return eta;
    }

    public String getAllineamento() {
        return allineamento;
    }

    public String getTaglia() {
        return taglia;
    }

    public float getVelocita() {
        return velocita;
    }

    public String getLinguaggi() {
        return linguaggi;
    }

    public String getManualeAppartenza() {
        return manualeAppartenza;
    }

    public String getAltro() {
        return altro;
    }

    public String getSottoRazze() {
        return sottoRazze;
    }

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
