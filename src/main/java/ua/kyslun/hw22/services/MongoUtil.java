package ua.kyslun.hw22.services;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoUtil {
    private static MongoClient mongoClient;

    private MongoUtil() {

    }

    private static MongoDatabase connect(final String dbName) {
        if (mongoClient == null) {
            mongoClient = new MongoClient("localhost", 27017);
        }
        return mongoClient.getDatabase(dbName);
    }

}
