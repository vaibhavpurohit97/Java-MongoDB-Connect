/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mongoretrieve;

/**
 *
 * @author A
 */
import java.util.ArrayList;
import java.util.List;
 
import org.bson.Document;
 
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class MongoRetrieve {
    public static void main(String args[])
    {
        // Connection Establishment
        MongoClient mc = new MongoClient("localhost" , 27017);
        
        // Database Reference
        MongoDatabase db = mc.getDatabase("demodb");
        
        // Retrieve List of Elements
        MongoCollection<Document> col = db.getCollection("demodb");
        List<Document> docs = (List<Document>)col.find().into(new ArrayList<Document>());
        for(Document d : docs)
        {
            System.out.println(d);
            
        }
                
    }
}
