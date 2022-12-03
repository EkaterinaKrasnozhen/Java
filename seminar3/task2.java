// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package seminar3;

import java.util.ArrayList;
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
        System.out.println(arr);
        System.out.println(s1);
    }
}
