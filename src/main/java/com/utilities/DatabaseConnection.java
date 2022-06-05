package com.utilities;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.net.UnknownHostException;

/**
 * Classe che si occupa della conessione al database
 */
public class DatabaseConnection {
    /**
     * Client del database MongoDb
     */
    public MongoClient mongoClient;
    /**
     * Database MongoDb dove sono inserite le collezioni
     */
    public MongoDatabase db;

    /**
     * Costruttore di classe che istanzi la connessione al DB.
     *
     * @throws UnknownHostException il costruttore può generare questo tipo eccezione se non riesce a connettersi al database
     */
    public DatabaseConnection() throws UnknownHostException {
        String uri="mongodb+srv://Federico:Commerciale98@cluster0.lguxq.mongodb.net/GestionaleDND?retryWrites=true&w=majority";

        try{
            this.mongoClient = MongoClients.create(uri);
            this.db = mongoClient.getDatabase("GestionaleDND");

        }catch (Exception e){

        }

    }

    /**
     * Metodo per ottenere il Client MongoDb al quale ci stiamo connettendo
     *
     * @return MongoClient
     */
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    /**
     * Metodo per ottenere il Database MongoDb all'interno del quale possimo trovare le collezioni di dati
     *
     * @return MongoDatabase
     */
    public MongoDatabase getDb() {
        return db;
    }
}
