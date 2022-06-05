package com.utilities.dizionari;

import org.jetbrains.annotations.NotNull;

/**
 * Classe per rappresentare la classe equipaggiamento del personaggio
 */
public class Equipaggiamento implements Comparable<Equipaggiamento>{
    /**
     * Nome dell'equipaggiamento
     */
    private String nomeEquipaggiamento;

    /**
     * Descrizione dell'equipaggiamento
     */
    private String descrizione;


    /**
     * Peso dell'oggetto
     */
    private float peso;

    /**
     * Costo dell'oggetto
     */
    private String costo;

    /**
     * Costruttore di default della classe.
     */
    public Equipaggiamento(){}

    /**
     * Costruttore di classe con parametri
     * @param nomeEquipaggiamento Nome dell'oggetto
     * @param descrizione Descrizione dell'oggetto
     * @param peso  Peso dell'oggetto
     * @param costo Costo dell'oggetto
     */
    public Equipaggiamento(String nomeEquipaggiamento, String descrizione, float peso, String costo) {
        this.nomeEquipaggiamento = nomeEquipaggiamento;
        this.descrizione = descrizione;
        this.peso = peso;
        this.costo = costo;
    }

    /**
     * Metodo per ottenere il nome dell'oggetto
     * @return String - nome oggetto
     */
    public String getNomeEquipaggiamento() {
        return nomeEquipaggiamento;
    }

    /**
     * Metoo per impostare il nome dell'oggetto dell'equipaggiamento
     * @param nomeEquipaggiamento String - Nome oggetto
     */
    public void setNomeEquipaggiamento(String nomeEquipaggiamento) {
        this.nomeEquipaggiamento = nomeEquipaggiamento;
    }

    /**
     * Metodo per impostare la descrizione dell'oggetto
     * @return String - descrizione dell'oggetto
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Metodo per ottenere la descrizione dell'oggetto
     * @param descrizione String - Descrizione dell'oggetto
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * Metodo per ottenere il peso dell'oggetto
     * @return float - peso dell'oggetto
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Metodo per impostare il peso dell'oggetto
     * @param peso float - peso dell'oggetto
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Metodo per ottenere il costo dell'oggetto
     * @return String - costo dell'oggetto
     */
    public String getCosto() {
        return costo;
    }

    /**
     * Metodo per impostare il costo dell'oggetto
     * @param costo String - costo dell'oggetto
     */
    public void setCosto(String costo) {
        this.costo = costo;
    }

    /**
     * Ovverie toString ereditato dalla classe Object
     * @return String - proprietà dei membri
     */
    @Override
    public String toString(){
        if (this.peso==0F){
            return "Nome oggetto: "+this.nomeEquipaggiamento+"\nPeso: Trascurabile"+"\nCosto: "+this.costo+"\nDescrizione: "+this.descrizione;
        }else{
            return "Nome oggetto: "+this.nomeEquipaggiamento+"\nPeso: "+this.peso+"kg"+"\nCosto: "+this.costo+"\nDescrizione: "+this.descrizione;
        }
    }

    @Override
    public int compareTo(@NotNull Equipaggiamento o) {
        if(this.nomeEquipaggiamento.compareTo(o.getNomeEquipaggiamento())==0){
            return 0;
        }else if(this.nomeEquipaggiamento.compareTo(o.getNomeEquipaggiamento())>0){
            return 1;
        }else{
            return -1;
        }

    }
}
