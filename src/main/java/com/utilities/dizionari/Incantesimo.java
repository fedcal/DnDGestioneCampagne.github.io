package com.utilities.dizionari;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Classe utilizzata per creare un dizionario di incantesimi
 */
public class Incantesimo implements Comparable<Incantesimo>{
    /**
     * Nome incnatesimo
     */
    private String nomeIncantesimo;

    /**
     * Livello incantesimo
     */
    private String livello;

    /**
     * Descrizione incantesimo
     */
    private String descrizione;

    /**
     * Tempo di lancio dell'incantesimo
     */
    private String tempoLancio;

    /**
     * Lista di componenti dell'incantesimo
     */
    private String componenti;

    /**
     * Durata incantesimo
     */
    private String durata;

    /**
     * Gittata entro la quale può essere lanciato l'incantesimo
     */
    private String gittata;

    /**
     * Tipo incantesimo
     */
    private String tipo;

    /**
     * Lista di classe a cui appartiene l'incantesimo
     */
    private String classiAppartenenza;

    /**
     * Costruttore di base senza parametri
     */
    public Incantesimo(){}

    /**
     * Costruttore con parametri
     * @param nomeIncantesimo Nome incantesimo
     * @param livello Livello incantesimo
     * @param tempoLancio Tempo di lancio
     * @param componenti Componenti incantesimo
     * @param durata Durata incantesimo
     * @param gittata Gittata incantesimo
     * @param tipo Tipo incantesimo
     * @param classiAppartenenza Classi di appartenenza
     * @param descrizione Descrizione dell'incantesimo
     */
    public Incantesimo(String nomeIncantesimo, String livello, String tempoLancio, String componenti, String durata, String gittata, String tipo, String classiAppartenenza, String descrizione) {
        this.nomeIncantesimo = nomeIncantesimo;
        this.livello = livello;
        this.descrizione = descrizione;
        this.tempoLancio = tempoLancio;
        this.componenti = componenti;
        this.durata = durata;
        this.gittata = gittata;
        this.tipo = tipo;
        this.classiAppartenenza = classiAppartenenza;
    }

    /**
     * Metodo per impostare il nome dell'incantesimo
     * @return String - nome dell'incantesimo
     */
    public String getNomeIncantesimo() {
        return nomeIncantesimo;
    }

    /**
     * Metodo per impostare il nome dell'incantesimo
     * @param nomeIncantesimo String - nome dell'incantesimo
     */
    public void setNomeIncantesimo(String nomeIncantesimo) {
        this.nomeIncantesimo = nomeIncantesimo;
    }

    /**
     * Metodo per ottenere il livello dell'incantesimo
     * @return String - livello dell'incantesimo
     */
    public String getLivello() {
        return livello;
    }

    /**
     * Metodo per impostare il livello dell'incantesimo
     * @param livello String - livello dell'incantesimo
     */
    public void setLivello(String livello) {
        this.livello = livello;
    }

    /**
     * Metodo per ottenere la descrizione dell'incantesimo
     * @return String - descrizione dell'incantesimo
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Metodo per impostare la descrizione dell'incantesimo
     * @param descrizione String - descrizione dell'incantesimo
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * Metodo per ottenere il tempo di lancio dell'incantesimo
     * @return String - Tempo lancio incantesimo
     */
    public String getTempoLancio() {
        return tempoLancio;
    }

    /**
     * Metodo per impostare il tempo di lanci dell'incantesimo
     * @param tempoLancio   String - Tempo lancio dell'incantesimo
     */
    public void setTempoLancio(String tempoLancio) {
        this.tempoLancio = tempoLancio;
    }

    /**
     * Metodo per ottenere i componenti dell'incantesimo
     * @return String - Componenti dell'incantesimo
     */
    public String getComponenti() {
        return componenti;
    }

    /**
     * Metodo per impostare i componenti necessari dell'incantesimo
     * @param componenti String - Componenti dell'incantesimo
     */
    public void setComponenti(String componenti) {
        this.componenti = componenti;
    }

    /**
     * Metodo per ottenere la durata dell'incantesimo
     * @return String - durata dell'incantesimo
     */
    public String getDurata() {
        return durata;
    }

    /**
     * Metodo per impostare la durata dell'incantesiom
     * @param durata String - durata dell'incantesimo
     */
    public void setDurata(String durata) {
        this.durata = durata;
    }

    /**
     * Metodo per ottenere la classe di appartenenza dell'incantesimo
     * @return String - Classe di appartenenza
     */
    public String getClassiAppartenenza() {
        return classiAppartenenza;
    }

    /**
     * Metoo per impostare la classe di appartenenza dell'incantesimo
     * @param classiAppartenenza String - Classe di appartenenza
     */
    public void setClassiAppartenenza(String classiAppartenenza) {
        this.classiAppartenenza = classiAppartenenza;
    }

    @Override
    public int compareTo(@NotNull Incantesimo o) {
        if(o.getNomeIncantesimo().compareTo(this.nomeIncantesimo)==0){
            return 0;
        }else if(o.getNomeIncantesimo().compareTo((this.nomeIncantesimo))>0){
            return 1;
        }else{
            return -1;
        }
    }
    @Override
    public String toString(){
        return "Nome incantesimo: "+ this.nomeIncantesimo+"\nLivello: "+this.livello+"\nTempo lancio: "+this.tempoLancio+"\nDurata: "+this.durata+"\nClassi di appartenenza: (da implemetare)"+"\nDescrizione: "+this.descrizione;
    }
}
