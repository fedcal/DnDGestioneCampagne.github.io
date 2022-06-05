package com.gestionalednd;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.utilities.DatabaseConnection;

import java.net.UnknownHostException;

/**
 * Classe Launcher che richiama il main della home.
 */
public class Launcher {
    /**
     * Attributo per la connessione al database
     */
    static DatabaseConnection databaseMongo;

    /**
     * Main della classe launcher
     * @param args argomenti apllicazione
     * @throws UnknownHostException Eccezione nel caso in cui l'applicativo non riesce a connettersi al database
     */
    public static void main(String[] args) throws UnknownHostException {
        try {
            databaseMongo= new DatabaseConnection();
            HomeApplication.main(args);
        }catch (Error e){
            System.out.println("\n\n \t \t ATTENZIONE !!!!!\n\n Prima di eseguire lo script.bat, assicurati di aver" +
                    " scaricato il software Bellfost e di essere connesso a internet.");
        }

    }

    /**
     * Metodo per ottenere il client del database
     * @return MongoClient - client database
     */
    public MongoClient getMongoClient(){
        return databaseMongo.getMongoClient();
    }

    /**
     * Metodo per ottenere il database dove sono conservate le collections
     * @return MongoDatabase - database
     */
    public static MongoDatabase getDb(){
        return databaseMongo.getDb();
    }
}
