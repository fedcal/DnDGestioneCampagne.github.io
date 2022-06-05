package com.utilities.scheda;

import java.io.Serializable;

/**
 * Classe per rappresentare i tiri e i modificatori relativi all'interno della scheda del PG/Mostro/PNG. Implementa
 * Serializable in quanto deve essere serializzata all'interno di un file insieme all'oggetto SchdaPg
 */
public class TiroMod implements Serializable {
    /**
     * Rappresenta il tiro effettuato
     */
    private int tiro;
    /**
     * Rappresenta il modificato relativo al tiro
     */
    private int mod;

    /**
     * Costruttore di classe senza argomenti
     */
    public TiroMod(){}

    /**
     * Costruttore di classe con i relativi argomenti per popolare gli attributi di classe
     * @param tiro int - Tiro effettuato
     * @param mod int - Modificatore relativo
     */
    public TiroMod(int tiro, int mod){
        this.tiro=tiro;
        this.mod=mod;
    }

    /**
     * Metodo per ottenere il tiro effettuato
     * @return int - Tiro effettuato
     */
    public int getTiro() {
        return tiro;
    }

    /**
     * Metodo per impostare il risultato del tiro del dado
     * @param tiro int - Risultato del dado
     */
    public void setTiro(int tiro) {
        this.tiro = tiro;
    }

    /**
     * Metodo per ottenere il modificatore relativo al tiro di dado effettuato
     * @return int - Modificatore
     */
    public int getMod() {
        return mod;
    }

    /**
     * Metodo per impostare il modificatore relativo al lancio del dado
     * @param mod int - Modificatore
     */
    public void setMod(int mod) {
        this.mod = mod;
    }
}
