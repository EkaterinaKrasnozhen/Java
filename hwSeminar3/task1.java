package hwSeminar3;

//1. Алгоритм сортировки слиянием

public class task1 {
    public static void main(String[] args) {
        int [] arr = new int []{1,3};
        int [] arr1 = new int []{5,7,8};
        int [] res = new int [arr.length+arr1.length];
        System.arraycopy(arr, 0, res, 0, arr.length);
        System.arraycopy(arr1, 0, res, arr.length, arr1.length);
        for (int element : res) {
            System.out.print(element);
        }
        System.out.println();
        int temp = 0;
        for (int index = 0; index < res.length-1; index++) {
            if (index % 2 == 0) {
                temp = res[index];
                res[index] = res[index+1];
                res[index+1] = temp;
            }
        }for (int el : res) {
            System.out.print(el);
        }   
    }
}
