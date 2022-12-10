import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map <Integer, String> db = new HashMap<>(); // по умолчанию 16 элементов
        //Map <Integer, String> db = new HashMap<>(9, 1.0f); можно 0.7 -> тогда 70%, будет увеличиваться, 
        //когда 9 заполнятся на 100 процентов, обычно при 75-80%
        db.put(1, "one");
        db.putIfAbsent(2, "two");
        //System.out.println(db);
        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue()); //[1: one] [2: two]
        }

    }
}
