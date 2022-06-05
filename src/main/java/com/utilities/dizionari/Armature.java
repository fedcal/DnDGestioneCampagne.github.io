package com.utilities.dizionari;

import org.jetbrains.annotations.NotNull;

/**
 * Classe per rappresentare le armature
 */
public class Armature implements Comparable<Armature>{
    /**
     * Nome dell'armatura
     */
    private String nomeArmatura;

    /**
     * Tipo dell'armatura
     */
    private String tipoArmatura;

    /**
     * Costo dell'armatura
     */
    private String costo;

    /**
     * Classe dell'armatura
     */
    private String classeArmatura;

    /**
     * Forza necessaria per l'armatura
     */
    private String forza;

    /**
     * Attributo per indicare se l'armatura da svantaggio alla furtività
     */
    private String furtivita;

    /**
     * Peso dell'armatura
     */
    private float peso;

    /**
     * Costruttore di default della classe senza parametri
     */
    public Armature(){}

    /**
     * Costruttore di classe con parametri
     * @param nomeArmatura String - Nome dell'armatura
     * @param tipoArmatura String - Tipo armatura
     * @param costo String - Costo dell'armatura
     * @param classeArmatura String - Classe armatura
     * @param forza String - Forza necessaria dell'armatura
     * @param furtivita String - Se l'armatura influenza la furtività
     * @param peso String - Peso dell'armatura
     */
    public Armature(String nomeArmatura, String tipoArmatura, String costo, String classeArmatura, String forza, String furtivita, float peso) {
        this.nomeArmatura = nomeArmatura;
        this.tipoArmatura = tipoArmatura;
        this.costo = costo;
        this.classeArmatura = classeArmatura;
        this.forza = forza;
        this.furtivita = furtivita;
        this.peso = peso;
    }

    /**
     * Metodo per ottenere il nome dell'armatura
     * @return String - nome armatura
     */
    public String getNomeArmatura() {
        return nomeArmatura;
    }

    /**
     * Ovveride della funzione toString per visualizzare gli attributi di classe
     * @return String - attributi di classe
     */
    @Override
    public String toString(){
        return "Nome armatura: "+ this.nomeArmatura+"\nTipo armatura: "+this.tipoArmatura+"\nCosto armatura: "+this.costo+"\nClasse armatura: "+this.classeArmatura+"\nForza: "+this.forza+"\nFurtività: "+this.furtivita+"\nPeso: "+this.peso;
    }

    /**
     * Ovverride della funzione compareTo per ordinare l'insieme delle armature
     * @param o Oggetto di tipo Armatura da confrontare
     * @return int - 0 se sono uguali, 1 se l'oggetto passato è maggiore, -1 se il minore
     */
    @Override
    public int compareTo(@NotNull Armature o) {
        if(o.getNomeArmatura().compareTo(this.nomeArmatura)==0){
            return 0;
        }else if(o.getNomeArmatura().compareTo(this.nomeArmatura)<0){
            return 1;
        }else{
            return -1;
        }
    }
}
