package com.gestionalednd;

import com.utilities.scheda.CheckMod;
import com.utilities.scheda.SchedaPG;
import com.utilities.scheda.TiroMod;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Controller per la gestione della scheda del pg/png/mostro
 */
public class SchedaController {
    /**
     * fx:id del TextField rappresentante il nome dell'arma
     */
    @FXML
    private TextField nomeArma;
    /**
     * fx:id del TextField rappresentante il nome dell'incantesimo
     */
    @FXML
    private TextField nomeIncantesimo;
    /**
     * fx:id del TextField rappresentante il nome dell'equipaggiamento
     */
    @FXML
    private TextField nomeEquipaggiamento;
    /**
     * fx:id del Button per salvare la scheda
     */
    @FXML
    private Button salvaScheda;

    /**
     * fx:id del TextField per inserire il nome del personaggio
     */
    @FXML
    private TextField nomePersonaggio;

    /**
     * fx:id del TextField per inserire la classe del personaggio
     */
    @FXML
    private TextField classePersonaggio;

    /**
     * fx:id del TextField per inserire la specializzazione del personaggio
     */
    @FXML
    private TextField specializzazionePersonaggio;

    /**
     * fx:id del TextField per inserire il livello del personaggio
     */
    @FXML
    private TextField livelloPersonaggio;

    /**
     * fx:id del TextField per inserire la razza del personaggio
     */
    @FXML
    private TextField razzaPersonaggio;

    /**
     * fx:id del TextField per inserire i punti esperienza del personaggio
     */
    @FXML
    private TextField puntiEsperienza;

    /**
     * fx:id del TextField per inserire l'allineamento del personaggio
     */
    @FXML
    private TextField allineamentoPErsonaggio;

    /**
     * fx:id del TextField per inserire lancio relativo al carisma del
     * personaggio
     */
    @FXML
    private TextField tiroCarisma;

    /**
     * fx:id del TextField per inserire il modificatore relativo al carisma del
     * personaggio
     */
    @FXML
    private TextField modCarisma;

    /**
     * fx:id del TextField per inserire il lancio relativo alla saggezza del
     * personaggio
     */
    @FXML
    private TextField tiroSaggezza;

    /**
     * fx:id del TextField per inserire il modificatore relativo alla saggezza
     * del personaggio
     */
    @FXML
    private TextField modSaggezza;

    /**
     * fx:id del TextField per inserire il lancio relativo all'intelligenza del
     * personaggio
     */
    @FXML
    private TextField tiroIntelligenza;

    /**
     * fx:id del TextField per inserire il modificatore del lancio relativo
     * all'intellingenza del personaggio
     */
    @FXML
    private TextField modIntelligenza;

    /**
     * fx:id del TextField per inserire il risultato del lancio relativo alla
     * Costituzione del personaggio
     */
    @FXML
    private TextField tiroCostituzione;

    /**
     * fx:id relativo al TextField relativo al modificatore della Costituzione
     * del personaggio
     */
    @FXML
    private TextField modCostituzione;

    /**
     * fx:id relativo al TextField relativo al tiro Destrezza del personaggio
     */
    @FXML
    private TextField tiroDestrezza;

    /**
     * fx:id relativo al TextField del modificatore della Destrezza del
     * personaggio
     */
    @FXML
    private TextField modDestrezza;

    /**
     * fx:id relativo al TextField del tiro Forza del personaggio
     */
    @FXML
    private TextField tiroForza;

    /**
     * fx:id relativo al TextField del modificatore Forza del personaggio
     */
    @FXML
    private TextField modForza;

    /**
     * fx:id relativo al RadioButton per il controllo del tiro salvezza relativo
     * alla Forza
     */
    @FXML
    private RadioButton checkForza;

    /**
     * fx:id relativo al RadioButton per il controllo del tiro salvezza relativo
     * alla Destrezza
     */
    @FXML
    private RadioButton checkDestrezza;

    /**
     * fx:id relatvo al RadioButton per il controllo del tiro salvezza relativo
     * all'Intelligenza
     */
    @FXML
    private RadioButton checkIntelligenza;

