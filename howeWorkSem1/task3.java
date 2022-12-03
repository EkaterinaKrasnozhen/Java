//3. Реализовать простой калькулятор

package howeWorkSem1;

import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class task3 { 

    

    public static void main(String[] args) throws IOException {

        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число а: ");
        double a = iScanner.nextDouble();
        LogFile(a);
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
    
    public static void LogFile(Object f) {
        try (FileWriter fw = new FileWriter("logCalc.txt", true)) { 
            fw.write(f.toString());
        }catch (IOException e) {
            //System.out.println(ex.getMessage());
        }
    }

}

