package hwSeminar5;
//1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map <Integer, String> db = new HashMap<>();
        db.putIfAbsent(892452, "Иванова Ольга Ивановна");
        db.putIfAbsent(982551, "Иванова Ольга Ивановна");
        db.putIfAbsent(982553, "Петров Василий Михайлович");
        db.putIfAbsent(982554, "Ларинов Виктор Олегович");
        db.putIfAbsent(982556, "Краснова Ева Олеговна");
        db.putIfAbsent(198255, "Дронов Олег Викторовч");
        System.out.println("Телефонный справочник");
        for (var item : db.entrySet()) {
            System.out.printf("тел.: %d: ФИО: %s\n", item.getKey(), item.getValue());
        }
    }
}
