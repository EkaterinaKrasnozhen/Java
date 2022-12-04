package seminar4;
import java.util.ArrayList;
//1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        
        var s = System.currentTimeMillis();

        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            ar.add(i);
        }
        System.out.println(System.currentTimeMillis() - s);
        
        s = System.currentTimeMillis();
        LinkedList<Integer> ll = new LinkedList<>();
        for (int j = 0; j < 100000; j++) {
            ll.add(j);
        }
        System.out.println(System.currentTimeMillis() - s);    
    }
    
}
