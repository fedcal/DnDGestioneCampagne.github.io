package com.utilities.scheda;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Classe rappresentante la scheda Pg di un personaggio/mostro/png
 */
public class SchedaPG implements Serializable {
    /**
     * Nome del personaggio
     */
    private String nomePersonaggio;

    /**
     * Classe del personaggio
     */
    private String classePersonaggio;

    /**
     * Specializzazione del personaggio
     */
    private String specializzazionePersonaggio;

    /**
     * Razza del personaggio
     */
    private String razzaPersonaggio;

    /**
     * Livello del personaggio
     */
    private int livelloPersonaggio;

    /**
     * Punti esperienza del personaggio
     */
    private int puntiEsperienza;

    /**
     * Allineamento del personaggio
     */
    private String allineamentoPersonaggio;

    /**
     * Map rappresentante i tiri salvezza del personaggio
     */
    private Map<String, CheckMod> tiriSalvezza;

    /**
     * Map rappresentante i tiri e i modificatori correlati del personaggio
     */
    private Map<String,TiroMod> tiroMod;

    /**
     * Map rappresentante le abilità del personaggio
     */
    private Map<String, CheckMod> abilita;

    /**
     * Map rappresentante i tiri salvezza contro la morte di un personaggio
     */
    private Map<String,Integer> tsMorte;

    /**
     * Lista armi
     */
    private List<String> armi;

    /**
     * Lista incantesimi
     */
    private List<String> incantesimi;

    /**
     * Lista equipaggiamento
     */
    private List<String> equipaggiamento;

    /**
     * Ispirazione del personaggio
     */
    private int ispirazione;

    /**
     * Bonus competenza del personaggio
     */
    private int bonusCompetenza;

    /**
     * Saggezza passiva del personaggio
     */
    private int saggezzaPassiva;

    /**
     * Classe armatura del personaggio
     */
    private int classeArmatura;

    /**
     * Iniziativa del personaggio
     */
    private int iniziativa;

    /**
     * Velocità del personaggio
     */
    private int velocita;

    /**
     * Punti ferita
     */
    private int puntiFerita;
    /**
     * Dadi vita
     */
    private int dadiVita;

    /**
     * Punti ferita personaggio
     */
    private int puntiFeritaTemp;

    /**
     * Monete di rame
     */
    private int mr;

    /**
     * Monete di bronzo
     */
    private int mb;

    /**
     * Monete di platino
     */
    private int mp;

    /**
     * Monete d'oro
     */
    private int mo;

    /**
     * Monete d'argento
     */
    private int ma;

    /**
     * Costruttore di default
     */
    public SchedaPG(){}

    /**
     * Metodo per ottenere il nome del personaggio
     * @return String - nome personaggio
     */
    public String getNomePersonaggio() {
        return nomePersonaggio;
    }

    /**
     * Metodo per impostare il nome del personaggio
     * @param nomePersonaggio String - Nome del personaggio
     */
    public void setNomePersonaggio(String nomePersonaggio) {
        this.nomePersonaggio = nomePersonaggio;
    }

    /**
     * Metodo per ottenere la classe del personaggio
     * @return String - classe
     */
    public String getClassePersonaggio() {
        return classePersonaggio;
    }

    /**
     * Metodo per impostare la classe del personaggio
     * @param classePersonaggio String - Classe
     */
    public void setClassePersonaggio(String classePersonaggio) {
        this.classePersonaggio = classePersonaggio;
    }

    /**
     * Metodo per ottenere la specializzazione del personaggio
     * @return String - Specializzazione
     */
    public String getSpecializzazionePersonaggio() {
        return specializzazionePersonaggio;
    }

    /**
     * Metodo per impostare la specializzazione del personaggio
     * @param specializzazionePersonaggio String - Specializzazione
     */
    public void setSpecializzazionePersonaggio(String specializzazionePersonaggio) {
        this.specializzazionePersonaggio = specializzazionePersonaggio;
    }

    /**
     * Metodo per ottenere la razza del personaggio
     * @return String - Razza
     */
    public String getRazzaPersonaggio() {
        return razzaPersonaggio;
    }

    public void setRazzaPersonaggio(String razzaPersonaggio) {
        this.razzaPersonaggio = razzaPersonaggio;
    }

    public int getLivelloPersonaggio() {
        return livelloPersonaggio;
    }

