package seminar4;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
public class task4 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>(10);
        for (int index = 0; index < 10; index++) { //рандом
            Random rnd = new Random();
            int j = rnd.nextInt(0, 100);
            l.add(j);
        }
        System.out.println(l);
        Stack<Integer> st = new Stack<>();
        for (int t : l) {      
            st.push(t); // в стек запоминаем
        }System.out.println(st); //просто печатаем, не вынимаем элементы, поэтому печатаем как обычно с первого
        for (int i = 0; i < l.size(); i++) {
            System.out.printf("%d, ", st.pop()); //стек берет вначале последний
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int t : l) {      
            pq.add(t); //добавляет беспорядочно
        }  
        System.out.println();
        System.out.println(pq);
    }
    
}
