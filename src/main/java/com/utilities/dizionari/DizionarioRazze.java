package com.utilities.dizionari;

import java.util.TreeSet;

/**
 * Classe dizionario per le razze
 */
public class DizionarioRazze {
    /**
     * TreeSet di oggetti di tipo Razza per la rappresentazione del dizionario
     */
    TreeSet<Razza> dizionarioRazze=new TreeSet<>();

    /**
     * Costruttore di classe per il popolamento del dizionario
     */
    public DizionarioRazze(){
        this.dizionarioRazze.add(new Razza("Elfo","Destrezza +2", "Vivono fino ai 750 anni e ricevono il loro nome da adulto a 100 anni","Gli elfi amano la libertà, la varietà e l'espressione individuale, cosa che li avvicina agli aspetti più positivi del caos. Apprezzano e proteggono la libertà degli altri quanto la propria, e per buona parte tendono al bene piuttosto che al male. I drow costituiscono un'eccezione: il loro esilio nell'Underdark li ha resi malevoli e pericolosi. I drow tendono per la maggior parte al male piuttosto che al bene.","Un elfo ha un'altezza che va da poco meno di 1,5 a poco più 1,8 metri e una struttura snella. È una creatura di taglia Media.",9F,"Gli elfi sanno parlare, leggere e scrivere in Comune e in Elfico. L'Elfico è una lingua fluida, dalle tonalità sottili e dalla grammatica complessa. La letteratura elfica è ricca e variegata: i loro canti e i loro poemi sono celebri anche presso le altre razze. Molti bardi imparano la lingua degli elfi per poter aggiungere le ballate elfiche al proprio repertorio.","Manuale del giocatore","Scurovlsione. Un elfo, abituato a muoversi nella penombra del sottobosco e alla luce della luna, beneficia di una vista superiore nell'oscurità e nelle condizioni di luce fioca. Un elfo in condizioni di luce fioca può vedere fino a 18 metri come se si trovasse in condizioni di luce intensa e nell'oscurità come se si trovasse in luce fioca. Nell'oscurità non è in grado di discernere i colori, ma solo le tonalità di grigio. Sensi Acuti. Un elfo ha competenza nell'abilità Percezione. RetaAAlo Fatato. Un elfo dispone di vantaggio ai tiri salvezza per non essere affascinato e non può essere addormentato tramite la magia. Trance. Gli elfi non hanno bisogno di dormire. Anziché dormire entrano per 4 ore al giorno in una profonda meditazione e in uno stato semicosciente. (Il termine in Comune per tale meditazione è \"trance\".) Durante questa meditazione, l'elfo entra in una sorta di stato sognante, che in realtà non è altro che una serie di esercizi mentali che anni di pratica hanno reso automatici. Dopo tale periodo, l'elfo ottiene gli stessi benefici di 8 ore di sonno per un umano."," Antiche divisioni in seno al popolo elfico hanno prodotto tre grandi sottorazze: gli elfi alti, gli elfi dei boschi e gli elfi oscuri, comunemente chiamati drow. Il giocatore deve scegliere una di queste sottorazze per il proprio personaggio. In alcuni mondi, questi gruppi sono ulteriormente suddivisi (come gli elfi del sole e gli elfi della luna in Forgotten Realms), quindi, se il giocatore desidera, pub scegliere uno di quei gruppi più ristretti. "));
        this.dizionarioRazze.add(new Razza("Halfling","Destrezza +2"," Un halfling raggiunge la maturità a 20 anni e normalmente vive circa fino alla metà del suo secondo secolo","Quasi tutti gli halfling sono legali buoni. Di norma sono creature gentili e di buon cuore, detestano vedere soffrire le altre creature e non sopportano la prepotenza. Sono anche molto ordinati e tradizionalisti e si affidano per ogni necessità alla loro comunità di appartenenza e alle certezze delle antiche tradizioni","Un halfting è alto circa 90 cm e pesa circa 20 kg. È una creatura di taglia Piccola.",7.5F,"Un halfting sa parlare, leggere e scrivere in Comune e in Halfting. La lingua Halfling non è segreta, ma gli hatfting non la condividono volentieri con i membri delle altre razze. Scrivono poco, quindi la letteratura halHing non è molto ricca. Le loro tradizioni orali, invece, sono molto ricche e diffuse. Quasi tutti gli halfling usano il Comune per comunicare con gli abitanti delle regioni in cui vivono o che attraversano nei loro viaggi. ","Manuale del giocatore","Fortunato. Quando ottiene 1 a un tiro per colpire, a una prova di caratteristica o a un tiro salvezza, un halfling può ripetere il tiro del dado e deve usare ti nuovo risultato. Corggioso. Un halfling dispone di vantaggio ai tiri salvezza per non essere spaventato. Agilità Halfling. Un halfling può muoversi attraverso gli spazi di qualsiasi creatura più grande","I due principali tipi di halfting, piedelesto e tozzo, sono più simili a due famiglie strettamente imparentate che a delle sottorazze vere e proprie. Il giocatore dovrà scegliere tra una di queste due sottorazte. "));
        this.dizionarioRazze.add(new Razza("Nano","Costituzione +2",". I nani maturano alJo stesso ritmo degli umani, ma sono considerati giovani fino al raggiungimento dei 50 anni. Vivono in media 350 anni","La maggior parte dei nani è legale e crede fermamente nei benefici di una società ben ordinata. Molti nani tendono anche al bene, danno grande valore alla correttezza e credono che tutti debbano condividere i benefici concessi da un ordine equo","Un nano è alto dagli 1,2 agli 1,5 metri, pesa circa 75 kg ed è una creatura di taglia Media", 7.5F,"Un nano è in grado di parlare, leggere e scrivere in Comune e in Nanico. Il Nanico è una lingua ricca di aspre consonanti e di suoni gutturali, inflessioni che traspatono anche nelle altre lingue che il nano potrebbe parlare","Manuale del giocatore","Scurovlslone. Un nano è abituato a vivere sottoterra e beneficia di una vista superiore nell'oscurità e nelle condizioni di luce fioca. Un nano in condizioni di luce fioca pub vedere fino a 18 metri come se si trovasse in condizioni di luce intensa e nell'oscurità come se si trovasse in luce fioca. Nell'oscurità non è in grado di discernere i colori, ma solo le tonalità di grigio. Resilienza Nanica. Un nano dispone di vantaggio ai tiri salvezza contro il veleno e di resistenza ai danni da veleno (spiegati nel capitolo 9, \"Combattimento\"). Addestramento da Combattimento NanJco. Un nano ha competenza nelle asce, nelle asce da battaglia, nei martelli da guerra e nei martelli leggeri. Competenza negli Strumenti. Un nano ha competenza in un gruppo di strumenti da artigiano a sua scelta: strumenti da fabbro, scorte da mescitore o strumenti da costruttore. Esperto minatore. Ogni volta che un nano effettua una prova dt Intelligenza (Storia) relativa all'origine di una struttura in pietra, è considerato avere competenza nell'abilità Storia e aggiunge il doppio del suo bonus di competenza alla prova anziché Il suo normale bonus di competenza.",". I mondi di D&D sono popolati da due sottorazze principali di nani: i nani delle colline e i nani delle montagne. Il giocatore dovrà scegliere tra una di queste sottorazze"));
        this.dizionarioRazze.add(new Razza("Umano","Ogni punteggio di caratteristica aumenta di 1"," Un umano raggiunge la maturità tra i 18 e i 20 anni e vive meno cU un secolo","Gli umani non tendono ad alcun allineamento in particolare. Presso di loro è possibile trovare il meglio e il peggio che gli esseri viventi hanno da offrire","L'altezza e la corporatura possono variare drasticamente da un umano all'altro, oscillando tra gli 1,5 e gli 1,8 metri o più. A prescindere dalla sua effettiva altezza, un umano è una creatura di taglia Media", 9F,"Gli umani parlano, leggono e scrivono in Comune e in un linguaggio extra a scelta. In genere gli umani imparano il linguaggio del popolo con cui hanno più contatti, anche quando si tratta di dialetti sconosciuti ai più. Amano molto impreziosire la loro parlata con parole prese da altre lingue: imprecazioni in Orchesco, espressioni Elfiche dal suono melodioso, termini militari Nanici e cosl via.","Manuale base","Se la campagna usa la regola facoltativa del talenti descritta nel capitolo 6, il Oungeon Master può autorizzare l'utilizzo di questi tratti •llternativi. Quanto presentato di seguito si sostituisce al tratto di Incremento dei Pi.mteggi di Caratteristica. Incrementa dcl Punteggi di Caratteristica. Due punteggi di caratteristica diversi a scelta aumentano di 1 ciascuno. Abilitò. Un umano ha competenza in un'abilità a scelta. Talento. Un umano ottiene un talento a scelta. ","Nessuna"));
        this.dizionarioRazze.add(new Razza("Dragonie","Forza +2, Carisma +1","I giovani dragonidi crescono velocemente. Camminano già poche ore dopo la schiusa dell'uovo, a 3 anni raggiungono le dimensioni e lo sviluppo di un bambino umano di 10 anni e a 15 anni raggiungono la maturità. Vivono all'incirca fino a 80 anni.","I dragonidi tendono agli estremi e scelgono coscientemente da che parte stare nella guerra cosmica tra il bene e il male (rappresentati rispettivamente da Bahamut e Tiamat). La maggior parte dei dragonidi è buona, ma quelli che si schierano dalla parte di Tiamat possono rivelarsi tremendamente malvagi.",". I dragonidi sono più alti e pesanti degli umani: hanno un'altezza superiore agli 1,8 metri e un peso medio di 125 kg. Un dragonide è una creatura di taglia Media",9F,"Un dragonide sa parlare, leggere e scrivere in Comune e in Draconico. Si ritiene che il Draconico sia uno dei linguaggi più antichi e viene spesso usato nello studio della magia. li linguaggio ha un suono aspro per la maggior parte delle creature e include numerose consonanti dure e sibilanti. ","Manuale Base","Discendenza Draconka. Un dragonide vanta una discendenza da un drago. Il giocatore sceglie un tipo di drago dalla tabella \"Discendenza Draconica\". L'arma a soffio del personaggio e la sua resistenza ai danni saranno determinate dalla tipologia di drago, come indicato dalla tabella. Arma a SoRio. Un dragonide può usare la sua azione per esalare un soffio di energia distruttiva. La discendenza draconica determina la dimensione, la forma e il tipo di danno dell'esalazione. Quando il dragonide utilizza la sua arma a soffio, ogni creatura entro l'area dell'esalazione deve effettuare un tiro salvezza determinato in base alla discendenza draconica. La CD di questo tiro salvezza è pari a 8 + il modificatore di Costituzione del dragonide +il bonus di competenza del dragonide. Una creatura subisce 2d6 danni se il tiro salvezza fallisce. Se invece ha successo, i danni sono dimezzati. I danni aumentano a 3d6 al 6• livello, 4d6 all'll• livello e 5d6 al 16. livello. Una volta che il dragonide ha utilizzato la sua arma a soffio, non può più utilizzarla finché non completa un riposo breve Resistenza o lungo. al Danni. Un dragonide dispone di resistenza ai danni del tipo assodato alla sua discendenza draconica","Nessuna"));
        this.dizionarioRazze.add(new Razza("Gnomo","Intelligenza +2","Gli gnomi maturano alla stessa velocità degli umani e la maggior parte solitamente adotta la stabilità di una vita adulta attorno ai 40 anni. Uno gnomo può vivere dai 350 ai 500 anni circa."," Gli gnomi sono spesso buoni. Quelli che tendono alla legalità sono sapienti, ingegneri, ricercatori, studiosi, investigatori o inventori. Quelli che tendono al caos sono menestrelli, imbroglioni, viandanti o eccentrici gioiellieri. Gli gnomi sono creature di buon cuore e anche quelli di indole più ingannevole sono generalmente più burloni che malvagi.","Uno gnomo può essere alto dai 90 ai 120 cm e pesare in media 20 kg. Uno gnomo è una creatura di taglia Piccola",7.5F,"Uno gnomo può parlare, leggere e scrivere in Comune e in Gnomesco. Il linguaggio Gnomesco. che usa l'alfabeto Nanico, è rinomato per i suoi trattati tecnici e le sue enciclopedie sul mondo naturale","Manuale del giocatore","Scurovisione. Essendo abituato a vivere sottoterra. uno gnomo beneficia di una vista superiore nell'oscurità e nelle condizioni di luce fioca. Uno gnomo in condizioni di luce fioca pub vedere fino a 18 metri come se si trovasse in condizioni di luce intensa e nell'oscurità come se si trovasse in luce fioca. Nell'oscurità non è in grado di discernere i colori, ma solo le tonalità di grigio. Astuzia Gnome.sca. Uno gnomo dispone di vantaggio a tutti i tiri salvezza su Intelligenza, Saggezza e Carisma contro la magia.","e. Esistono due sottorazze di gnomi nei mondi di D&D: gli gnomi delle foreste e gli gnomi delle rocce. Il giocatore deve scegliere una di queste sottorazze"));
        this.dizionarioRazze.add(new Razza("Mezzelfo","Carisma +2 e altri due punteggi di caratteristica a scelta aumentano di 1","I mezzelfi crescono agli stessi ritmi degli umani e raggiungono l'età adulta attorno ai 20 anni. Vivono comunque molto più a lungo degli umani e spesso superano i 180 anni","I mezzelfi condividono la propensione al caos ms1ta nel loro retaggio elfico. Rispettano sia la libertà personale che l'espressione creativa, non amano troppo le figure autoritarie e non desiderano avere seguaci. Sono infastiditi dalle regole, non sopportano le pretese altrui e spesso si dimostrano inaffidabili o nel migliore dei casi imprevedibili","Un mezzelfo ha all'incirca le steS&e dimensioni di un umano e la sua altezza pub variare dagli 1,5 agli 1,8 metri. Un mezzelfo è una creatura di taglia Media.",9F,"Un mezzelfo può parlare, leggere e scrivere in Comune, in Elfico e in un linguaggio extra a sua scelta.","Manuale del giocatore","Scurovisione. Grazie al suo sangue elfico, un mezzelfo beneficia di una vista superiore nell'oscurità e nelle condizioni di luce fioca. Un mezzelfo in condizioni di luce fioca può vedere fino a 18 metri come se si trovasse in condizioni di luce intensa e nell'oscurità come se si trovasse in luce fioca. Nell'oscurità non è in grado di discernere i colori. ma solo le tonalità di grigio. Retaggio Fatato. Un mezzelfo dispone di vantaggio ai tiri salvezza per non essere affascinato e non può essere addormentato tramite la magia. Versatilità nelle Abilità. Un mezzelfo ha competenza in due abilità a sua scelta","Nessuna"));
        //String nomeRazza, String incrementoPunteggi, String eta, String allineamento, String taglia, int velocita, String linguaggi, String manualeAppartenza, String altro, String sottoRazze
    }

    /**
     * Metodo per ottenere il dizionario delle razze
     * @return TreeSet {@literal Razza} - Dizionario delle razze
     */
    public TreeSet<Razza> getDizionarioRazze() {
        return dizionarioRazze;
    }
}
