package testMongo.testMongo;


import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestMongo {

	public static void main(String[] args) {
		 String uri = "mongodb://127.0.0.1:27017";
		    try (MongoClient mongoClient = MongoClients.create(uri)) {
		        MongoDatabase database = mongoClient.getDatabase("test1");
		        MongoCollection<Document> collection = database.getCollection("job");
		        Document doc = collection.find().first();
		        System.out.println(doc.toJson());
		    }
	}

}
