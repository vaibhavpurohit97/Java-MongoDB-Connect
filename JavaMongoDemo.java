/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mongojavaconnection;

/**
 *
 * @author A
 */
import com.mongodb.*;
import com.mongodb.MongoClient;  
import com.mongodb.client.MongoCollection;  
import com.mongodb.client.MongoDatabase;  
import org.bson.Document;

public class JavaMongoDemo {
    public static void main(String args[])
    {
        // Connection Establishment to MongoDB
        MongoClient mc = new MongoClient("localhost" , 27017);
        
        // Refer to the Database
        MongoDatabase db = mc.getDatabase("demodb"); 
        
        
        mc.getDatabaseNames().forEach(System.out::println);
        
        // Insert element in the database
        MongoCollection<Document> table = db.getCollection("demodb"); 
        Document doc = new Document("Name", "Vasu");  
        doc.append("ID",174);  
        table.insertOne(doc);
    }
    
}
