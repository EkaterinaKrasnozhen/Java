// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package seminar3;

import java.util.ArrayList;
import java.util.Iterator;

public class task3 {

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();
        s.add("null");
        s.add("1");
        s.add("3");
        s.add("qwe");
        String [] s1 = new String[s.size()];
        StringBuilder sb = new StringBuilder();
        s.toArray(s1);
        int [] res = Numeric(s1);
        for (int w : res) {
            System.out.println(w);
        }
        

        Iterator<String> col1 = s.iterator();
        while (col1.hasNext()) {
            
           
            
        }
    }
    public static int [] Numeric(String [] s2) {
        int [] n = new int[s2.length];
        try {
 
            
            
        } catch (NumberFormatException e) {
            //
        }
        return n;
    }
}
