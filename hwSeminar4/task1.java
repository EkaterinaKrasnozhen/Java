package hwSeminar4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

//1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 67));
        System.out.println(ll);
        Stack<Integer> st = new Stack<>();
        for (int t : ll) {      
            st.push(t);
        }
        for (int i = 0; i < ll.size(); i++) {
            System.out.printf("%d, ", st.pop());
        }
    }
}