    /**
     * fx:id relativo al RadioButton per il controllo del tiro salvezza relativo
     * alla Costituzione
     */
    @FXML
    private RadioButton checkCostituzione;

    /**
     * fx:id relativo al RadioButton per il controllo del tiro salvezza relativo
     * all Saggezza
     */
    @FXML
    private RadioButton checkSaggezza;

    /**
     * fx:id relativo al RadioButton per il controllo del tiro salavezza
     * relativo al Carisma
     */
    @FXML
    private RadioButton checkCarisma;

    /**
     * fx:id relativo al TextField per il modificatore del tiro salvezza
     * relativo alla Destrezza
     */
    @FXML
    private TextField salvezzaDestrezza;

    /**
     * fx:id relativo al TextField per il modificatore del tiro salvezza
     * relativo alla Forza
     */
    @FXML
    private TextField salvezzaForza;

    /**
     * fx:id relativo al TextField corrispondente al tiro salvezza relativo al
     * Carisma
     */
    @FXML
    private TextField salvezzaCarisma;

    /**
     * fx:id relativo al TextField corrispondente al tiro salvezza relativo alla
     * Saggezza
     */
    @FXML
    private TextField salvezzaSaggezza;

    /**
     * fx:id relativo al TextField corrispondente al tiro salvezza relativo
     * all'Intelligenza
     */
    @FXML
    private TextField salvezzaIntelligenza;

    /**
     * fx:id relativo al TextField corrispondente al tiro salvezza relativo alla
     * costituzione
     */
    @FXML
    private TextField salvezzaCostituzione;

    /**
     * fx:id relativo al RadioButton corrispondente al check per l'acrobazia
     */
    @FXML
    private RadioButton checkAcrobazia;

    /**
     * fx:id relativo al TextField corrispondente al valore dell'abilità
     * Acrobazia
     */
    @FXML
    private TextField abilitaAcrobazia;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nell'Adestrare
     */
    @FXML
    private RadioButton checkAddestrare;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nell'Arcano
     */
    @FXML
    private RadioButton checkArcano;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nell'Atletica
     */
    @FXML
    private RadioButton checkAtletica;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Furtività
     */
    @FXML
    private RadioButton checkFurtivita;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nell'Indagare
     */
    @FXML
    private RadioButton checkIndagare;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nell'Inganno
     */
    @FXML
    private RadioButton checkInganno;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nell'intimidire
     */
    @FXML
    private RadioButton checkIntimidire;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nell'Intrattenere
     */
    @FXML
    private RadioButton checkIntrattenere;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Medicina
     */
    @FXML
    private RadioButton checkMedicina;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Natura
     */
    @FXML
    private RadioButton checkNatura;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Percezione
     */
    @FXML
    private RadioButton checkPercezione;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Persuasione
     */
    @FXML
    private RadioButton checkPersuasione;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Rapidità di mano
     */
    @FXML
    private RadioButton checkRapidita;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Religione
     */
    @FXML
    private RadioButton checkReligione;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Sopravvivenza
     */
    @FXML
    private RadioButton checkSopravvivenza;

    /**
     * fx:id relativo al RadioButton corrispondente al check dell'abilità del
     * personaggio nella Storia
     */
    @FXML
    private RadioButton checkStoria;

    /**
     * fx:id relativo al TextField corrispondente all'abilità del personaggio
     * nell'addestrare animali
     */
    @FXML
    private TextField abilitaAddetrare;

    /**
     * fx:id relativo al TextField corrispondente all'abilità del personaggio
     * nella conoscenza dell'arcano
     */
    @FXML
    private TextField abilitaArcano;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nell'Atletica del
     * personaggio
     */
    @FXML
    private TextField abilitaAtletica;

    /**
     * fx:id relativo al TextField corrispondente all'abilità di furtività del
     * personaggio
     */
    @FXML
    private TextField abilitaFurtivita;

    /**
     * fx:id relativo al TextField corrispondente all'abilità di Indagare del
     * personaggio
     */
    @FXML
    private TextField abilitaIndagare;

