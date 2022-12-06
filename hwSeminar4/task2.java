package hwSeminar4;

import java.util.Queue;


public class task2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        int item = q.remove();
        q.offer(2809);//2809
        System.out.println(q);
        item = q.poll();//[]
        System.out.println(q);
    }
}
