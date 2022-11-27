//3. Реализовать простой калькулятор

package howeWorkSem1;
import java.util.Scanner;
public class task3 {    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число а: ");
        double a = iScanner.nextDouble();
        System.out.printf("Введите необходимое действие: сложение +, вычитание -, умножение *, деление - ");
        Character s = iScanner.next().charAt(0);
        System.out.printf("Введите число b: ");
        double b = iScanner.nextDouble();
        iScanner.close();
        double res = 0;
        switch (s) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.printf("Такого оператора нет", s);
                break;
        }System.out.printf(a + "" + s + "" + b + " = " + res);    
    }
}