    /**
     * fx:id relativo al TextField corrispondente all'abilità di Inganno del
     * personaggio
     */
    @FXML
    private TextField abilitaInganno;

    /**
     * fx:id corrispondente al TextField corrispondente all'abilità di
     * Intimidire del personaggio
     */
    @FXML
    private TextField abilitaIntimidire;

    /**
     * fx:id relativo al TextField corrispondente all'abilità di intrattenere
     * del personaggio
     */
    @FXML
    private TextField abilitaIntrattenere;

    /**
     * fx:id relativo al RadioButton per il check dell'abilità di Intuizione del
     * personaggio
     */
    @FXML
    private RadioButton checkIntuizione;

    /**
     * fx:id relativo al TextFiel corrispondente all'abilità nell'Intuizione del
     * personaggio
     */
    @FXML
    private TextField abilitaIntuizione;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nella Medicina del
     * personggio
     */
    @FXML
    private TextField abilitaMedicina;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nella Natura del
     * personaggio
     */
    @FXML
    private TextField abilitaNatura;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nella percezione
     * del personaggio
     */
    @FXML
    private TextField abilitaPercezione;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nella persuasione
     * del personaggio
     */
    @FXML
    private TextField abilitaPersuasione;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nella Rapidità di
     * mano del personaggio
     */
    @FXML
    private TextField abilitaRapidita;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nella religione
     * del personaggio
     */
    @FXML
    private TextField abilitaReligione;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nella
     * sopravvivenza del personaggio
     */
    @FXML
    private TextField abilitaSopravvivenza;

    /**
     * fx:id relativo al TextField corrispondente all'abilità nella storia del
     * personaggio
     */
    @FXML
    private TextField abilitaStoria;

    /**
     * fx:id relativo al TextField corrispondente all'ispirazione del
     * personaggio
     */
    @FXML
    private TextField ispirazione;

    /**
     * fx:id relativo al TextField corrispondente alla competenza del
     * personaggio
     */
    @FXML
    private TextField Competenza;

    /**
     * fx:id relativo al TextField corrispondente alla saggezza passiva del
     * personaggio
     */
    @FXML
    private TextField saggezzaPasiva;

    /**
     * fx:id relativo al TextField corrispondente alla classe armatura del
     * personaggio
     */
    @FXML
    private TextField classeArmatura;

    /**
     * fx:id relativo al TextField corrispondente alla velocità del personaggio
     */
    @FXML
    private TextField velocita;

    /**
     * fx:id relativo al TextField corrispondente all'iniziativa del personaggio
     */
    @FXML
    private TextField iniziativa;

    /**
     * fx:id relativo al TextField corrispondente ai punti ferita del
     * personaggio
     */
    @FXML
    private TextField puntiFerita;

    /**
     * fx:id relativo al TextField corrispondente ai punti ferita temporanei del
     * personaggio
     */
    @FXML
    private TextField puntiFeritaTemp;

    /**
     * fx:id relativo al TextField corrispondente ai dadi vita del personaggio
     */
    @FXML
    private TextField dadiVita;

    /**
     * fx:id appresntante il RadioButton relativo al primo tiro per il successo
     * contro la morte
     */
    @FXML
    private RadioButton successoMorte1;

    /**
     * fx:id rappresentante il ToggleGroup relativo al tiro per il successo
     * contro la morte
     */
    @FXML
    private ToggleGroup successoMorte;

    /**
     * fx:id rappresentante il RadioButton relativo al terzo check del tiro per
     * il fallimento contro la morte
     */
    @FXML
    private RadioButton fallimentoMorte3;

    /**
     * fx:id rappresentante il RadioButton relativo al terzo check del tiro per
     * il successo contro la morte
     */
    @FXML
    private RadioButton successoMorte3;

    /**
     * fx:id rappresentante il RadioButton relativo al secondo check del tiro
     * per il successo contro la morte
     */
    @FXML
    private RadioButton successoMorte2;

