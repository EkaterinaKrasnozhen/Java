// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>(13);
        String [] s = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        for (int index = 0; index < 13; index++) {
            Random rnd = new Random();
            int j = rnd.nextInt(0, 9);
            l.add(s[j]);
        }
        System.out.println(l);
        System.out.println();
        
        List<Integer> arr = new ArrayList<Integer>(14);
        List<String> s1 = new ArrayList<String>(14);
        int count = 0;
        for (int index = 0; index < s.length; index++) {
            for (String str : l) {
                if (str == s[index]) {
                    count ++;         
                }
            }
            arr.add(count);
            count = 0;
            s1.add(s[index]);
        }

        Iterator<String> col1 = s1.iterator();
        Iterator<Integer> col2 = arr.iterator();
        System.out.println();
        while (col1.hasNext()) {
            System.out.printf("Планета %s = %d раз, ",col1.next(), col2.next());  
        }    
    }
}
