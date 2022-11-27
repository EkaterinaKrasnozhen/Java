//2. Вывести все простые числа от 1 до 1000

package howeWorkSem1;

public class task2 {
    public static void main(String[] args) {
        boolean status;
        int num = 1000;
        for (int i = 2; i < num+1; i++) {
        status = true;
            for (int j = 2; j <= i/j; j++) {
                if ((i%j) == 0)
                status = false;
            }
            if (status == true)
                System.out.printf("%d, ", i);    
        }
    }    
}
