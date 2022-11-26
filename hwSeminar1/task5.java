// Задание №5 (доп)
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

package hwSeminar1;

public class task5 {
    public static void main(String[] args) {
        String [] s = "Добро пожаловать на курс по Java".split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.printf("%s ", s[s.length-1-i]);
        }     
    }
}
