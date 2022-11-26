// Задание №4
// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

package hwSeminar1;

public class task4 {
//находим самое короткое слово из массива
    public static Integer minWordLength(String [] args) {
        int minIndex = 0;
        int minItem = args[0].length();
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() < minItem) {
                minIndex = i;    
            }                            
        }return minIndex;
    }

// находим самый длинный префикс в массиве 
    public static String prefix(String [] args, int num) {
        
        int j = 1;
        String res = "Самый длинный общий префикс: ";
        
        for (int i = 0; i < args[i].length()-1; i++) {
            if (args[j].charAt(i) != args[i].charAt(i)) {
                res = "Общего префикса нет";
                break;
                }

            else if (args[num].charAt(i) == args[i].charAt(i))
                res+=args[num].charAt(i);
                                  
        }return res;
    }
    public static void main(String[] args) {
        String s [] = {"fly", "flyght", "fl", "flying", "flyyy"};
        String s2 [] = {"hi", "by", "now", "show"};
        int num = minWordLength(s);
        System.out.println(num);
        String res = prefix(s,num);
        System.out.print(res);                                    
    }
}
