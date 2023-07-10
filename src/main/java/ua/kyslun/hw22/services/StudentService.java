package ua.kyslun.hw22.services;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import ua.kyslun.hw22.models.DatabaseOperations;
import ua.kyslun.hw22.models.Student;

import java.util.Random;
import java.util.UUID;

public class StudentService implements DatabaseOperations {
    private static final String COLLECTION_NAME = "groups";
    private static final Random RANDOM = new Random();

    @Override
    public void create(final MongoDatabase database) {
        final Student student = createStudent();

        final Document document = new Document();
        document.append("_id", student.getId());
        document.append("name", student.getName());
        document.append("surname", student.getSurname());
        document.append("age", student.getAge());

        final MongoCollection<Document> persons = database.getCollection(COLLECTION_NAME);
        persons.insertOne(document);
    }

    @Override
    public void read(final MongoDatabase database) {
        final MongoCollection<Document> groups = database.getCollection(COLLECTION_NAME);
        final FindIterable<Document> documents = groups.find();

        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

    @Override
    public void update(final MongoDatabase database) {
        final MongoCollection<Document> groups = database.getCollection(COLLECTION_NAME);

        final Document filter = new Document();
        filter.append("name", "Student" + RANDOM.nextInt(40));

        final Document newData = new Document();
        newData.append("name", "Student" + RANDOM.nextInt(40));
        newData.append("surname", "Student" + RANDOM.nextInt(40));
        newData.append("age", RANDOM.nextInt(90));

        final Document updateObject = new Document();
        updateObject.append("$set", newData);

        groups.updateOne(filter, updateObject);
    }

    @Override
    public void delete(final MongoDatabase database) {
        final MongoCollection<Document> groups = database.getCollection(COLLECTION_NAME);

        final Document filter = new Document();
        filter.append("surname", "Student" + RANDOM.nextInt(40));

        groups.deleteOne(filter);
    }

    private Student createStudent() {
        final Student student = new Student();
        student.setId(UUID.randomUUID().toString());
        student.setName("Student" + RANDOM.nextInt(40));
        student.setSurname("Student" + RANDOM.nextInt(40));
        student.setAge(RANDOM.nextInt(90));
        return student;
    }

    public void getStudentsWithAgeMoreThan(final MongoDatabase database, final int numberOfStudents) {
        final MongoCollection<Document> groups = database.getCollection(COLLECTION_NAME);
        final FindIterable<Document> documents = groups.find(new Document("students", new Document("$gt", numberOfStudents)));

        for (Document doc : documents) {
            System.out.println(doc);
        }
    }
}
