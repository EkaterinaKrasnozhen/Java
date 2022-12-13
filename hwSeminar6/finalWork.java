package hwSeminar6;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class finalWork {
    public static void main(String[] args) {
        noteBooks nb1 = new noteBooks(1, "Apple", "MacBook Pro 16", "ios", "silver", 16, 512, 120000);
        noteBooks nb2 = new noteBooks(2, "Acer", "Aspire a515", "windows", "black", 8, 512, 98000);
        noteBooks nb3 = new noteBooks(3, "Asus", "X415Ea", "linux", "red", 8, 256, 40000); 
        noteBooks nb4 = new noteBooks(4, "HP", "15s-eq2136ur", "windows", "silver", 8, 256, 77000);
        noteBooks nb5 = new noteBooks(5, "Lenovo", "IdeaPad", "windows", "black", 16, 256, 80000);
        noteBooks nb6 = new noteBooks(6, "Huawei", "Mattebook d15", "ios", "silver", 8, 256, 45000);
        noteBooks[] nbs = new noteBooks[]{nb1, nb2, nb3, nb4, nb5, nb6};
        
        Map <Integer, String> dbFirm = new HashMap<>();
        Map <String, Integer> dbColor = new LinkedHashMap<>();
        Map <Integer, Integer> dbRam = new HashMap<>();
        Map <String, Integer> testOs = new LinkedHashMap<>();
        int count = 1;
        int count1 = 1;
        int count2 = 1;
        for  (noteBooks n : nbs){
            dbFirm.put(n.id, n.firm);            
            dbColor.putIfAbsent(n.color, count1++);
            dbRam.putIfAbsent(n.ram, count2++);
            testOs.putIfAbsent(n.os, count++);
        }  
        getValueFromUser(dbFirm, testOs, dbColor, dbRam, nbs);
    }


    public static void getValueFromUser(Map <Integer, String> firm, Map <String, Integer> os, Map <String, Integer> c, Map <Integer, Integer> ram,  noteBooks[] nb) {
        Scanner iScanner = new Scanner(System.in);  
        while (true) {
            System.out.printf("Критерии фильтрации ноутбуков: \n 1 - Фирма\n 2 - ОС\n 3 - цвет\n 4 - RAM\n 5 - цена\n ");
            String get_user = iScanner.nextLine();
            if (get_user.equals("1")) {
                noteBooks.getFirm(firm, nb);
            }
            else if (get_user.equals("2")){
                noteBooks.getOs(os, nb);  
            }
            else if (get_user.equals("3")) {
                noteBooks.getCol(c, nb);
            }
            else if(get_user.equals("4")) {
                noteBooks.getRam(ram, nb);
            }
            else if(get_user.equals("5")) {
                noteBooks.getPrice(nb);
            }
            else if (get_user.equals("0")){
                System.out.printf("buy");
            }
            iScanner.close(); //тут работает, но тогда не возобновляется снова цикл запроса у пользователя
        }
        //iScanner.close(); //не работает тут    
    }         
}
