package com.utilities.scheda;

import java.io.Serializable;

/**
 * Classe per verificare se una particolare abilità o un particolare tiro salvezza è stato selezionato e immagazzina
 * anche il suo valore. Implementa Serializable in quanto deve essere serializzata insieme alla classe SchedaPg
 */
public class CheckMod implements Serializable {
    /**
     * Attributo di tipo boolean che indica se l'abilità o il tiro salvezza è stato selezionato
     */
    private boolean check;
    /**
     * Attributo di tipo int rappresentante il valore relativo all'abilità o al tiro salvezza
     */
    private int valore;

    /**
     * Costruttore vuoto di classe
     */
    public CheckMod(){}

    /**
     * Costruttore contenente i parametri per popolare gli attributi i classe
     * @param check boolean - indica se l'abilità o il tiro salvezza sono stati selezionati
     * @param valore int - modificatore relativo all'abilità o al tiro salvezza
     */
    public CheckMod(boolean check, int valore){
        this.check=check;
        this.valore=valore;
    }

    /**
     * Metodo per verificare se l'abilità o il tiro salvezza è stato selezionato
     * @return bollean - True o False
     */
    public boolean isCheck() {
        return check;
    }

    /**
     * Impostare l'attibuto check relativo all'abilità o al tiro salvezza
     * @param check boolean - True o False
     */
    public void setCheck(boolean check) {
        this.check = check;
    }

    /**
     * Metodo per ottenere il valore relativo all'abilià o al tiro salvezza
     * @return int - valore relativo
     */
    public int getValore() {
        return valore;
    }

    /**
     * Metodo eper impostare il valore dell'abilità o del tiro salvezza
     * @param valore int - valore da inserire
     */
    public void setValore(int valore) {
        this.valore = valore;
    }
}