    public void setLivelloPersonaggio(int livelloPersonaggio) {
        this.livelloPersonaggio = livelloPersonaggio;
    }

    public int getPuntiEsperienza() {
        return puntiEsperienza;
    }

    public void setPuntiEsperienza(int puntiEsperienza) {
        this.puntiEsperienza = puntiEsperienza;
    }

    public String getAllineamentoPersonaggio() {
        return allineamentoPersonaggio;
    }

    public void setAllineamentoPersonaggio(String allineamentoPersonaggio) {
        this.allineamentoPersonaggio = allineamentoPersonaggio;
    }

    public Map<String, CheckMod> getTiriSalvezza() {
        return tiriSalvezza;
    }

    public void setTiriSalvezza(Map<String, CheckMod> tiriSalvezza) {
        this.tiriSalvezza = tiriSalvezza;
    }

    /**
     * Metodo per ottenere i tiri e i relativi modificatori
     * @return Map {@literal <String, TiroMod} - map
     */
    public Map<String, TiroMod> getTiroMod() {
        return tiroMod;
    }

    /**
     * Metodo per impostare i tiri e i modificatori relativi
     * @param tiroMod Map {@literal <String,TiroMod>} - Map contenente i tiri con i modificatori
     */
    public void setTiroMod(Map<String, TiroMod> tiroMod) {
        this.tiroMod = tiroMod;
    }

    /**
     * Metodo per ottenere la lista delle abilità
     * @return Map {@literal <String,CheckMod>} -Map contenente le abilità
     */
    public Map<String, CheckMod> getAbilita() {
        return abilita;
    }

    /**
     * Metodo per impostare le abilità del personaggio
     * @param abilita Map{@literal <String,CheckMod>} - Map contenente tutte le abilità del personaggio
     */
    public void setAbilita(Map<String, CheckMod> abilita) {
        this.abilita = abilita;
    }

    /**
     * Metodo per ottenere i tiri salvezza contro la morte
     * @return Map {@literal <String,Integer>} - Map contenente tutti i tiri salvezza
     */
    public Map<String, Integer> getTsMorte() {
        return tsMorte;
    }

    /**
     * Metodo per impostare i tiri salvezza contro la morte
     * @param tsMorte Map {@literal <String,Integer>} - Map contenente tutti i tiri salvezza
     */
    public void setTsMorte(Map<String, Integer> tsMorte) {
        this.tsMorte = tsMorte;
    }

    /**
     *Metodo per ottenere la lista delle armi
     * @return List {@literal <String>} - Lista armi
     */
    public List<String> getArmi() {
        return armi;
    }

    /**
     * Metodo per impostare la lista delle armi
     * @param armi List {@literal <String>} - lista di armi
     */
    public void setArmi(List<String> armi) {
        this.armi = armi;
    }

    /**
     * Metodo per ottenere gli incantesimi
     * @return List {@literal <String>} - Lista incantesimi
     */
    public List<String> getIncantesimi() {
        return incantesimi;
    }

    /**
     * Metodo per impostre gli incantesimi
     * @param incantesimi  List {@literal <String>} - lista incantesimi
     */
    public void setIncantesimi(List<String> incantesimi) {
        this.incantesimi = incantesimi;
    }

    /**
     * Metodo per ottenere l'equipaggiamento del personaggio
     * @return List {@literal <String>} - Lista dell'equipaggiamento
     */
    public List<String> getEquipaggiamento() {
        return equipaggiamento;
    }

    /**
     * Metodo per impostare l'equipaggiamento
     * @param equipaggiamento List{@literal <String>} - lista equipaggiamento
     */
    public void setEquipaggiamento(List<String> equipaggiamento) {
        this.equipaggiamento = equipaggiamento;
    }

    /**
     * Metodo per ottenere l'ispirazione
     * @return  int - metodo per ottenere l'ispirazione
     */
    public int getIspirazione() {
        return ispirazione;
    }

    /**
     * Metodo per impostare l'ispirazione
     * @param ispirazione int - ispirazione
     */
    public void setIspirazione(int ispirazione) {
        this.ispirazione = ispirazione;
    }

    /**
     * Metodo per ottenere il bonus competenza
     * @return int - bonus competenza
     */
    public int getBonusCompetenza() {
        return bonusCompetenza;
    }

    /**
     * Metodo per impostare il bonus competenza
     * @param bonusCompetenza int - bonus competenza
     */
    public void setBonusCompetenza(int bonusCompetenza) {
        this.bonusCompetenza = bonusCompetenza;
    }

