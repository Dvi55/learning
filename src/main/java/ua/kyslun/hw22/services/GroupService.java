package ua.kyslun.hw22.services;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import ua.kyslun.hw22.models.DatabaseOperations;
import ua.kyslun.hw22.models.Group;
import ua.kyslun.hw22.models.Student;

import java.time.LocalDate;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class GroupService implements DatabaseOperations {
    private static final String COLLECTION_NAME = "groups";

    private static final Random RANDOM = new Random();
    private Set<Student> students;

    @Override
    public void create(final MongoDatabase database) {
        final Group group = createGroup(students);

        final Document document = new Document();
        document.append("_id", group.getId());
        document.append("Group name", group.getGroupName());
        document.append("age", group.getDateCreate());
        document.append("students", group.getStudents());

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
        filter.append("Group name", 80);

        final Document newData = new Document();
        newData.append("Group name", 50);

        final Document updateObject = new Document();
        updateObject.append("$set", newData);

        groups.updateOne(filter, updateObject);
    }

    @Override
    public void delete(final MongoDatabase database) {
        final MongoCollection<Document> groups = database.getCollection(COLLECTION_NAME);

        final Document filter = new Document();
        filter.append("Group name", 50);

        groups.deleteOne(filter);
    }

    private Group createGroup(Set<Student> students) {
        final Group group = new Group();
        group.setId(UUID.randomUUID().toString());
        group.setGroupName("Group" + RANDOM.nextInt(1000));
        group.setDateCreate(LocalDate.now());
        this.students = students;
        return group;
    }
    public void getGroupWithNumberOfStudentsBiggerThan(final MongoDatabase database, final int numberOfStudents) {
        final MongoCollection<Document> groups = database.getCollection(COLLECTION_NAME);
        final FindIterable<Document> documents = groups.find(new Document("students", new Document("$gt", numberOfStudents)));

        for (Document doc : documents) {
            System.out.println(doc);
        }
    }
    public void getGroupWithNameAround(final MongoDatabase database, final String name) {
        final MongoCollection<Document> groups = database.getCollection(COLLECTION_NAME);
        final FindIterable<Document> documents = groups.find(new Document("groupName", new Document("$regex", name)));

        for (Document doc : documents) {
            System.out.println(doc);
        }
    }
}
