//тип данных Object

package lec3;

// public class object {
//     public static void main(String[] args) {
//         Object o = 1; GetType(o); // java.lang.Integer
//         o = 1.2; GetType(o);
//     }
//     static void GetType(Object obj) {
//         System.out.println(obj.getClass().getName());
//     }
// }


public class object {
    public static void main(String[] args) {
        System.out.println(Sum(1,2));
        System.out.println(Sum(1.0,2));
        System.out.println(Sum(1,2.0));
        System.out.println(Sum(1.2,2.2));
    }
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object)((Double) a + (Double) b); // преобразовывать в Object не обязательно, можно return 1+2..
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object)((Integer) a + (Integer) b);
        } else return 0;
    }//можно сделать отдельный if на String и конкатинацию
}
