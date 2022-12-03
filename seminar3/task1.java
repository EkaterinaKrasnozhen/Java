// 1. Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

package seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>(10);
        for (int index = 0; index < 10; index++) {
            Random rnd = new Random();
            int j = rnd.nextInt(0, 100);
            l.add(j);
        }
        System.out.println(l);
        System.out.println();
        l.sort(null);
        System.out.println(l);
    }
}