    /**
     * fx:id rappresentante il RadioButton relativo al secondo check del tiro
     * per il fallimento contro la morte
     */
    @FXML
    private RadioButton fallimentoMorte2;

    /**
     * fx:id rappresentante il ToogleGroup relativo ai tiri per il fallimento
     * contro la morte
     */
    @FXML
    private ToggleGroup fallimentoMorte;

    /**
     * fx:id rappresentante il RadioButton relativo al primo check del tiro per
     * il fallimento contro la morte
     */
    @FXML
    private RadioButton fallimentoMorte1;

    /**
     * fx:id relativo alla ListView rappresentate l'elenco delle armi
     */
    @FXML
    private ListView listaArmi;

    /**
     * fx:id relativo alla ListView rappresentante l'elenco degli incantesimi
     */
    @FXML
    private ListView listaIncantesimi;

    /**
     * fx:id relativo alla ListView rappresentante l'elenco dell'equipaggiamento
     */
    @FXML
    private ListView listaEquipaggiamento;

    /**
     * fx:id rappresentante il Button per aggiungere un equipaggiamento
     */
    @FXML
    private Button aggiungiEquipaggiamento;

    /**
     * fx:id rappresentante il Button relativo alla funzione per aggiungere un
     * incantesimo
     */
    @FXML
    private Button aggiungiIncantesimo;

    /**
     * fx:id rappresentante il Button relativo alla funzione per aggiungere
     * un'arma alla lista delle armi
     */
    @FXML
    private Button aggiungiArma;

    /**
     * fx:id rappresentante il Button relativo alla funzione per esportare la
     * scheda in formato PDF
     */
    @FXML
    private Button esportaScheda;

    /**
     * fx:id relativo al TextField rappresentante il numero di monete di rame
     */
    @FXML
    private TextField moneteRame;

    /**
     * fx:i relativo al TextField rappresentante il numero di monete di bronzo
     */
    @FXML
    private TextField moneteBronzo;

    /**
     * fx:id relativo al TextField rappresentante il numero di monete d'argento
     */
    @FXML
    private TextField moneteArgento;

    /**
     * fx:id relativo al TextField rappresentante il numerio di monete d'oro
     */
    @FXML
    private TextField moneteOro;

    /**
     * fx:id relativo al TextField rappresentante il numero di monete di platino
     */
    @FXML
    private TextField monetePlatino;

    /**
     * fx:id relativo al Button per eliminare un'arma dalla lista delle armi
     */
    @FXML
    private Button eliminaArma;

    /**
     * fx:id relativo al Button per eliminare un incantesimo dalla lista degli
     * incantesimi
     */
    @FXML
    private Button eliminaIncantesimo;

    /**
     * fx:id relativo al Button per eliminare un oggetto dall'equipaggiamento
     */
    @FXML
    private Button eliminaEquipggiamento;

