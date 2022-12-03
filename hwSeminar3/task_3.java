package hwSeminar3;

//3. Список целых чисел ArraList. Найти мин, макс и среднее значение.

import java.util.ArrayList;
import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,4,6,7,4,10));
        System.out.println(arr);
        int res = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        for (int e : arr) {        
            res+=e;
            if (max<e) {
                max = e;
            }
            else if (min > e) {
                min = e;
            }
        }
        int result = res/arr.size();
        System.out.printf("среднее значение %d, макс %d, мин %d", result, max, min);
    }
}
