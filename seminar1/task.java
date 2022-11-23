// Задание №1
// Написать программу, которая запросит пользователя ввести <имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, имя>!”
// Задание №1+
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <имя>!", если время от 05:00 до 11:59
// "Добрый день, <имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <имя>!", если время от 23:00 до 4:59


package seminar1;
import java.util.Scanner;
import java.time.LocalTime;
public class task {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Напишите свое имя: ");
        String name = iScanner.nextLine();
        int temp = LocalTime.now().getHour();
        if (5 <= temp && temp < 12)
            System.out.printf("Доброе утро, %s", name);                
        else if (12 < temp && temp < 18)
            System.out.printf("Добрый день, %s", name);
        else if (18 < temp && temp < 23)
            System.out.printf("Добрый вечер, %s", name);
        else if (23 < temp && temp < 24 || temp < 5)
            System.out.printf("Добрый вечер, %s", name);
        iScanner.close();
    }    
}
    

