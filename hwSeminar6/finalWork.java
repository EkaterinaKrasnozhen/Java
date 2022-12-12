package hwSeminar6;
import java.util.Scanner;

public class finalWork {
    public static void main(String[] args) {
        noteBooks nb1 = new noteBooks("Apple", "MacBook Pro 16", "ios", "silver", 16, 512, 120000);
        noteBooks nb2 = new noteBooks("Acer", "Aspire a515", "windows", "black", 16, 512, 98000);
        noteBooks nb3 = new noteBooks("Lenovo", "IdeaPad", "windows", "black", 16, 256, 80000);
        noteBooks nb4 = new noteBooks("HP", "15s-eq2136ur", "Windows", "black", 8, 256, 77000);
        noteBooks nb5 = new noteBooks("Asus", "X415Ea", "linux", "silver", 8, 256, 40000);
        noteBooks nb6 = new noteBooks("Huawey", "Mattebook d15", "ios", "silver", 8, 256, 45000);
        noteBooks[] nbs = new noteBooks[]{nb1, nb2, nb3, nb4, nb5, nb6};
        System.out.println(noteBooks.getByFirm(nbs, "Huawey"));
    
    }

    // public static Integer getValueFromUser() {
    //     Scanner iScanner = new Scanner(System.in);
    //     while (true) {
    //         System.out.printf("Критерии фильтрации ноутбуков: 1 - Фирма\n 2 - ОС\n 3 - цвет\n 4 - RAM\n 5 - цена ");
    //         int get_user = iScanner.nextInt();

    //         if (get_user == 1) {
    //             String find = ll.get(Integer.parseInt(get_user[1]));//получаем по индексу [num] значение из ллист
    //             System.out.println(find);
    //             String find1 = ll.remove(Integer.parseInt(get_user[1]));// показываем что удаляем
    //             System.out.printf("удаляем %s\n", find1);
    //             System.out.printf("\n%s",ll);
    //         }
    //         else {
    //             ll.add(Integer.parseInt(get_user[1]), get_user[0]);// ставим в ллист строку на позицию num
    //             System.out.println(ll); 
    //         }   
    //     }
    //     iScanner.close();
    //}
}
