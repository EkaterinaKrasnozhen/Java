import java.util.Scanner;

//Задание 1.
// Дано четное число N (>0) и символы c1 и c2. Написать метод, 
// который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

// Ответ: 
// с1 = а
// с2 = б
// абабабабаб (всего N символов)

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите символ 1: ");
        Character c1 = iScanner.next().charAt(0);
        System.out.printf("Введите символ 2: ");
        Character c2 = iScanner.next().charAt(0);
        System.out.printf("Введите четное число N: ");
        int n = iScanner.nextInt();
        iScanner.close();
        
        for (int index = 0; index < n/2; index++) {
            System.out.printf("%s%s", c1, c2);
        }
    }
}