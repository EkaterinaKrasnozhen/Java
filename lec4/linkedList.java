package lec4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

// import java.util.LinkedList;
// //LinkedList
// public class linkedList {
//     public static void main(String[] args) {
//         LinkedList<Integer> ll = new LinkedList<>();
//         ll.add(1);
//         ll.add(2);
//         ll.add(3);
//     }
// }

//Queue - кто первый прищел тот и первый очереди, могут быть добавлена беспорядочно

//Priority Queue - гаивысший приоритет у наименьшего элемента

//  class linkedList {

//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//         pq.add(123);
//         pq.add(13);
//         pq.add(1);
//         System.out.println(pq); //1,13,123
//         System.out.println(pq.poll()); //1
//         System.out.println(pq.poll()); //13
//         System.out.println(pq.poll()); //123
//     }
// }

// public class linkedList {

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<Integer>();
//         q.add(1);
//         int item = q.remove();
//         q.offer(2809);//2809
//         System.out.println(q);
//         item = q.poll();//[]
//         System.out.println(q);

//         q.remove(2809);
//         System.out.println(q);
//         q.element();
//         q.peek();

//     }
// }

//Deque - добавлять и извлекать можно и в начало и в конец

// public class linkedList {

//     public static void main(String[] args) {
//         Deque<Integer> dq = new ArrayDeque<>();
//         dq.addFirst(1); dq.addLast(2);
//         System.out.println(dq); //1, 2
//         dq.removeLast(); 
//         System.out.println(dq);//1
//         dq.offerFirst(5); dq.offerLast(2);
//         System.out.println(dq);//5,1,2
//         dq.pollFirst(); dq.pollLast();
//         System.out.println(dq);//1
//         dq.getFirst(); dq.getLast();
//         System.out.println(dq);
//         dq.peekLast(); dq.peekFirst();
//         System.out.println(dq);
//     }
// }

// Stack (тот кто пришел первым, будет обработан в последнюю очередь) в постфиксной записи

//1+2*3 = 7
//123*+
//3  когда приходит знак действия, извлекаются верхние 2 эл-та: 3*2 -> 6 след знак 6+1=7
//2                                                                    1
//1
