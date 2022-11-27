//1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package howeWorkSem1;

public class task1 {

    public static void sumN(int num) {
        int i = 1;
        int res = 0;
        while (i < num+1) {
            res+=i;
            i++;
        }
    System.out.printf("Сумма чисел от 1 до %d = %d", num, res);
    }

    public static void multN(int num) {
        int i = 1;
        int res = 1;
        while (i < num+1) {
            res*=i;
            i++;
        }
    System.out.printf("Произведение чисел от 1 до %d = %d", num, res);
    }
    public static void main(String[] args) {
        sumN(5);
        System.out.println();
        multN(5);
    }
}
