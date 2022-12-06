package hwSeminar4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди, 
// - dequeue() - возвращает первый элемент из очереди и удаляет его, 
// - first() - возвращает первый элемент из очереди, не удаляя.


public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 67));//создали LList
        System.out.println(ll);
        Stack<Integer> st = new Stack<>();//создали и записали в Stack
        for (int t : ll) {      
            st.push(t);
        }
        for (int i = 0; i < ll.size(); i++) {
            System.out.printf("%d, ", st.pop());//вывели в обратном порядке
        }
        System.out.println();
        Enqueue(ll, 678);
        First(ll);
        Dequeue(ll);    
    }
    public static void Enqueue(LinkedList<Integer> llist, int elem) {//помещает элемент в конец очереди
        llist.addLast(elem);//Если просто add в LinkedList то тоже ведь пишет в конец?
        System.out.println(llist);
    }
    public static void Dequeue(LinkedList<Integer> llist) {//возвращает первый элемент из очереди и удаляет его
        int find = llist.removeFirst();
        System.out.printf("\nПервый элемент : %d, удаляю его\n", find);
        System.out.println(llist);
    }
    
    public static void First(LinkedList<Integer> llist) {//возвращает первый элемент из очереди, не удаляя.
        int first = llist.getFirst();
        System.out.printf("Первый элемент: %d", first);
    }
}
