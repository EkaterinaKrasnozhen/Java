package seminar4;
// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();
        while (true) {
            System.out.printf("Введите значение: ");
            String s = iScanner.nextLine();
            if (s.equals("")) { // выход из программы
                System.out.println("пока");
                break;
            }
            //String [] get_user = s.split("~");
            if (s.equals("print")) {
                String first = ll.getFirst(); //нашли первый 
                String last = ll.getLast();//нашли последний
                ll.remove(first); //удалили первый
                ll.remove(last);// удалили последний
                ll.addFirst(last); // добавили в начало последний
                ll.addLast(first);// добавили в конец первый
                System.out.println(ll);
            }
            if (s.equals("revert")) { 
                String last1 = ll.getLast();//нашли последний элемент
                ll.remove(last1);//удалили последний
                String preLast = ll.getLast();//предпоследний (сейчасс последний)
                ll.remove(preLast);//удалили предпоследний
                ll.addLast(last1);//вернули изначальный последний
                System.out.println(ll);
            }
            else {
                ll.add(s);// добавляем строку в список LList
                System.out.println(ll); 
            }   
        }
        iScanner.close();
    }
}
