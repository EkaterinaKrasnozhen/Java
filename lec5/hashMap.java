import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map <Integer, String> db = new HashMap<>();
        db.put(1, "one");
        db.putIfAbsent(2, "two");
        System.out.println(db);
        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}
