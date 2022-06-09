package com.utilities.dizionari;

import java.util.Set;
import java.util.TreeSet;

/**
 * Classe rappresentante il dizionario degli incantesimi
 */
public class DizionarioIncantesimi {
    /**
     * Attributo di classe rappresentante il dizionario attraverso un Set di oggetti di tipo Incantesimo
     */
    private TreeSet<Incantesimo> dizionarioIncantesimi;

    /**
     * Costruttore di classe volto al popolamento del dizionario
     */
    public DizionarioIncantesimi(){
        this.dizionarioIncantesimi=new TreeSet<>();
        
        dizionarioIncantesimi.add(new Incantesimo("Aiuto","2","1 azione","V,S,M (una minuscola striscia di tessuto bianco)","8 ore","9 metri","Abiurazione", new String[]{},"Questo incantesimo rafforza il vigore e la determinazione degli alleati. L'incantatore sceglie fino a tre creature entro gittata. 11 massimo dei punti ferita e i punti ferita attuali di ogni bersaglio aumentano di 5 per la durata dell'incantesimo. Ai Livelli Superiori. Quando l'incantatore lancia questo incantesimo usando uno slot incantesimo di 3° livello o superiore, i punti ferita di un bersaglio aumentano di altri 5 punti per ogni slot di livello superiore al 2°. "));
        dizionarioIncantesimi.add(new Incantesimo("Allarme","1","1 minuto","V,S,M (una campanella e un frammento di un sottile cavo d'argento","8 ore","9 metri","Abiurazione",new String[]{},"L'incantatore predispone un allarme contro le visite indesiderate. Sceglie una porta, una finestra o un'area entro gittata che non sia più grande di un cubo con spigolo di 6 metri. Finché l'incantesimo non termina, un allarme avverte l'incantatore ogni volta che una creatura di taglia Minuscola o superiore tocca l'area protetta o vi entra. Al momento del lancio dell'incantesimo, l'incantatore designa quali creature non faranno scattare l'allarme. Sceglie inoltre se l'allarme è mentale o udibile. Un allarme mentale fa scattare un suono nella mente dell'incantatore se questi si trova entro 1,5 km dall'area protetta. Questo suono lo sveglia se sta dormendo. Un allarme udibile genera il suono di una campana per 10 secondi entro 18 metri. "));
        dizionarioIncantesimi.add(new Incantesimo("Alleato Planare","6","10 minuti","V,S","Istantanea","18 metri","Evocazione",new String[]{},"L'incantatore chiede l'aiuto di un'entità ultraterrena che deve essergli nota: un dio, un primordiale, un principe dei demoni o qualche altro essere dotato di poteri cosmici. Quell'entità invia un celestiale, un elementale o un immondo a lei fedele in aiuto dell'incantatore. La creatura appare in uno spazio libero entro gittata. Se l'incantatore conosce il nome di una creatura specifica, può pronunciare quel nome quando lancia l'incantesimo per richiedere l'intervento di quella creatura, ma potrebbe comunque ricevere quello di una creatura diversa (a scelta del DM). Quando la creatura appare, non è obbligata in alcun modo a comportarsi in modo particolare. L'incantatore può chiederle di svolgere per lui un servizio in cambio di pagamento, ma essa non è obbligata ad accettare. Il compito da svolgere potrebbe variare dai più semplici (\"portaci in volo oltre il baratro\", \"aiutaci a vincere una battaglia\") ai più complessi (\"spia i nostri nemici\", \"proteggici durante la nostra incursione nel dungeon\"). L'incantatore deve essere in grado di comunicare con la creatura per mercanteggiare con lei e assicurarsi i suoi servigi. Il pagamento può assumere le forme più disparate. Un celestiale potrebbe richiedere un'ingente donazione in oro o in oggetti magici a un tempio alleato, mentre un immondo potrebbe esigere una creatura vivente in sacrificio o un tesoro in dono. Alcune creature potrebbero concedere i loro servigi in cambio di un compito che l'incantatore dovrà svolgere. Come regola generale. un compito che può essere misurato in minuti richiede un pagamento del valore di 100 mo per minuto. Un compito misurato in ore richiede 1.000 mo all'ora e un compito misurato in giorni (fino a 10 giorni) richiede 10.000 mo al giorno. Il DM può modificare questi pagamenti in base alle circostanze in cui l'incantatore lancia l'incantesimo. Se il compito è in sintonia con l'etica della creatura, il pagamento potrebbe essere dimezzato o addirittura superfluo. I compiti non pericolosi solitamente richiedono soltanto la metà del pagamento suggerito, mentre quelli particolarmente pericolosi potrebbero richiedere una ricompensa superiore. È raro che una creatura accetti un compito potenzialmente suicida. Dopo che la creatura ha portato a termine il compito, o quando la durata pattuita si esaurisce, la creatura fa ritorno al suo piano di origine dopo avere fatto rapporto all'incantatore, se questo è possibile e appropriato al compito in questione. Se l'incantatore non riesce ad accordarsi su un prezzo per i servizi della creatura, quest'ultima fa ritorno immediatamente sul suo piano di origine. Una creatura arruolata per unirsi al gruppo dell'incantatore conta come membro di quel gruppo e riceve la sua parte di punti esperienza concessi."));
        dizionarioIncantesimi.add(new Incantesimo("Allucinazione di forza","2","1 azione","V,S,M (un ciuffo di lana)","Concentrazione, fino a 1 minuto","18 metri","Illusione",new String[]{}," L'incantatore crea un'illusione che mette radici nella mente di una creatura entro gittata e che egli sia in grado di vedere. Il bersaglio deve effettuare un tiro salvezza su Intelligenza. Se lo fallisce, l'incantatore crea un oggetto, una creatura o un fenomeno fittizio di altra natura visibile a sua scelta, che non sia più grande di un cubo con spigolo di 3 metri e sia percepibile soltanto dal bersaglio per la durata dell'incantesimo. Questo incantesimo non ha effetto sui costrutti o sui non morti. L'allucinazione include suoni, temperature e altri stimoli analoghi, anch'essi evidenti soltanto alla creatura. Il bersaglio può usare la sua azione per esaminare l'allucinazione con una prova di Intelligenza (Indagare) contro la CD del tiro salvezza dell'incantesimo. Se la prova ha successo, il bersaglio capisce che l'allucinazione è un'illusione e l'incantesimo termina. Finché un bersaglio è influenzato dall'incantesimo, considera l'allucinazione come se fosse reale. Il bersaglio razionalizza qualsiasi esito illogico prodotto dalle sue interazioni con l'allucinazione. Per esempio, un bersaglio che tenta di camminare su un ponte fittizio che attraversa un baratro cadrà non appena muove piede sul ponte. Se il bersaglio sopravvive alla caduta, crederà comunque che il ponte esista e penserà a un'altra spiegazione per la sua caduta (è stato spinto, è scivolato, o un vento forte lo ha buttato di sotto). Un bersaglio influenzato è talmente convinto che l'allucinazione sia reale che può perfino subire danni da essa. Un' allucinazione creata per apparire come  una creatura può attaccare il bersaglio. Analogamente un'allucinazione creata per apparire come un fuoco, una pozza d'acido o un flusso di lava può bruciare il bersaglio. A ogni round, nel turno dell'incantatore, l'allucinazione può infliggere 1d6 danni psichici al bersaglio se esso si trova nell'area dell'allucinazione o entro 1.5 metri da essa purché l'allucinazione riproduca una creatura o un pericolo in grado di infliggere danni logicamente, per esempio attaccando. Il bersaglio percepisce i danni come se fossero del tipo appropriato per l'illusione. "));
        dizionarioIncantesimi.add(new Incantesimo("Allucinazione mortale","4","1 azione","V,S","Concentrazione, fino a 1 minuto","36 metri","Illusione", new String[]{}, "L'incantatore attinge agli incubi di una creatura entro gittata e che egli sia in grado di vedere, per creare una manifestazione illusoria delle sue paure più recondite, visibile soltanto a quella creatura. Il bersaglio deve effettuare un tiro salvezza su Saggezza. Se lo fallisce, diventa spaventato per la durata dell'incantesimo. Alla fine di ogni turno del bersaglio prima che l'incantesimo termini, il bersaglio deve superare un tiro salvezza su Saggezza, altrimenti subirà 4d10 danni psichici. Se lo supera, l'incantesimo termina. Ai Livelli Superiori. Quando l'incantatore lancia questo incantesimo usando uno slot incantesimo di 5° livello o superiore, i danni aumentano di 1d1O per ogni slot di livello superiore al 4°"));
        dizionarioIncantesimi.add(new Incantesimo("Alterare se stesso","2","1 azione","V,S","Concentrazione. fino a 1 ora","Incantatore","Trasmutazione",new String[]{}," L'incantatore assume una forma diversa, scegliendo al momento del lancio dell'incantesimo una delle opzioni seguenti, i cui effetti permangono per la durata dell'incantesimo. Finché l'incantesimo permane, l'incantatore può porre fine a un'opzione con un'azione per ottenere i benefici di un'opzione diversa. Adattamento Acquatico. L'incantatore adatta il suo corpo a un ambiente acquatico: sviluppa le branchie e una membrana tra le dita. Può respirare sott'acqua e ottiene una velocità di nuotare pari alla sua velocità base sul terreno. Armi Naturali. L'incantatore sviluppa artigli, zanne, spine, corna o un'arma naturale diversa a sua scelta. I suoi colpi senz'armi infliggono 1d6 danni contundenti, perforanti o taglienti, come appropriato per l'arma naturale scelta, e l'incantatore è competente nei colpi senz'armi. Infine, l'arma naturale è magica e l'incantatore ottiene un bonus di +1 ai tiri per colpire e ai tiri per i danni che effettua quando la usa. Cambiare Aspetto. L'incantatore altera il suo aspetto. Decide come apparire e definisce altezza, peso, lineamenti facciali, suono della voce, lunghezza dei capelli1 carnagione e tratti distintivi, se lo desidera. Può apparire come un membro di un'altra razza, ma nessuna delle sue statistiche cambia di conseguenza. Non può apparire come una creatura di taglia diversa dalla propria e la sua forma base resta la stessa; per esempio, se è bipede, non può usare questo incantesimo per diventare quadrupede. In qualsiasi momento entro la durata dell'incantesimo può usare la sua azione per cambiare di nuovo aspetto in questo modo. "));
        dizionarioIncantesimi.add(new Incantesimo("Amicizia","Trucchetto","1 azione","S,M (una piccola quantità di trucco da applicare al volto mentre si lancia l'incantesimo)","Concentrazione, fino ad 1 minuto","Incantatore","Ammaliamento",new String[]{},"Per la durata dell'incantesimo, l'incantatore dispone di vantaggio a tutte le prove di Carisma rivolte a una creatura a sua scelta che non sia ostile nei suoi confronti. Quando l'incantesimo termina, la creatura capisce che l'incantatore ha usato la magia per influenzare il suo umore e potrebbe diventare ostile nei suoi confronti. Se la creatura è tendente alla violenza, potrebbe attaccarlo. Un'altra creatura potrebbe cercare vendetta in altri modi (a discrezione del DM), in base alla natura delle sue interazioni con l'incantatore."));
        dizionarioIncantesimi.add(new Incantesimo("Amicizia con gli animali","1","1 azione","V,S,M (un boccone i cibo)","24 ore","9 metri","Ammaliamento",new String[]{},"Grazie a questo incantesimo l'incantatore convince una bestia che non ha alcuna intenzione di nuocerle. L'incantatore sceglie una bestia entro gittata e che egli sia in grado di vedere. La bestia deve vedere e sentire l'incantatore. Se l'Intelligenza della bestia è pari o superiore a 4, l'incantesimo fallisce. Altrimenti, la bestia deve superare un tiro salvezza su Saggezza o essere affascinata dall'incantatore per la durata dell'incantesimo. Se l'incantatore o uno dei suoi compagni infligge danni al bersaglio, l'incantesimo termina. Al Livelli Superiori. Quando l'incantatore lancia questo incantesimo usando uno slot incantesimo di 2° livello o superiore, può influenzare una bestia aggiuntiva per ogni slot di livello superiore al 1°."));
        dizionarioIncantesimi.add(new Incantesimo("Anatema","1","1 azione","V,S,M (una goccia di sangue)","Concentrazione, fino a 1 minuto","9 metri","Ammaliamento",new String[]{},"L'incantatore sceglie fino a tre creature entro gittata e che egli sia in grado di vedere, che dovranno effettuare un tiro salvezza su Carisma. Se una creatura fallisce il suo tiro salvezza, ogni volta che effettua un tiro per colpire o un tiro salvezza prima che l'incantesimo termini deve tirare 1d4 e sottrarre il numero ottenuto dal tiro per colpire o dal tiro salvezza. Al Livelli Superiori. Quando l'incantatore lancia questo incantesimo usando uno slot incantesimo di 2° livello o superiore, può bersagliare una creatura aggiuntiva per ogni slot di livello superiore al 1°."));
        dizionarioIncantesimi.add(new Incantesimo("Animale messaggero","2","1 azione","V,S,M (un boccone di cibo)","24 ore","9 metri","Ammaliamento (rituale)",new String[]{},"Grazie a questo incantesimo, l'incantatore usa un animale per trasmettere un messaggio, scegliendo una bestia "+"minuscola entro gittata e che egli sia in grado di vedere (per esempio uno scoiattolo, una ghiandaia o un pipistrello). L'incantatore specifica un luogo, che deve avere già visitato, e un destinatario che corrisponda a una descrizione generica come \"un uomo o una donna che indossi l'uniforme della guardia cittadina\" o \"un nano dai capelli rossi che indossi un cappello a punta\". Pronuncia inoltre un messaggio di un massimo di venticinque parole. La bestia bersaglio viaggia per la durata dell'incantesimo verso il luogo specificato, percorrendo circa 75 km in 24 ore nel caso di un messaggero volante, o 37,5 km nel caso di altri animali. Quando il messaggero arriva, trasmette il suo messaggio alla creatura che l'incantatore ha descritto, replicando il suono di sua scelta. Il messaggero parla solo con una creatura corrispondente alla descrizione fornita dall'incantatore. Se il messaggero non giunge a destinazione prima della fine dell'incantesimo, il messaggio è perduto e la bestia si rimette in viaggio verso il punto in cui l'incantesimo è stato lanciato. A livelli Superiori. Se l'incantatore lancia questo incantesimo usando uno slot incantesimo di 3° livello o superiore, la durata dell'incantesimo aumenta di 48 ore per ogni slot di livello superiore al 2°"));
        dizionarioIncantesimi.add(new Incantesimo("Animare Morti","3","1 minuto","V,S,M (una goccia di sangue, un brandello di carne, un pizzico di polvere d'osso)","Istantanea","3 metri","Necromanzia",new String[]{},"Questo incantesimo crea un servitore non morto, scegliendo un cadavere di umanoide Medio o Piccolo entro gittata. Il suo incantesimo infonde nel bersaglio un'empia parvenza di vita, animandolo come creatura non morta. Il bersaglio diventa uno scheletro se l'incantatore ha scelto le ossa o uno zombi se ha scelto un cadavere. (Il DM possiede le statistiche di gioco di queste creature.) A ogni suo turno l'incantatore può usare un'azione bonus per comandare mentalmente qualsiasi creatura da lui creata tramite questo incantesimo e situata entro 18 metri da lui (se controlla più creature, può comandarle tutte o nessuna allo stesso tempo, impartendo lo stesso comando a ogni creatura). L'incantatore decide quale azione effettuerà la creatura e dove si muoverà durante il suo turno successivo, oppure può impartire un comando generale, come per esempio vigilare su una camera o un corridoio in particolare. Se l'incantatore non impartisce alcun comando, la creatura si limita a difendersi dalle creature ostili. Una volta ricevuto un ordine, la creatura continua a seguirlo finché non ha portato a termine il compito. La creatura rimane sotto il controllo dell'incantatore per 24 ore, dopodiché smette di obbedire ai comandi che l'incantatore le ha impartito. Per mantenere il controllo della creatura per altre 24 ore, l'incantatore deve lanciare di nuovo questo incantesimo su di essa prima che l'attuale periodo di 24 ore termini. Questo uso dell'incantesimo gli permette di ristabilire il controllo su un massimo di quattro creature da lui animate tramite questo incantesimo, anziché animarne una nuova. Ai Livelli Superiori. Quando l'incantatore lancia questo incantesimo usando uno slot incantesimo di 4° livello o superiore, anima o ristabilisce il controllo su due creature non morte aggiuntive per ogni slot di livello superiore al 3°. Ognuna di queste creature deve provenire da un cumulo di ossa o da un cadavere diverso. "));
        dizionarioIncantesimi.add(new Incantesimo("Animare oggetti","5","1 azione","V,S","Concentrazione, fino a 1 minuto","36 metri","Trasmutazione",new String[]{},"Gli oggetti prendono vita a comando dell'incantatore, che sceglie fino a dieci oggetti non magici entro gittata che non siano indossati o trasportati. I bersagli Medi contano come due oggetti, quelli Grandi come quattro e quelli Enormi come otto oggetti. L'incantatore non può animare oggetti di taglia superiore a Enorme. Ogni bersaglio si anima e diventa una creatura sotto il suo controllo finché l'incantesimo non termina o finché non scende a O punti ferita. Come azione bonus, l'incantatore può comandare mentalmente qualsiasi creatura creata con questo incantesimo e situata entro 150 metri da lui (se controlla più creature, può comandarle tutte o nessuna allo stesso tempo, impartendo lo stesso comando a ogni creatura). L'incantatore decide quale azione effettuerà la creatura e dove si muoverà durante il suo turno successivo, oppure può impartire un comando generale, come per esempio vigilare su una camera o un corridoio in particolare. Se l'incantatore non impartisce alcun comando, la creatura si limita a difendersi dalle creature ostili. Una volta ricevuto un ordine, la creatura continua a seguirlo finché non ha portato a termine il compito. "+"Un oggetto animato è un costrutto dotato di CA, punti ferita, attacchi, Forza e Destrezza determinati dalla sua taglia. La sua Costituzione è pari a 10, la sua Intelligenza e Saggezza sono pari a 3 e il suo Carisma è pari a 1. La sua velocità è pari a 9 metri; se l'oggetto è privo di gambe o altre appendici che possa usare per la locomozione, ottiene invece una velocità di volare pari a 9 metri e pub fluttuare. Se l'oggetto è agganciato saldamente a una superficie o a un oggetto più grosso, come una catena imbullonata a una parete, la sua velocità è pari a O. È dotato di vista cieca entro un raggio di 9 metri ed è cieco oltre quella distanza. Quando l'oggetto animato scende a O punti ferita, riassume la forma dell'oggetto originale e ogni danno rimanente si trasferisce alla forma dell'oggetto originale. Se l'incantatore comanda a un oggetto di attaccare, esso può effettuare un singolo attacco in mischia contro una creatura entro 1,5 metri da esso. L'oggetto effettua un attacco con schianto con un bonus al tiro per colpire e ai danni contundenti determinati dalla sua taglia. Il DM potrebbe decidere che uno specifico oggetto infligga danni taglienti o perforanti, in base alla sua forma. Ai Livelli Superiori. Se l'incantatore lancia questo incantesimo usando uno slot incantesimo di 6° livello o superiore, può animare due oggetti aggiuntivi per ogni slot di livello superiore al 5°. "));
        dizionarioIncantesimi.add(new Incantesimo("Anti-Individuazione","3","1 azione","V,S,M (un pizzico di polvere di diamante da spruzzare sul bersaglio del valore di 25 mo, che l'incantesimo consuma)","8 ore","Contatto","Abiurazione",new String[]{},"Per la durata dell'incantesimo, l'incantatore nasconde un bersaglio da lui toccato dalle magie di divinazione. Il bersaglio può essere una creatura consenziente o un luogo o un oggetto non più grande di 3 metri in ogni dimensione. Il bersaglio non può essere bersagliato da alcuna magia di divinazione né percepito dai sensori di scrutamento magico."));
        dizionarioIncantesimi.add(new Incantesimo("Antipatia/Simpatia","8","1 ora","V,S,M ( un frammento di allume immerso nell'aceto per un effetto di antipatia o una goccia di miele per un effetto di simpatia","10 giorni","18 metri","Ammaliamento",new String[]{}, "Questo incantesimo attira o repelle un tipo di creatura. L'incantatore sceglie un bersaglio entro gittata, che può trattarsi di un oggetto o di una creatura di taglia Enorme o inferiore, o di un'area della grandezza massima di un cubo con spigolo di 60 metri. Dopodiché specifica un tipo di creatura intelligente, come i draghi rossi, i goblin o i vampiri. L'incantatore infonde nel bersaglio un'aura che attira o respinge le creature specificate per la durata dell'incantesimo scegliendo antipatia o simpatia come effetto dell'aura. Antipatia. L'ammaliamento suscita nelle creature del tipo designato dall'incantatore il desiderio impellente di abbandonare l'area ed evitare il bersaglio. Quando una tale creatura vede il bersaglio o giunge entro 18 metri da esso, deve superare un tiro salvezza su Saggezza, altrimenti diventa spaventata. La creatura rimane spaventata fintanto che è in grado di vedere il bersaglio o rimane entro 18 metri da esso. Finché è spaventata dal bersaglio, deve usare il suo movimento per muoversi verso il punto sicuro più vicino da cui non vedrà più il bersaglio. Se la creatura si allontana a più di 18 metri dal bersaglio e non è più in grado di vederlo, cessa di essere spaventata, ma lo diventa di nuovo se torna a vedere il bersaglio o a trovarsi entro 18 metri da esso. Simpatia. L'ammaliamento fa si che le creature specificate provino il desiderio impellente di avvicinarsi al bersaglio finché si trovano entro 18 metri da esso o sono in grado di vederlo. Quando una tale creatura vede il bersaglio o giunge entro 18 metri da esso, deve superare un tiro salvezza su Saggezza o usare il suo movimento in ogni suo turno per entrare nell'area o muoversi entro la portata del bersaglio. Una volta fatto questo, la creatura non può più muoversi volontariamente per allontanarsi dal bersaglio. Se il bersaglio infligge danni a una creatura influenzata o le nuoce in altri modi, essa può effettuare un tiro salvezza per terminare l'effetto come descritto sotto. Terminare l'effetto. Se una creatura influenzata termina il suo turno oltre 18 metri dal bersaglio o non è in grado di vederlo, effettua un tiro salvezza su Saggezza. Se lo supera, non è più influenzata dal bersaglio e capisce che la sensazione di ripugnanza o di attrazione era magica. Inoltre. una creatura influenzata dall'incantesimo ha diritto a un altro tiro salvezza su Saggezza ogni 24 ore finché l'incantesimo permane. Una creatura che supera un tiro salvezza contro questo effetto è immune a esso per 1 minuto, dopodiché può esserne influenzata di nuovo."));
        dizionarioIncantesimi.add(new Incantesimo("Arma Elementale","3","1 azione","V,S","Concentrazione, fino a 1 ora","Contatto","Trasmutazione",new String[]{},"Un'arma non magica toccata dall'incantatore diventa un'arma  magica. L'incantatore sceglie uno dei tipi di danno seguenti:  acido, freddo, fulmine, fuoco o tuono. Per la durata  dell'incantesimo, l'arma ottiene un bonus di +1 ai tiri per colpire  e infligge 1d4 danni extra del tipo scelto quando colpisce.  Ai livelli Superiori. Quando l'incantatore lancia questo  incantesimo usando uno slot incantesimo di 5° o 6° livello,  il bonus ai tiri per colpire aumenta a +2 e i danni extra .  aumentano a 2d4. Quando l'incantatore usa uno slot  incantesimo di 7° livello o superiore, il bonus aumenta a +3  e i danni extra aumentano a 3d4. "));
        dizionarioIncantesimi.add(new Incantesimo("Arma magica","2","1 azione bonus", "V,S","Concentrazione, fino a 1 ora","Contatto","Trasmutazione",new String[]{},"L'incantatore tocca un'arma non magica e finché l'incantesimo  non termina, quell'arma diventa un'arma magica con un  bonus di +1 ai tiri per colpire e ai tiri per i danni.  Ai livelli Superiori. Quando l'incantatore lancia questo  incantesimo usando uno slot incantesimo di 4° livello o  superiore, il bonus aumenta a +2. Quando l'incantatore  usa uno slot incantesimo di 6° livello o superiore, il bonus  aumenta a +3. "));
        dizionarioIncantesimi.add(new Incantesimo("Arma Spirituale","2","1 azione bonus","V,S","1 minuto","18 metri","Invocazione",new String[]{},"L'incantatore crea entro gittata un'arma fluttuante spettrale  che permane per la durata dell'incantesimo o finché  l'incantatore non lancia di nuovo questo incantesimo.  Quando lancia questo incantesimo, l'incantatore può  effettuare un attacco in mischia con questo incantesimo  contro una creatura entro 1,5 metri dall'arma. Se colpisce,  il bersaglio subisce 1d8 danni da forza + il modificatore di  caratteristica da incantatore.  Con un'azione bonus nel suo turno, l'incantatore può  muovere l'arma di un massimo di 6 metri e ripetere l'attacco  contro una creatura situata entro 1,5 metri da essa.  L'arma può assumere la forma che l'incantatore preferisce.  I chierici di una divinità associata a un tipo particolare  di arma (come per esempio St. Cuthbert, noto per la sua  mazza, o Thor per il suo martello) impartiranno all'arma  creata da questo incantesimo la forma di tale arma.  Ai Livelli Superiori. Quando l'incantatore lancia questo  incantesimo usando uno slot incantesimo di 4° livello o  superiore, i danni aumentano di 1d8 per ogni due slot  incantesimo superiori al 2°"));
        dizionarioIncantesimi.add(new Incantesimo("Armatura di Agathys","1","1 azione","V,S,M (una coppa d'acqua)","1 ora","Incantatore","Abiurazione",new String[]{},"Una forza magica protettiva circonda l'incantatore,  manifestandosi come una patina di gelo spettrale che  ricopre sia lui che il suo equipaggiamento. L'incantatore  ottiene 5 punti ferita temporanei per la durata  dell'incantesimo. Se una creatura, colpisce l'incantatore  con un attacco in mischia finché egli possiede questi punti  ferita, essa subisce 5 danni da freddo.  Ai Livelli Superiori. Quando l'incantatore lancia questo  incantesimo usando uno slot incantesimo di 2° livello o  superiore, sia i punti ferita temporanei che i danni da freddo  aumentano di 5 per ogni slot di livello superiore al 1°. "));
        dizionarioIncantesimi.add(new Incantesimo("Armatura Magica","1","1 azione","V,S,M (un pezzo di cuoio trattato)","8 ore","Contatto","Abiurazione",new String[]{},"L'incantatore tocca una creatura consenziente che non  indossi un'armatura, e una forza magica protettiva circonda  quella creatura finché l'incantesimo non termina. La CA  base del bersaglio diventa 13 + il suo modificatore di  Destrezza. L'incantesimo termina se il bersaglio indossa  un'armatura o se l'incantatore interrompe l'incantesimo  con un'azione. "));
        //TODO inserire i /n per separare l'elenco puntato
        dizionarioIncantesimi.add(new Incantesimo("Artificio Druidico","Trucchetto","1 azione","V,S","Istantanea","9 metri","Trasmutazione",new String[]{},"Sussurrando agli spiriti della natura, l'incantatore crea uno degli effetti seguenti entro gittata:  • L'incantatore crea un minuscolo sensore innocuo che predice il tempo atmosferico nel suo luogo per le 24 ore successive. Il sensore potrebbe manifestarsi come un globo dorato in caso di cielo sereno, una nube in caso di pioggia, un ammasso di fiocchi di neve in caso di neve e così via. L'effetto permane per 1 round.  • L'incantatore fa sbocciare istantaneamente un fiore, aprire un baccello o schiudere un germoglio.  • L'incantatore crea un effetto sensoriale istantaneo e innocuo come un cumulo di foglie volanti, uno sbuffo di vento, il rumore di un piccolo animale o il vago odore di una puzzola. L'effetto non deve essere più grande di un cubo con spigolo di 1,5 metri.  • L'incantatore accende o spegne istantaneamente una candela, una torcia o un piccolo fuoco da campo. "));
        dizionarioIncantesimi.add(new Incantesimo("Aura di purezza","4","1 azione","V","Concentrazione, fino a 10 minuti","Incantatore (raggio di 9 metri)","Abiurazione",new String[]{},"L'incantatore emana un'aura di energia purificatrice entro un raggio di 9 metri. Finché l'incantesimo non termina, l'aura si muove assieme a lui ed è centrata su di lui. Ogni creatura non ostile entro l'aura (incluso l'incantatore) non può diventare malata, è dotata di resistenza ai danni da veleno e dispone di vantaggio ai tiri salvezza contro gli effetti che provocano qualsiasi condizione tra le seguenti: accecato, affascinato, assordato, avvelenato, paralizzato, spaventato e stordito. "));
        dizionarioIncantesimi.add(new Incantesimo("Aura di vita","4","1 azione","V","Concentrazione, fino a 10 minuti","Incantatore (raggio di 9 metri)","Abiurazione",new String[]{},"L'incantatore emana un'aura di energia che preserva la vita entro un raggio di 9 metri. Finché l'incantesimo non termina, l'aura si muove assieme a lui ed è centrata su di lui. Ogni creatura non ostile entro l'aura (incluso l'incantatore) è dotata di resistenza ai danni necrotici e il suo massimo dei punti ferita non può essere ridotto. Inoltre, ogni creatura vivente non ostile recupera 1 punto ferita quando inizia il proprio turno entro l'aura con O punti ferita"));
        dizionarioIncantesimi.add(new Incantesimo("Aura di vitalità","3","1 azione","V","Concentrazione, fino a 1 minuto","Incantatore (raggio di 9 metri)","Invocazione",new String[]{},"L'incantatore emana un'aura di energia curativa entro un raggio di 9 metri. Finché l'incantesimo non termina, l'aura si muove assieme a lui ed è ('entrata su di lui. L'incantatore può usare un'azione bonus per far si che una creatura entro l'aura (incluso l'incantatore) recuperi 2d6 punti ferita."));
        //dizionarioIncantesimi.add(new Incantesimo("Aura magica di Nystul",new String[]{}))
        //(String nomeIncantesimo, String livello, String tempoLancio, List<String> componenti, String durata, String gittata, String tipo, List<String> classiAppartenenza, String descrizione)

    }

    /**
     * Metodo volto a ottenere il dizionario
     * @return Set {@literal <Incantesimo>}
     */
    public TreeSet<Incantesimo> getDizionarioIncantesimi() {
        return this.dizionarioIncantesimi;
    }
}