    /**
     * Funzione per esportare la scheda del pg/mostro/png in formato XML, per
     * poi recuperarla in futuro
     */
    public void salvaSchedaXML() {
        try {
            SchedaPG schedaPG = new SchedaPG();
            String nomeScheda = "./" + this.nomePersonaggio.getText() + ".txt";
            try ( BufferedWriter writer = new BufferedWriter(new FileWriter(nomeScheda))) {

                //Creazione oggetto da serializzare
                schedaPG.setNomePersonaggio(this.nomePersonaggio.getText());
                schedaPG.setClassePersonaggio(this.classePersonaggio.getText());
                schedaPG.setSpecializzazionePersonaggio(this.specializzazionePersonaggio.getText());
                schedaPG.setRazzaPersonaggio(this.razzaPersonaggio.getText());
                schedaPG.setLivelloPersonaggio(Integer.parseInt(this.livelloPersonaggio.getText()));
                schedaPG.setPuntiEsperienza(Integer.parseInt(this.puntiEsperienza.getText()));
                schedaPG.setAllineamentoPersonaggio(this.allineamentoPErsonaggio.getText());

                writer.write("Nome Personaggio: " + this.nomePersonaggio + "\n");
                writer.write("Classe Personaggio: " + this.classePersonaggio + "\n");
                writer.write("Specializzazione Personaggio: " + this.specializzazionePersonaggio + "\n");
                writer.write("Razza Personaggio: " + this.razzaPersonaggio + "\n");
                writer.write("Livello Personaggio: " + this.livelloPersonaggio + "\n");
                writer.write("Punti Esperienza Personaggio: " + this.puntiEsperienza + "\n");
                writer.write("Allineamento Personaggio: " + this.allineamentoPErsonaggio + "\n");

                //tiri salvezza
                writer.write("Tiri Salvezza \n\n");
                HashMap<String, CheckMod> tiriSalvezza = new HashMap<>();
                CheckMod tiroSalvezza = new CheckMod(checkForza.isSelected(), Integer.parseInt(salvezzaForza.getText()));
                tiriSalvezza.put("Forza", tiroSalvezza);
                writer.write("Forza: " + tiroSalvezza.isCheck() + " " + tiroSalvezza.getValore() + "\n");

                tiroSalvezza = new CheckMod(checkDestrezza.isSelected(), Integer.parseInt(salvezzaDestrezza.getText()));
                tiriSalvezza.put("Destrezza", tiroSalvezza);
                writer.write("Destrezza: " + tiroSalvezza.isCheck() + " " + tiroSalvezza.getValore() + "\n");

                tiroSalvezza = new CheckMod(checkCostituzione.isSelected(), Integer.parseInt(salvezzaCostituzione.getText()));
                tiriSalvezza.put("Costituzione", tiroSalvezza);
                writer.write("Costituzione: " + tiroSalvezza.isCheck() + " " + tiroSalvezza.getValore() + "\n");

                tiroSalvezza = new CheckMod(checkIntelligenza.isSelected(), Integer.parseInt(salvezzaIntelligenza.getText()));
                tiriSalvezza.put("Intelligenza", tiroSalvezza);
                writer.write("Intelligenza: " + tiroSalvezza.isCheck() + " " + tiroSalvezza.getValore() + "\n");

                tiroSalvezza = new CheckMod(checkSaggezza.isSelected(), Integer.parseInt(salvezzaSaggezza.getText()));
                tiriSalvezza.put("Saggezza", tiroSalvezza);
                writer.write("Saggezza: " + tiroSalvezza.isCheck() + " " + tiroSalvezza.getValore() + "\n");

                tiroSalvezza = new CheckMod(checkCarisma.isSelected(), Integer.parseInt(salvezzaCarisma.getText()));
                tiriSalvezza.put("Carisma", tiroSalvezza);
                writer.write("Carisma: " + tiroSalvezza.isCheck() + " " + tiroSalvezza.getValore() + "\n");

                schedaPG.setTiriSalvezza(tiriSalvezza);

                //Tiri e modificatori
                writer.write("Tiri e Modificatori \n\n");
                HashMap<String, TiroMod> tiriModificatori = new HashMap<>();
                TiroMod tiroModificatore = new TiroMod(Integer.parseInt(tiroForza.getText()), Integer.parseInt(modForza.getText()));
                tiriModificatori.put("Forza", tiroModificatore);
                writer.write("Forza: " + tiroModificatore.getTiro() + " " + tiroModificatore.getMod() + "\n");

                tiroModificatore = new TiroMod(Integer.parseInt(tiroCostituzione.getText()), Integer.parseInt(modCostituzione.getText()));
                tiriModificatori.put("Costituzione", tiroModificatore);
                writer.write("Costituzione: " + tiroModificatore.getTiro() + " " + tiroModificatore.getMod() + "\n");

                tiroModificatore = new TiroMod(Integer.parseInt(tiroDestrezza.getText()), Integer.parseInt(modDestrezza.getText()));
                tiriModificatori.put("Destrezza", tiroModificatore);
                writer.write("Destrezza: " + tiroModificatore.getTiro() + " " + tiroModificatore.getMod() + "\n");

                tiroModificatore = new TiroMod(Integer.parseInt(tiroSaggezza.getText()), Integer.parseInt(modSaggezza.getText()));
                tiriModificatori.put("Saggezza", tiroModificatore);
                writer.write("Saggezza: " + tiroModificatore.getTiro() + " " + tiroModificatore.getMod() + "\n");

                tiroModificatore = new TiroMod(Integer.parseInt(tiroIntelligenza.getText()), Integer.parseInt(modIntelligenza.getText()));
                tiriModificatori.put("Intelligenza", tiroModificatore);
                writer.write("Intelligenza: " + tiroModificatore.getTiro() + " " + tiroModificatore.getMod() + "\n");

                tiroModificatore = new TiroMod(Integer.parseInt(tiroCarisma.getText()), Integer.parseInt(modCarisma.getText()));
                tiriModificatori.put("Carisma", tiroModificatore);
                writer.write("Carisma: " + tiroModificatore.getTiro() + " " + tiroModificatore.getMod() + "\n");
                schedaPG.setTiroMod(tiriModificatori);

                //abilità
                writer.write("Abilità \n\n");
                HashMap<String, CheckMod> listaAbilita = new HashMap<>();
                CheckMod abilita = new CheckMod(checkAcrobazia.isSelected(), Integer.parseInt(abilitaAcrobazia.getText()));
                listaAbilita.put("Acrobazia", abilita);
                writer.write("Acrobazia: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkAddestrare.isSelected(), Integer.parseInt(abilitaAddetrare.getText()));
                listaAbilita.put("Addestrare animali", abilita);
                writer.write("Addestrare animali: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkArcano.isSelected(), Integer.parseInt(abilitaArcano.getText()));
                listaAbilita.put("Arcano", abilita);
                writer.write("Arcano: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkAtletica.isSelected(), Integer.parseInt(abilitaAtletica.getText()));
                listaAbilita.put("Atletica", abilita);
                writer.write("Atletica: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkFurtivita.isSelected(), Integer.parseInt(abilitaFurtivita.getText()));
                listaAbilita.put("Furtività", abilita);
                writer.write("Furtività: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkIndagare.isSelected(), Integer.parseInt(abilitaIndagare.getText()));
                listaAbilita.put("Indagare", abilita);
                writer.write("Indagare: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkInganno.isSelected(), Integer.parseInt(abilitaInganno.getText()));
                listaAbilita.put("Inganno", abilita);
                writer.write("Inganno: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkIntimidire.isSelected(), Integer.parseInt(abilitaIntimidire.getText()));
                listaAbilita.put("Intimidire", abilita);
                writer.write("Intimidire: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkIntrattenere.isSelected(), Integer.parseInt(abilitaIntrattenere.getText()));
                listaAbilita.put("Intrattenere", abilita);
                writer.write("Intrattenere: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkIntuizione.isSelected(), Integer.parseInt(abilitaIntuizione.getText()));
                listaAbilita.put("Intuizione", abilita);
                writer.write("Intuizione: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkMedicina.isSelected(), Integer.parseInt(abilitaMedicina.getText()));
                listaAbilita.put("Medicina", abilita);
                writer.write("Medicina: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkNatura.isSelected(), Integer.parseInt(abilitaNatura.getText()));
                listaAbilita.put("Natura", abilita);
                writer.write("Natura: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkPercezione.isSelected(), Integer.parseInt(abilitaPercezione.getText()));
                listaAbilita.put("Percezione", abilita);
                writer.write("Percezione: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkPersuasione.isSelected(), Integer.parseInt(abilitaPersuasione.getText()));
                listaAbilita.put("Persuasione", abilita);
                writer.write("Persuasione: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkRapidita.isSelected(), Integer.parseInt(abilitaRapidita.getText()));
                listaAbilita.put("Rapidità di mano", abilita);
                writer.write("Rapidità di mano: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkReligione.isSelected(), Integer.parseInt(abilitaReligione.getText()));
                listaAbilita.put("Religione", abilita);
                writer.write("Religione: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkSopravvivenza.isSelected(), Integer.parseInt(abilitaSopravvivenza.getText()));
                listaAbilita.put("Sopravvivenza", abilita);
                writer.write("Sopravvivenza: " + abilita.isCheck() + " " + abilita.getValore() + "\n");

                abilita = new CheckMod(checkStoria.isSelected(), Integer.parseInt(abilitaStoria.getText()));
                listaAbilita.put("Storia", abilita);
                writer.write("Storia: " + abilita.isCheck() + " " + abilita.getValore() + "\n");
                schedaPG.setAbilita(listaAbilita);

                int tiriSuccMorte = 0, tiriFallMorte = 0;
                if (successoMorte1.isSelected()) {
                    tiriSuccMorte = 1;
                }
                if (successoMorte2.isSelected()) {
                    tiriSuccMorte = 2;
                }
                if (successoMorte3.isSelected()) {
                    tiriSuccMorte = 3;
                }
                if (fallimentoMorte1.isSelected()) {
                    tiriFallMorte = 1;
                }
                if (fallimentoMorte2.isSelected()) {
                    tiriFallMorte = 2;
                }
                if (fallimentoMorte3.isSelected()) {
                    tiriFallMorte = 3;
                }
                writer.write("Tiri Salvezza Morte\n\n");
                HashMap<String, Integer> tiriMorte = new HashMap<>();
                tiriMorte.put("Successi", tiriSuccMorte);
                tiriMorte.put("Fallimenti", tiriFallMorte);
                schedaPG.setTsMorte(tiriMorte);
                writer.write("Successi: " + tiriMorte.get("Successi") + "\n");
                writer.write("Fallimenti: " + tiriMorte.get("Fallimenti") + "\n");

                //armi
                writer.write("Armi\n\n");
                LinkedList<String> armi = new LinkedList<>();
                for (int i = 0; i < listaArmi.getItems().size(); i++) {
                    armi.add(listaArmi.getItems().get(i).toString());
                    writer.write(listaArmi.getItems().get(i).toString() + "\n");
                }
                schedaPG.setArmi(armi);
                //incantesimi
                writer.write("Incantesimi\n\n");
                LinkedList<String> incantesimi = new LinkedList<>();
                for (int i = 0; i < listaIncantesimi.getItems().size(); i++) {
                    incantesimi.add(listaIncantesimi.getItems().get(i).toString());
                    writer.write(listaIncantesimi.getItems().get(i).toString() + "\n");
                }
                schedaPG.setIncantesimi(incantesimi);
                //equipaggiamento
                writer.write("Equipaggiamento\n\n");
                LinkedList<String> equipaggiamento = new LinkedList<>();
                for (int i = 0; i < listaEquipaggiamento.getItems().size(); i++) {
                    equipaggiamento.add(listaEquipaggiamento.getItems().get(i).toString());
                    writer.write(listaEquipaggiamento.getItems().get(i).toString() + "\n");
                }
                schedaPG.setEquipaggiamento(equipaggiamento);

                //caratteristiche rimanenti
                writer.write("Altre caratteristica\n\n");
                schedaPG.setIspirazione(Integer.parseInt(ispirazione.getText()));
                writer.write("Ispirazione: " + ispirazione.getText() + "\n");

                schedaPG.setBonusCompetenza(Integer.parseInt(Competenza.getText()));
                writer.write("Competenza: " + Competenza.getText() + "\n");

                schedaPG.setSaggezzaPassiva(Integer.parseInt(saggezzaPasiva.getText()));
                writer.write("Saggezza passiva: " + saggezzaPasiva.getText() + "\n");

                schedaPG.setClasseArmatura(Integer.parseInt(classeArmatura.getText()));
                writer.write("Classe Armatura: " + classeArmatura.getText() + "\n");

                schedaPG.setIniziativa(Integer.parseInt(iniziativa.getText()));
                writer.write("Iniziativa: " + iniziativa.getText() + "\n");

                schedaPG.setVelocita(Integer.parseInt(velocita.getText()));
                writer.write("Iniziativa: " + iniziativa.getText() + "\n");

                schedaPG.setPuntiFerita(Integer.parseInt(puntiFerita.getText()));
                writer.write("Punti ferita: " + puntiFerita.getText() + "\n");

                schedaPG.setDadiVita(Integer.parseInt(dadiVita.getText()));
                writer.write("Dadi vita: " + dadiVita.getText() + "\n");

                schedaPG.setPuntiFeritaTemp(Integer.parseInt(puntiFeritaTemp.getText()));
                writer.write("Punti ferita temporanei: " + puntiFeritaTemp.getText() + "\n");

                schedaPG.setMa(Integer.parseInt(moneteArgento.getText()));
                writer.write("Monete d'argento: " + moneteArgento.getText() + "\n");

                schedaPG.setMr(Integer.parseInt(moneteRame.getText()));
                writer.write("Monete d'rame: " + moneteRame.getText() + "\n");

                schedaPG.setMb(Integer.parseInt((moneteBronzo.getText())));
                writer.write("Monete d'bronzo: " + moneteBronzo.getText() + "\n");

                schedaPG.setMo(Integer.parseInt(moneteOro.getText()));
                writer.write("Monete d'oro: " + moneteOro.getText() + "\n");

                schedaPG.setMp(Integer.parseInt(monetePlatino.getText()));
                writer.write("Monete di platino: " + monetePlatino.getText() + "\n");
            }
            /*
            //Serializzo l'oggetto
            FileOutputStream fileOutputStream= new FileOutputStream(nomeScheda);
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(schedaPG);
            objectOutputStream.flush();
            objectOutputStream.close();*/
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Scheda salvata con successo in formato txt");
            a.setResizable(false);
            a.show();

        } catch (Exception e) {
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.ERROR);
            a.setTitle("Errore");
            a.setResizable(false);
            a.setContentText("Compilare tutti i campi e controllare che i campi siano stati compilati correttamente.");
            a.show();
        }

        /*
        //Deserializzazione oggetto
        FileInputStream fileInputStream=new FileInputStream(nomeScheda);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        SchedaPG schedatemp=(SchedaPG) objectInputStream.readObject();
        objectInputStream.close();*/
    }

    /**
     * Funzione per esportare la scheda del pg/mostro/png in formato PDF.
     */
    public void esportaSchedaPDF() {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText("Funzione non ancora implementata. Impossibile esportare la scheda in PDF, prova a salvarla in formato txt");
        a.show();
    }

    /**
     * Funzione per aggiungere un'arma al pg/mostro/png.
     */
    public void aggiungiArm() {
        String nome = nomeArma.getText();
        listaArmi.getItems().add(nome);
    }

    /**
     * Funzione per aggiungere un incantesimo al pg/mostro/png.
     */
    public void aggiungiInc() {
        listaIncantesimi.getItems().add(nomeIncantesimo.getText());
    }

    /**
     * Funzione per aggiungere un oggetto all'equipaggiamento del pg/mostro/png.
     */
    public void aggiungiEquip() {
        listaEquipaggiamento.getItems().add(nomeEquipaggiamento.getText());
    }

    /**
     * Funzione per eliminare un'arma dall'equipaggiamento del pg/mostro/png.
     */
    public void eliminaArm() {
        try {
            listaArmi.getItems().remove(nomeArma.getText());
        } catch (Error e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Impossibile eliminare equipaggiamento. Ricontrolla il nome e riprova.");
            a.show();
        }
    }

    /**
     * Funzione per eliminare un incantesimo del pg/mostro/png.
     */
    public void eliminaInc() {
        try {
            listaIncantesimi.getItems().remove(nomeIncantesimo.getText());
        } catch (Error e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Impossibile eliminare equipaggiamento. Ricontrolla il nome e riprova.");
            a.show();
        }
    }

    /**
     * Funzione per eliminare un oggetto dall'equipaggiamento del pg/mostro/png.
     */
    public void eliminaEquip() {
        try {
            listaEquipaggiamento.getItems().remove(nomeEquipaggiamento.getText());
        } catch (Error e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Impossibile eliminare equipaggiamento. Ricontrolla il nome e riprova.");
            a.show();
        }
    }
}
