package ua.kyslun.hw22.models;

import com.mongodb.client.MongoDatabase;

public interface DatabaseOperations {

    void create(MongoDatabase database);

    void read(MongoDatabase database);

    void update(MongoDatabase database);

    void delete(MongoDatabase database);
}
