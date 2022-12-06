package seminar4;

import java.util.LinkedList;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();
        while (true) {
            System.out.printf("Введите через ~ название и номер: ");
            String s = iScanner.nextLine();
            if (s.equals("")) { // выход из программы
                System.out.println("пока");
                break;
            }
            String [] get_user = s.split("~");
            if (get_user[0].equals("print")) {// показываем и удаляем елемент на позиции num
                String find = ll.get(Integer.parseInt(get_user[1]));//получаем по индексу [num] значение из ллист
                System.out.println(find);
                String find1 = ll.remove(Integer.parseInt(get_user[1]));// показываем что удаляем
                System.out.printf("удаляем %s\n", find1);
                System.out.printf("\n%s",ll);
            }
            else {
                ll.add(Integer.parseInt(get_user[1]), get_user[0]);// ставим в ллист строку на позицию num
                System.out.println(ll); 
            }   
        }
        iScanner.close();
    }

    private static String [] Iscan() { //метод для считывания из сканнера
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите через ~ название и номер: ");
        String [] s = iScanner.nextLine().split("~");
        iScanner.close();
        return s;
    }
}
