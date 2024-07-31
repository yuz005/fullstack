package sec04;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class UpdateOneTest {
    public static void main(String[] arg){
        MongoCollection<Document> collection = Database.getCollection("users");

        String id = "666a6b65a25a4c74fddfedc2";
        Bson query = eq("_id", new ObjectId(id));

        Bson update = Updates.combine(
                Updates.set("name","modify name"),
                Updates.currentTimestamp("lastUpdate"));

        UpdateResult result = collection.updateOne(query, update);
        System.out.println("==> UpdateResult" + result.getModifiedCount());
        Database.close();
    }
}
