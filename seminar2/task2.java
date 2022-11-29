

// Задание 2.

// Напишите метод, который сжимает строку по правилу: 
// На входе: aaaabbbcdd
// На выходе: a4b3cd2
package seminar2;
public class task2 {
    public static void main(String[] args) {
        String s = "aaaabbbcddx";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        Character ch = s.charAt(0);

        for (int index = 1; index < s.length(); index++) {
            if (s.charAt(index) == ch) {
                count++;    
            } 
            else { 
                sb.append(count);
                sb.append(ch);
                ch = s.charAt(index);
                count = 1;    
            }
            if (index == s.length()-1) {
                sb.append(count);
                sb.append(ch);
            }
        }System.out.println(sb);
    }
}
