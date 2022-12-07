import java.util.HashMap;
import java.util.Map;

// map -множество коллекций, работающих с данными по принципу ключ-значение
//- только уникальные ключи
//- значения могут повторяться
//- ключом может быть null - не строка, а не валидное значение не понятно как работать
//- ускоренная обработка кода
//-  порядок добавления не запоминается
public class map {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>(); // или <Integer, String>
        db.putIfAbsent(1, "one");//сразу проверка нет ли уже такого ключа
        db.put(2, "two");// если есть такой ключ, то значение перезапишется
        db.put(null, "!null");
        System.out.println(db);//null=!null, 1=one, 2=two
        System.out.println(db.get(1));//one
        db.remove(null);
        System.out.println(db);//1=one, 2=two
        System.out.println(db.containsValue("one"));//true
        System.out.println(db.containsKey(1));//true
        System.out.println(db.keySet());//[1, 2]
        System.out.println(db.values());//[one, two]
    }
}

//функионал map

// put(K,V) - добавить пару или изменить значение, если ключ имеется
//putIfAbsent(K,V) - добавить, если ключ не найдет(такого еще нет)
//get(k) - получить значение по указанному ключу
// remove(k) - удаляет пару по ключу
//containsValue(v)  - проверка наличия значения
//containsKey(k) - проверка наличия ключа
//keySet() - возвращает множество ключей
//values() - возвращает набор значений
