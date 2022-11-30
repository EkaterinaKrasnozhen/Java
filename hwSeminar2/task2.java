//2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package hwSeminar2;

import java.io.FileWriter;
import java.io.IOException;


public class task2 {
    
    public static int [] sorter() {
    int [] nums  = {3,9,5,7,6,8};
    int temp = 0;
    for (int i = 0; i < nums.length-1; i++) {
        int minPos = i;
        for (int j = i+1; j < nums.length; j++) {
            if (nums[j] > nums[minPos]) {
                minPos = j;
            }
            temp = nums[i];
            nums[i] = nums[minPos];
            nums[minPos] = temp;
            try (FileWriter fw = new FileWriter("logTask2.txt", false)) {// запись в файл 
                String s = Integer.toString(temp);
                fw.append(s);
                 
            }catch (IOException e) {
                //System.out.println(ex.getMessage());
            }
        }    
    }return nums;
    } 
    public static void main(String[] args)  {
        int [] res = sorter();       
        for (int num : res) {
            System.out.println(num);
        }
    }

    
}
