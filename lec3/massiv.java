// массивы

package lec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Iterator;

// public class massiv {
//     public static void main(String[] args) {
//         int[] a = new int[] {1, 9};
//         int[] b = new int[3];
//         System.arraycopy(a, 0, b, 0, a.length);

//         for (int i : a) {System.out.printf("%d", i);} //1 9
//         System.out.println();
//         for (int j : b) {System.out.printf("%d", j);} //1 9 0
//     }
// }

// public class massiv {
//     public static int[] AddItem (int[] array, int item) {
//         int length = array.length;
//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }
//     public static void main(String[] args) {
//         int[] a = new int[] {0, 9};
//         for (int i : a) {
//             System.out.print(i); // 0 9
            
//         }System.out.println();
//         a = AddItem(a, 2);
//         a = AddItem(a, 3);
//         for ( int j : a) {
//             System.out.print(j); // 0 9 2 3
//         }
//     }
// }

// что происходит в этот момент добавления в массив с памятью
//  оперативная память
// [][ ][  ][][  ]||[  ][ ][][ ][ ]
// stack          ||    heap


// для Int 4 байта
// буква = 2 байта, в тип String неизвестно сколько
//в момент = new int[] идет выделение памяти (в куче, heap), и самую переменную тоже надо хранить - как индентификатор в stack

// List

// public class massiv {
//     public static void main(String[] args) {
//         List list = new ArrayList(); // или ArrayList = new ArrayList(); // явно не указали тип List, будет Object
//         list.add(2809); // в момент присоединения преобразовали в Object, при извлечении надо проверку на instanceof
//         list.add("1234"); // в Object можно добавить и строку
//         for (Object o : list) {
//             System.out.println(o); //2809
//         }
//     }
// }

// явно указываем тип данных List
// public class massiv {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<Integer>(); 
//         list.add(2809); 
//         for (Object o : list) {
//             System.out.println(o); //2809
//         }
//     }
// }

//способы создания ArrayList

// public class massiv {

//     public static void main(String[] args) {
//         ArrayList<Integer> list1  = new ArrayList<Integer>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>(10);
//         ArrayList<Integer> list4 = new ArrayList<>(list3);
//     }
// }

// коллекции, функционал
// add(args) - добавляе элемент в список
//get(pos) - возвращает элемент из списка
//indexOf(item) - первое вхождение или -1
//lastIndexOf(item) - последнее вхождение или -1
//remove(pos) - удаление элемента на указанной позиции и его возвращение
//set(int pos, T item) - помещает значение item элементу, который находится на позиции pos
//void sort(Comparartor) - сортирует набор данных по правилу
//subList(int start, int end) - получение набора данных от позиции start до end

// public class massiv {

//     public static void main(String[] args) {
//         int day = 25;
//         int month = 12;
//         int year = 1985;
//         Integer[]date = {day, month, year};
//         List<Integer> d = Arrays.asList(date);
//         System.out.println(d);
//     } 
// }


// public class massiv {
//     public static void main(String[] args) {
//         StringBuilder day = new StringBuilder("25");
//         StringBuilder month = new StringBuilder("12");
//         StringBuilder year = new StringBuilder("1985");
//         StringBuilder[] date = new StringBuilder[]{day, month, year};
//         List<StringBuilder> d = Arrays.asList(date);
//         System.out.println(d); //25 12 1985
//         date[1] = new StringBuilder("09");
//         System.out.println(d); //25 09 1985 , поменяли в date но изменится и d
//     }
// }

// колекции функционад
//clear() - очистка списка
//toString() - конертация списка в строку
//Arrays.asList - преобразует массив в список
//containsAll(col) - проверяет включение всех эл-ов из col
//removeAll(col) - удаляет эл-ты в col
//retainAll(col) - оставялет элементы, имеющиеся в col
//toArray() - конвериация списка в массвив Objectов
//toArray(type array) - конвериация списка в массвив type
//List.copyOf(col) - возвращает копию списка на основе имеющегося
//List.of(item1, item2,...) - возвращает неизменяемый список

// public class massiv {
//     public static void main(String[] args) {
//         Character value = null;
//         List<Character> list1 = new ArrayList<Character>();
//         list1.add('S');
//         list1.add('e');
//         list1.add('r');
//         System.out.println(list1); // Ser
//         list1.remove(1);
//         System.out.println(list1);//Sr
//         List<Character> list2 = List.copyOf(list1);
//         System.out.println(list2);// Sr
//     }
// }

//итератор

public class massiv {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,12,123,1234,12345); 
        //если создаем через List.of то удалить не получится из list
        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();
        while (col.hasNext()) {
            System.out.println(col.next()); //на итераторе не надо изменять и удалять элементы
        }
    }
}
//функционал итератора
//hasNext() - пока есть след элемент
//next() - выводить следующий
//remove() - удалить (вроде не надо исполь)
//ListIterator<E> - гонять итератор вперед и назад
//hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)