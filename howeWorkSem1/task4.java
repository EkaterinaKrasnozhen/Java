// 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

package howeWorkSem1;

public class task4 {
    public static void main(String[] args) {
        String [] s = "2? + ?5 = 69".replace("?", "0").split(" ");
        int n1 = Integer.parseInt(s[0]);
        int n2 = Integer.parseInt(s[2]);
        int sum = Integer.parseInt(s[4]);
        int res = sum - (n1+n2);
        int res1 = res%10;
        int res2 = res-res1;
        //System.out.printf("%d, %d, %d", res, res1, res2);
        if ((n1+res1)+ (n2+res2) != sum)
            System.out.printf("Решения нет");
        else
            System.out.printf("%d + %d = %d", n1+res1, n2+res2, sum);
    }
}
