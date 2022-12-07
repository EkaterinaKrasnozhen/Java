import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "one");
        tMap.put(2, "two");
        tMap.put(8, "eight");
        tMap.put(6, "six");
        System.out.println(tMap);//{1=one, 2=two, 6=six, 8=eight} по возрастанию добавил
        tMap.put(2, "two"); System.out.println(tMap.descendingKeySet());//[8, 6, 2, 1]
        tMap.put(2, "two"); System.out.println(tMap.descendingMap());//{8=eight, 6=six, 2=two, 1=one}
    }
}


//TreeMap деревья
//get(k) - получить значение
//tailMap() - показать значение больше, чем
//headMap() - меньше, чем
//put(k,v) - добавить пару
//remove(k) - удаоить пару
//descendingKeySet(v) - получить исключительно сами ключи
//descendingMap() - в обратном порядке
//lastEntry() - 
//firstEntry() -

// сбалансированное бинарное дерево - не больще 2 связей, те эл-ты что слева - меньше корневого элемента(5), справа  - больше

//             5
//    3   1         7    8
// 0  2  1  2    6   5  ...