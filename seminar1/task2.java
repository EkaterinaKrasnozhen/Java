// Задание №2

// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
package seminar1;
public class task2 {
    public static void main(String[] args) {
        int [] arr = new int[] {1,1,0,1,1,1,0,1,1,1,1,1};
        int count = 0;
        int max = 0;
        for (int index = 0; index < arr.length; index++){ 
            if (arr[arr.length-1-index] == 1) { 
                count++;
            }
            else { 
                count=0;
            }
            if (count  > max ) {
                max = count;
        }}System.out.println(max);                                
    }
}

