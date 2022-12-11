// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент 
// уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
package seminar6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;


public class task1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>(10);//заполняем массив случайными эл-ми
        for (int index = 0; index < 1000; index++) {
            Random rnd = new Random();
            int j = rnd.nextInt(0, 24);
            l.add(j);
        }
        //System.out.println(l);
        //System.out.println();
        System.out.println(GetUnic(l));
    }
    public static Float GetUnic(List<Integer> list) {//метод для определения % уникальных чисел
        var a = new HashSet<>(list);// множество из массива
        var b = new HashSet<Integer>(a); b.addAll(a);//получаем множество уникальных чисел
        int num = list.size();//количество эл-ов в массиве
        int unic = b.size();// кол-во эл-ов в уникальном множестве
        float res = (unic * 100)/num;// рассчет по формуле % уникальных чисел
        return res;
    }
}
