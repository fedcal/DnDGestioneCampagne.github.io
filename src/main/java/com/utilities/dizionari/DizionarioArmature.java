package com.utilities.dizionari;

import java.util.Set;
import java.util.TreeSet;

/**
 * Classe rappresentante le armature disponibili
 */
public class DizionarioArmature {
    /**
     * TreeSet rappresentante il dizionario contenente le armature
     */
    private Set<Armature> dizionarioArmature=new TreeSet<>();

    /**
     * Costruttore di classe che serve a popolare il dizionario
     */
    public DizionarioArmature(){
        this.dizionarioArmature.add(new Armature("Imbottita","Armatura leggera","5 mo","11 + modificatore di Des","--","Svantaggio",4F));
        this.dizionarioArmature.add(new Armature("Cuoio","Armatura leggera","10 mo","11 + modificatore di Des","--","--",5F));
        this.dizionarioArmature.add(new Armature("Cuoio borchiato","Armatura leggera","45 mo","12 + modificatore di Des","--","--",6.5F));
        this.dizionarioArmature.add(new Armature("Pelle","Armatura media","10 mo","12 + modificatore di Des (max 2)","--","--",6F));
        this.dizionarioArmature.add(new Armature("Giaco di maglia","Armatura media","50 mo","13 + modificatore di Des (max 2)","--","--",10F));
        this.dizionarioArmature.add(new Armature("Corazza di scaglie","Armatura media","50 mo","14 + modificatore di Des (max 2)","--","Svantaggio",22.5F));
        this.dizionarioArmature.add(new Armature("Corazza di piastre","Armatura media","400 mo","14 + modificatore di Des (max 2)","--","--",10F));
        this.dizionarioArmature.add(new Armature("Mezza Armatura","Armatura media","750 mo","15 + modificatore di Des (max 2)","--","Svantaggio",20F));
        this.dizionarioArmature.add(new Armature("Corazza ad anelli","Armatura pesante","30 mo","14","--","Svantaggio",20F));
        this.dizionarioArmature.add(new Armature("Cotta di maglia","Armatura pesante","75 mo","16","For 13","Svantaggio",27.5F));
        this.dizionarioArmature.add(new Armature("Corazza a Strisce","Armatura pesante","200 mo","17","For 15","Svantaggio",30F));
        this.dizionarioArmature.add(new Armature("Armatura completa","Armatura pesante","1500 mo","18","For 15","Svantaggio",32.5F));
        this.dizionarioArmature.add(new Armature("Scudo","Scudo","10 mo","+2","--","--",3F));
    }

    /**
     * Metodo per ottenere il dizionario delle armature
     * @return TreeSet {@literal <Armature>}
     */
    public Set<Armature> getDizionarioArmature() {
        return dizionarioArmature;
    }
}
