package com.utilities.dizionari;

import java.util.Set;
import java.util.TreeSet;

/**
 * Classe dizionario delle armi
 */
public class DizionarioArmi {
    /**
     * Insieme ordinato contenente le armi
     */
    private Set<Arma> dizionarioArmi=new TreeSet<>();

    /**
     * Costruttore di classe per popolare il dizionario
     */
    public DizionarioArmi(){

        //Arma da mischia semplice
        this.dizionarioArmi.add(new Arma("Ascia","Arma da mischia semplice","1d6","Taglienti","5 mo",1F,"Lancio (gittata 6/18), Leggera"));
        this.dizionarioArmi.add(new Arma("Bastone Ferrato","Arma da mischia semplice","1d6","Contundenti","2 mo",2F,"Versatile 1d8"));
        this.dizionarioArmi.add(new Arma("Falcetto","Arma da mischia semplice","1da","Taglienti","1 mo",1F,"Leggera"));
        this.dizionarioArmi.add(new Arma("Giavellotto","Arma da mischia semplice","1d6","Perforanti","5 mo",1F,"Lancio (gittata 9/36)"));
        this.dizionarioArmi.add(new Arma("Lancia","Arma da mischia semplice","1d6","Perforanti","5 mo",1.5F,"Lancio (gittata 6/18), Versatile 1d8"));
        this.dizionarioArmi.add(new Arma("Martello leggero","Arma da mischia semplice","1d4","Contundenti","2 mo",1F,"Lancio (gittata 6/18), Leggera"));
        this.dizionarioArmi.add(new Arma("Mazza","Arma da mischia semplice","1d6","Contundenti","5 mo",2F," "));
        this.dizionarioArmi.add(new Arma("Pugnale","Arma da mischia semplice","1d4","Perforanti","2 mo",0.5F,"Accurata, Lancio(gittata 6/18), Leggera"));
        this.dizionarioArmi.add(new Arma("Randello","Arma da mischia semplice","1d4","Contundenti","1 ma",1F,"Leggera"));
        this.dizionarioArmi.add(new Arma("Randello pesante","Arma da mischia semplice","1d8","Contundenti","2 ma",5F,"Due mani"));

        //Armi a distanza semplici
        this.dizionarioArmi.add(new Arma("Arco Corto","Arma a distanza semplice","1d6","Perforanti","25 mo",1F,"Due mani, Munizioni (gittata 24/96)"));
        this.dizionarioArmi.add(new Arma("Balestra Leggera","Arma a distanza semplice","1d8","Perforanti","25 mo",2.5F,"Due mani, Munizioni (gittata 24/96), Ricarica"));
        this.dizionarioArmi.add(new Arma("Dardo","Arma a distanza semplice","1d4","Perforanti","5 mr",0.125F,"Accurata, Lancio (gittata 6/18)"));
        this.dizionarioArmi.add(new Arma("Fionda","Arma a distanza semplice","1d4","Contundenti","1 ma",1F,"Munizioni (gittata 9/36)"));

        //Armi a distanza da guerra
        this.dizionarioArmi.add(new Arma("Arco Lungo","Arma a distanza da guerra","1d8","Perforanti","50 mo",1F,"Due mani, Munizioni (gittata 45/180), Pesante"));
        this.dizionarioArmi.add(new Arma("Balestra a mano","Arma a distanza da guerra","1d6","Perforanti","75 mo",1.5F,"Leggera, Munizioni (gittata 9/36), Ricarica"));
        this.dizionarioArmi.add(new Arma("Balestra Pesante","Arma a distanza da guerra","1d10","Perforanti","50 mo",9F,"Due mani, Munizioni (gittata 30/120), Pesante, Ricarica"));
        this.dizionarioArmi.add(new Arma("Cerbottana","Arma a distanza da guerra","1","Perforante","10 mo",1F,"Munizioni (gittata 7,5/30), Ricarica"));
        this.dizionarioArmi.add(new Arma("Rete","Arma a distanza da guerra"," "," ","1 mo",1.5F,"Speciale, Lancio (gittata 1,5/4,5)"));

        //Armi da mischia da guerra
        this.dizionarioArmi.add(new Arma("Alabarda","Arma da mischia da guerra","1d10","Taglienti","20 mo",3F,"Due mani, Pesante, Portata"));
        this.dizionarioArmi.add(new Arma("Ascia Bipenne","Arma da mischia da guerra","1d12","Taglienti","30 mo",3.5F,"Due mani, Pesante"));
        this.dizionarioArmi.add(new Arma("Ascia da battaglia","Arma da mischia da guerra","1d8","Taglienti","20 mo",2F,"Versatile (1d10)"));
        this.dizionarioArmi.add(new Arma("Falcione","Arma da mischia da guerra","1d10","Taglienti","20 mo",3F,"Due mani, Pesante, Portata"));
        this.dizionarioArmi.add(new Arma("Frusta","Arma da mischia da guerra","1d4","Taglienti","2 mo",1.5F,"Accurata, Portata"));
        this.dizionarioArmi.add(new Arma("Lancia da cavaliere","Arma da mischia da guerra","1d12","Perforanti","10 mo",3F,"Speciale, Portata"));
        this.dizionarioArmi.add(new Arma("Maglio","Arma da mischia da guerra","2d6","Contundenti","10 mo",3F,"Due mani, Pesante"));
        this.dizionarioArmi.add(new Arma("Martello da guerra","Arma da mischia da guerra","1d8","Contundenti","15 mo",1F,"Versatile (1d10)"));
        this.dizionarioArmi.add(new Arma("Mazzafrusto","Arma da mischia da guerra","1d8","Contundenti","10 mo",1F," "));
        this.dizionarioArmi.add(new Arma("Morning Star","Arma da mischia da guerra","1d8","Perforanti","15 mo",2F," "));
        this.dizionarioArmi.add(new Arma("Picca","Arma da mischia da guerra","1d10","Perforanti","5 mo",9F,"Due mani, Pesante, Portata"));
        this.dizionarioArmi.add(new Arma("Piccone da guerra","Arma da mischia da guerra","1d8","Taglienti","5 mo",1F," "));
        this.dizionarioArmi.add(new Arma("Scimitarra","Arma da mischia da guerra","1d6","Taglienti","25 mo",1.5F,"Accurata, Leggera"));
        this.dizionarioArmi.add(new Arma("Spada Corta","Arma da mischia da guerra","1d6","Perforanti","10 mo",1F,"Accurata, Leggera"));
        this.dizionarioArmi.add(new Arma("Spada Lunga","Arma da mischia da guerra","1d8","Taglienti","15 mo",3F,"Versatile (1d10)"));
        this.dizionarioArmi.add(new Arma("Spadone","Arma da mischia da guerra","2d6","Taglienti","50 mo",3F,"Due mani, Pesante"));
        this.dizionarioArmi.add(new Arma("Stocco","Arma da mischia da guerra","1d8","Perforanti","25 mo",1F,"Accurata"));
        this.dizionarioArmi.add(new Arma("Tridente","Arma da mischia da guerra","1d6","Perforanti","5 mo",2F,"Lancio (gittata 6/18), Versatile (1d8)"));
    }

    /**
     * Metodo per ottenere il dizionario delle armi
     * @return TreeSet {@literal <Arma>} - Insieme ordinato di armi
     */
    public Set<Arma> getDizionarioArmi() {
        return dizionarioArmi;
    }

    /**
     * Metodo per impostare il dizionario delle armi
     * @param dizionarioArmi TreeSet {@literal <Arma>}  - Insieme ordinato di armi
     */
    public void setDizionarioArmi(Set<Arma> dizionarioArmi) {
        this.dizionarioArmi = dizionarioArmi;
    }

    /**
     * Metodo per aggiungere un arma
     * @param e Arma da aggiungere
     * @return true
     */
    public boolean addArma(Arma e){
        dizionarioArmi.add(e);
        return true;
    }
}
