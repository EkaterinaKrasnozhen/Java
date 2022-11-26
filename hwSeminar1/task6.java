// Задание №6 (доп)
// Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

package hwSeminar1;

public class task6 {
    
    public static Double mult(int number, int degree) {
        int count = 1;
        double res = number;
        if (degree > 0){
            while(count<degree) {
                res = res*number;
                count++;
            }         
        }
        else if (degree == 0)
            res = 1;
        
        else if (degree<0){
            while(count < (degree*-1)){
                res = res*number;
                count++;
            }
            res = 1/res;  
        }
        return res;        
    }
    public static void main(String[] args) {
        int a = 2;
        int b = -2;
        double res = mult(a,b);

        System.out.println(res);
    }
}
