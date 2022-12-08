package seminar5;

import java.util.HashMap;
import java.util.Map;

// Задание №1

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

public class task1 {
    public static void main(String[] args) {
        String [] s = "123456 Иванов 321456 Васильев 654321 Петрова 345678 Иванов 234561 Петрова 234432 Иванов ".split("");
        Map <Integer, String> db = new HashMap<>();
  
        db.putIfAbsent(123456, "Иванов");
        db.putIfAbsent(345678, "Иванов");
        db.putIfAbsent(234432, "Иванов");
        db.putIfAbsent(321456, "Васильев");
        db.putIfAbsent(654321, "Петрова");

        for (var item : db.entrySet()) {
            if (item.getValue().equals("Иванов"))
                System.out.println(item);
        }
    }
}
