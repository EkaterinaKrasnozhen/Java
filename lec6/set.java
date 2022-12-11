package lec6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// public class set {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();
//         set.add(1);
//         set.add(12);
//         set.add(123);
//         set.add(125);
//         set.add(1236);
//         System.out.println(set.contains(12)); //true
//         set.add(null);
//         System.out.println(set);//[null, 1, 1236, 123, 12, 125]
//         System.out.println(set.size());//6
//         set.remove(12);
//         System.out.println(set);//[null, 1, 1236, 123, 125]
//         set.clear();
//         System.out.println(set);//[]
//     }
// }
//isEmpty() - проверка на пустоту
// add(v) - добавить в коллекцию
//remove(v) - удаление
//contains(v) -  проверка на включение элемента в коллекицю
//clear() - удаление всех эл-ов из списка
//size() - возвращает кол-во эл-ов колеекции

//множества
//addAll(Coll) - объединение множества
//retainAll(Coll) - пересечение множеств
//removeAll(Coll) - разность множеств
//first() начинается
//last() заканчивается
//headSet(E) больше чем
//tailSet(E) меньше чем
//subSet(E1, E2) - 

public class set {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,10));
        var b = new HashSet<>(Arrays.asList(2,6,4,11));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a);//[1, 2, 3, 4, 5, 6, 7, 10]
        System.out.println(b);//[2, 4, 6, 11]
        System.out.println(u);//[1, 2, 3, 4, 5, 6, 7, 10, 11]
        System.out.println(r);//[2, 4, 6]
        System.out.println(s);//[1, 3, 5, 7, 10]
        boolean res = a.addAll(b);
        System.out.println(res);//true
    }
}

//TreeSet - упорядочивает (с чилами понятно, строки+-, котики- сами задаем), LinkedHashSet - помнит порядок добавления