    /**
     * Metodo per ottenere la saggezza passiva
     * @return
     */
    public int getSaggezzaPassiva() {
        return saggezzaPassiva;
    }

    /**
     * Metodo per impostare la saggezza passiva
     * @param saggezzaPassiva
     */
    public void setSaggezzaPassiva(int saggezzaPassiva) {
        this.saggezzaPassiva = saggezzaPassiva;
    }

    /**
     * Metodo per ottenere la classe armatura
     * @return
     */
    public int getClasseArmatura() {
        return classeArmatura;
    }

    /**
     * Metodo per impostare la classe armatura
     * @param classeArmatura
     */
    public void setClasseArmatura(int classeArmatura) {
        this.classeArmatura = classeArmatura;
    }

    /**
     * Metodo per ottenere l'iniziativa
     * @return
     */
    public int getIniziativa() {
        return iniziativa;
    }

    /**
     * Metodo per impostare l'iniziativa
     * @param iniziativa int - iniziativa
     */
    public void setIniziativa(int iniziativa) {
        this.iniziativa = iniziativa;
    }

    /**
     * Metodo per ottenere la velocità del personaggio
     * @return int - velocità
     */
    public int getVelocita() {
        return velocita;
    }

    /**
     * Metodo per impostare la velocità del personaggio
     * @param velocita int - velocità
     */
    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    /**
     * Metodo per ottenere i punti ferita del personaggio
     * @return int - punti ferita
     */
    public int getPuntiFerita() {
        return puntiFerita;
    }

    /**
     * Metodo per impostare i punti ferita del personaggio
     * @param puntiFerita int - punti ferita
     */
    public void setPuntiFerita(int puntiFerita) {
        this.puntiFerita = puntiFerita;
    }

    /**
     * Metodo per ottenere i dati vita
     * @return int -  dadi vita
     */
    public int getDadiVita() {
        return dadiVita;
    }

    /**
     * Metodo per impostare i dadi vita del personaggio
     * @param dadiVita int - dadi vita
     */
    public void setDadiVita(int dadiVita) {
        this.dadiVita = dadiVita;
    }

    /**
     * Metodo per ottenere i punti ferita temporanei del personaggio
     * @return int - punti ferita temporanei
     */
    public int getPuntiFeritaTemp() {
        return puntiFeritaTemp;
    }

    /**
     * Metodo per impostare i punti ferita temporanei del personaggio
     * @param puntiFeritaTemp int - punti ferita temporanei
     */
    public void setPuntiFeritaTemp(int puntiFeritaTemp) {
        this.puntiFeritaTemp = puntiFeritaTemp;
    }

    /**
     * Metodo per impostare la quantità delle monete di rame
     * @return int - quantità monete
     */
    public int getMr() {
        return mr;
    }

    /**
     * Metodo per impostare la quantità delle monete di rame
     * @param mr int - monete di rame
     */
    public void setMr(int mr) {
        this.mr = mr;
    }

    /**
     * Metodo per ottenere la quantità delle monete di bronzo
     * @return int monete di bronzo
     */
    public int getMb() {
        return mb;
    }

    /**
     * Metodo per impostare la quantità di monete di bronzo del personaggio
     * @param mb int - monete di bronzo
     */
    public void setMb(int mb) {
        this.mb = mb;
    }

    /**
     * Metodo per ottenere la quantità delle monete di pltino
     * @return int - quantità monete di platino
     */
    public int getMp() {
        return mp;
    }

    /**
     * Metodo per impostare le monete di platino
     * @param mp int - monete di platino
     */
    public void setMp(int mp) {
        this.mp = mp;
    }

    /**
     * Metodo per ottenere la quantità dell monete d'oro
     * @return int - quantità monete d'oro
     */
    public int getMo() {
        return mo;
    }

    /**
     * Metodo per impostare la quantità delle monete d'oro
     * @param mo int - quantità monete d'oro
     */
    public void setMo(int mo) {
        this.mo = mo;
    }

    /**
     * Metodo per ottenere la quantità delle monete d'argento
     * @return int - monete argento
     */
    public int getMa() {
        return ma;
    }

    /**
     * Metodo per impostare le monete d'argento
     * @param ma int - quantità delle monete d'argento
     */
    public void setMa(int ma) {
        this.ma = ma;
    }
}
