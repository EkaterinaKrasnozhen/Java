// Задание №3
// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

package hwSeminar1;

public class task3 {
    public static void main(String[] args) {
        int [] nums = {3,2,2,3,2,3,2};
        int val = 3;
        int temp = 0;
        int index = 0;
        for (int i = 0; i < nums.length/2; i++) {
            if (nums[nums.length-1-i] != val){
                temp = nums[nums.length-1-i];
                nums[nums.length-1-i] = val;
                nums[index] = temp;
                index++;
            }           
        }     
        for (int j = 0; j < nums.length; j++) {
                System.out.println(nums[j]);
        }   
    }                
}

