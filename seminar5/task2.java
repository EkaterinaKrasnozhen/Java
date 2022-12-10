// Задание №2

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package seminar5;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        String [] s = "{a+]}{(d*3)}".split("");    
        yes(s);
    }
    
    public static void yes(String [] str) {
        
        Map<String, Integer> db = new HashMap<>();
        db.put("(", 0);
        db.put(")", 0);
        db.put("[", 0);
        db.put("]", 0);
        db.put("{", 0);
        db.put("}", 0);

        for (String symbol : str) {
            int count1 = 0;
            for (var item : db.entrySet()) {
                if (symbol.equals(item.getKey())) {
                    count1 = db.get(item.getKey());
                    db.put(item.getKey(), ++count1);
                }
            }        
        }System.out.println(db); 
        if (db.get("(") == db.get("(") & db.get("{") == db.get("}") & db.get("[") == db.get("]")) {
                System.out.printf("верно");
        }
        else {
            System.out.printf("не верно");
        }
    }    
}
