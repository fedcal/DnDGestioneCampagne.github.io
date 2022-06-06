package com.utilities.dizionari;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Classe per la rappresentazione delle armi
 */
public class Arma implements Comparable<Arma>{
    /**
     * Nome dell'arma
     */
    private String nomeArma;

    /**
     * Tipo dell'arma
     */
    private String tipoArma;

    /**
     * Dadi per il calcolo del danno dell'arma
     */
    private String dadiDanno;

    /**
     * Tipo di danni inflitti dall'arma
     */
    private String tipoDanni;

    /**
     * Costo dell'arma
     */
    private String costo;

    /**
     * Peso dell'arma
     */
    private float peso;

    /**
     * Proprietà dell'arma
     */
    private String proprieta;


    /**
     * Costruttore di classe senza argomenti
     */
    public Arma(){}

    /**
     * Costruttore di classe con argomenti
     * @param nomeArma Nome dell'arma
     * @param tipoArma Tipo dell'arma
     * @param dadiDanno Dadi per il calcolo del danno dell'arma
     * @param tipoDanni Tipo di danni inflitti dall'arma
     * @param costo Costo dell'arma
     * @param peso Peso dell'arma
     * @param proprieta Proprietà dell'arma
     */
    public Arma(String nomeArma, String tipoArma, String dadiDanno, String tipoDanni, String costo, float peso, String proprieta) {
        this.nomeArma = nomeArma;
        this.tipoArma = tipoArma;
        this.dadiDanno = dadiDanno;
        this.tipoDanni = tipoDanni;
        this.costo = costo;
        this.peso = peso;
        this.proprieta = proprieta;
    }

    /**
     * Metodo per ottenere il nome dell'arma
     * @return String - Nome dell'arma
     */
    public String getNomeArma() {
        return nomeArma;
    }

    /**
     * Metodo per impostare il nome dell'arma
     * @param nomeArma String - Nome arma
     */
    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    /**
     * Metodo per ottenere il tipo dell'arma
     * @return String - Tipo dell'arma
     */
    public String getTipoArma() {
        return tipoArma;
    }

    /**
     * Metodo per impostare il tipo dell'arma
     * @param tipoArma String - Tipo arma
     */
    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    /**
     * Metodo per ottenere i dadi per il calcolo dei danni
     * @return String - dadi per il calcolo del danno
     */
    public String getDadiDanno() {
        return dadiDanno;
    }

    /**
     * Metodo per impostare i dadi dell'arma per il calcolo dei danni
     * @param dadiDanno String - Dadi per il calcolo del danno
     */
    public void setDadiDanno(String dadiDanno) {
        this.dadiDanno = dadiDanno;
    }

    /**
     * Metodo per ottenere i tipi di danno che l'arma infligge
     * @return String - tipo di danno inferto
     */
    public String getTipoDanni() {
        return tipoDanni;
    }

    /**
     * Metodo per impostare i tipi di danno inferto dall'arma
     * @param tipoDanni String - tipo di danno inferto dall'arma
     */
    public void setTipoDanni(String tipoDanni) {
        this.tipoDanni = tipoDanni;
    }

    /**
     * Metodo per ottenere il costo dell'arma
     * @return String - costo dell'arma
     */
    public String getCosto() {
        return costo;
    }

    /**
     * Metodo per impostare il costo dell'arma
     * @param costo String - costo dell'arma
     */
    public void setCosto(String costo) {
        this.costo = costo;
    }

    /**
     * Metodo per ottenere il peso dell'arma
     * @return float - peso dell'arma
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Metodo per impostare il peso dell'arma
     * @param peso float - peso dell'arma
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Metodo per ottenere le proprietà dell'arma
     * @return String - proprietà dell'arma
     */
    public String getProprieta() {
        return proprieta;
    }

    /**
     * Metodo per impostare le proprietà dell'arma
     * @param proprieta Caratteristiche particolari che contraddistinguono l'arma
     */
    public void setProprieta(String proprieta) {
        this.proprieta = proprieta;
    }

    @Override
    public String toString(){
        return this.nomeArma;
    }

    @Override
    public int compareTo(@NotNull Arma o) {
        if(this.nomeArma.compareTo(o.getNomeArma())==0){
            return 0;
        }else if(this.nomeArma.compareTo(o.getNomeArma())>0){
            return 1;
        }else{
            return -1;
        }

    }
}
