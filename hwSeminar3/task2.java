//2. Дан произваольный список целых чисел, удалить из него четные числа.

package hwSeminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,4,6,7,4,10));
        System.out.println(arr);
        Iterator<Integer> col1 = arr.iterator();
        while (col1.hasNext()) {     
            Integer nextInt = col1.next();
            if (nextInt % 2 == 0) {
                col1.remove();
            }   
        }System.out.println(arr);
    }
}
