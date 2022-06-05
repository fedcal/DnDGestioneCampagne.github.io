package com.utilities;

import java.io.Serializable;

/**
 * Classe di supporto per la gestione dei giocatori all'interno della sezione di ricerca giocatori e master e di inserimento all'interno del db.
 */
public class PlayersData implements Serializable {
    /**
     * Nome dell'utente
     */
    private String nome;

    /**
     * Usurname dell'utente riferito al suo account Telegram
     */
    private String usurnameTelegram;

    /**
     * Città in cui vive l'utente
     */
    private String citta;

    /**
     * Provincia in cui vive l'utente
     */
    private String provincia;

    /**
     * Gdr a cui l'utente gioca
     */
    private String gdrName;

    /**
     * Edizione del gdr a cui gioca l'utente
     */
    private String edizione;

    /**
     * Stringa per riferire se l'utente gioca online o meno
     */
    private String online;

    /**
     * Ruolo del giocatore (master/giocatore)
     */
    private String ruolo;

    /**
     * Costruttore di default della classe
     */
    public PlayersData() {
    }

    /**
     * Costruttore dell'oggetto con tutti i suoi parametri.
     * @param nome String - Nome dell'utente
     * @param usurnameTelegram String - Usurname dell'utente riferito al suo account Telegram
     * @param citta String - Città in cui vive l'utente
     * @param provincia String - Provincia in cui vive l'utente
     * @param gdrName String - Gdr a cui l'utente gioca
     * @param edizione String - Edizione del gdr a cui gioca l'utente
     * @param online String - Stringa per riferire se l'utente gioca online o meno
     * @param ruolo String - Ruolo del giocatore (master/giocatore)
     */
    public PlayersData(String nome, String usurnameTelegram, String citta, String provincia, String gdrName, String edizione, String online, String ruolo) {
        this.nome = nome;
        this.usurnameTelegram = usurnameTelegram;
        this.citta = citta;
        this.provincia = provincia;
        this.gdrName = gdrName;
        this.edizione = edizione;
        this.online = online;
        this.ruolo = ruolo;
    }

    /**
     * Ottenere il nome del giocatore
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Impostare il nome del giocatore
     * @param nome String - nome utente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Ottenere l'usurname di Telegram dell'utente
     * @return String
     */
    public String getUsurnameTelegram() {
        return usurnameTelegram;
    }

    /**
     * Impostare l'usurname di Telegram dell'utente
     * @param usurnameTelegram String - usurname Telegram utente
     */
    public void setUsurnameTelegram(String usurnameTelegram) {
        this.usurnameTelegram = usurnameTelegram;
    }

    /**
     * Ottenere la città in cui vive l'utente
     * @return String
     */
    public String getCitta() {
        return citta;
    }

    /**
     * Impostare la città in cui vive l'utente
     * @param citta String - città utente
     */
    public void setCitta(String citta) {
        this.citta = citta;
    }

    /**
     * Ottenere la provincia dell'utente
     * @return String
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Impostare la provincia in cui vive l'utente
     * @param provincia String - provincia
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Ottenere il Gdr a cui gioca l'utente
     * @return  String
     */
    public String getGdrName() {
        return gdrName;
    }

    /**
     * Impostare il Gdr a cui gioca l'utente
     * @param gdrName String - nome Gdr
     */
    public void setGdrName(String gdrName) {
        this.gdrName = gdrName;
    }

    /**
     * Ottenere l'edizione del gdr a cui l'utente gioca
     * @return String
     */
    public String getEdizione() {
        return edizione;
    }

    /**
     * Impostare l'edizione del Gdr a cui l'utente gioca
     * @param edizione String - edizione
     */
    public void setEdizione(String edizione) {
        this.edizione = edizione;
    }

    /**
     * Ottenere se l'utente gioca online o fisicamente
     * @return String
     */
    public String getOnline() {
        return online;
    }

    /**
     * Impostare se l'utente preferisce giocare online o fisicamente
     * @param online String - scelta tra online o fisicamente
     */
    public void setOnline(String online) {
        this.online = online;
    }

    /**
     * Ottenere il ruolo dell'utente in cui gioca
     * @return String
     */
    public String getRuolo() {
        return ruolo;
    }

    /**
     * Impostare il ruolo nel quale l'utente gioca
     * @param ruolo String - ruolo
     */
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    /**
     * Override del metodo toString ereditato da Object per visualizzare le informazione dell'utente
     * @return String
     */
    @Override
    public String toString(){
        return this.getNome()+" "+this.usurnameTelegram+" "+this.citta+" ("+this.provincia+") "+this.gdrName+" "+this.edizione+" online: "+this.online+" "+this.ruolo;
    }
}
