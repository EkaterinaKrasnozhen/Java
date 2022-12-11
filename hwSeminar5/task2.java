// 2. Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена 
// с количеством повторений. Отсортировать по убыванию популярности.

package hwSeminar5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class task2 {
    public static void main(String[] args) {
        String [] s = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Иван Ежов Петр Лыков".split(" ");
        Map<String,Integer> data = new HashMap<>();
        Map<String, Integer> result = new LinkedHashMap<>();
        for (int index = 0; index < s.length; index+=2) {
            data.putIfAbsent(s[index], 0);
        }
        for (String symbol : s) {
            int count1 = 0;
            for (var item : data.entrySet()) {
                if (symbol.equals(item.getKey())) {
                    count1 = data.get(item.getKey());
                    data.put(item.getKey(), ++count1);//в data имена (ключ) и количество повторений в строке (значение)
                }
            }
        }
        System.out.println(data);
        List <Integer> sortArray = new ArrayList<>(data.values()); //передаем значения в список
        Collections.sort(sortArray);//сортируем
        Collections.reverse(sortArray);//реверс в обратном порядке
        System.out.println(sortArray); //не пойму как этот список связать с именами (ключами) из data
        for (var i : data.entrySet()) {
            for (int e : sortArray) {
               if (i.getValue().equals(e)) {
                   result.put(i.getKey(), e); 
               } 
            }
        }System.out.println(result);
    }
}
