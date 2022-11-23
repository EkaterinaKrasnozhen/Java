// public class program {

//     public static void main(String[] args) {
//         System.out.println("да");
//     }
// }


// class Program 
// {

//     public static void main(String[] args) {
//         short age = 10; // более мелкие int
//         int salary = 60000; // 4 байта занимает, 23_234_23 разделить разряды
//         System.out.println(age);
//         System.out.println(salary);
//     }
// }
// {
// public static void main(String[] args) {
//     float e = 2.7f;
//     double pi = 3.1415; // D необязательный суффикс для double
//     System.out.println(e);
//     System.out.println(pi);
// }
// }


// {
//     public static void main(String[] args) {
//         char ch = '1';
//         System.out.println(ch);
//         System.out.println(Character.isDigit(ch));
//         char c = 'a';
//         System.out.println(Character.isDigit(c));
//         String s = "qwe";
//         System.out.println(s.charAt(0)); // обращение к индексу строки
//     }
// }

// {
//     public static void main(String[] args) {
//         boolean fi = 123 <= 236;
//         System.out.println(fi);//true
//         boolean fi2 = 123 >= 235 || fi;
//         System.out.println(fi2); //true
//         boolean fi3 = fi ^ fi2; // дизъюнкция, возвращает true тогда и только тогда, когда только одно! из значений true
//         System.out.println(fi3); //false
//     }
// }


// {
//     public static void main(String[] args) {
//         String msg = "Hello, world!";
//         System.out.println(msg);
//     }
// }
// public class program 
// {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);
//         System.out.println(getType(a));
//         var d = 33.456;
//         System.out.println(d);
//         System.out.println(getType(d));
//     }
//     static String getType(Object o) {
//         return o.getClass().getSimpleName();
//     }
// }


// классы обертки (см функционал обертка.)
//  примитив        обертка
//   int            Integer
//  short           Short
//  long            Long
//  byte            Bite
//  float           Float
//  double          Double
//  char            Character
// boolean          Boolean

// инкремент ++ если ..println(a++) постфиксный инкремент - только в след принте сделает +1, 
//если (++a) префисный инкр, то в этом же принте сделает +1

// лог операции ||- конъюнкция, && - дизъюнкция, ^ - разд.дизъюнкция ,! - инверсия

// массивы
// public class program {
//     public static void main(String[] args) {
//         int [] arr = new int[10];
//         System.out.println(arr.length);

//         arr = new int[] {1, 2, 3, 4, 5};
//         System.out.println(arr.length);
//         System.out.println(arr[0]);    
//     }
// }

// многомерные массивы - столбцы+строки

// public class program {
//     public static void main(String[] args) {

//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d", item);
//             }
//             System.out.println();
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         int [][] arr = new int [3][5];
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d", arr[i][j]);
//             }
//             System.out.println();
//         }

//     }
// }

//получение данных с терминала, строки
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s", name); //если в конце % ставим "Привет, %s\n" и тогда не будет выводится %
//         iScanner.close();
//     }    
// }

// получение примитивов

// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }    
// }

// проверка на тип вводимых данных

// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }    
// }

// форматированный вывод

// public class program {
//     public static void main(String[] args) {
//         int a = 1,b = 2;
//         int c = a + b;
//         String res = a + "+" + b + "=" + c;
//         System.out.println(res);
//     }    
// }
//конкатинация String s = "abc", int a = 123, String z = s + a // abc123 , лучше так не делать, выйдет 4 строки

// Форматированный вывод

// public class program {
//     public static void main(String[] args) {
//         int a = 1,b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d\n", a, b, c);
//         System.out.printf("%d + %d = %d\n", a, b, c); // printf можем использовать маску для вывода
//         System.out.println(res);
//     }    
// }
// виды спецификаторов (для масок вывода)

// %d: целочисленные
// %x: 16-ти ричных чисел
// %f: с плавающей .,
// %e: в экспоненциальной форме 3.1415e+01
// %с: одиночный символ
// %s: строковые значения

// Вывод со знаком после .

// public class program {
//     public static void main(String[] args) {
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);
//         System.out.printf("%.2f\n", pi);
//         System.out.printf("%3f\n", pi);
//         System.out.printf("%e\n", pi);
//         System.out.printf("%.2e\n", pi);
//         System.out.printf("%3e\n", pi);
//     }
// }

// Функции и методы

// public class program {
//     static void sayHi() {
//         System.out.println("hi!"); 
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }
//     static double factor(int n) {
//         if (n == 1) return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi();// hi
//         System.out.println(sum(1, 3));//4
//         System.out.println(factor(5));//120        
//     }    
// }

// public class program {
//     public static void main(String[], args) {
//         sayHi();
//     }
//     static void sayHi() {
//         System.out.println("hi!");
//     } 
// }

// берем метод из отдельного файла
// public class program {
//     public static void main(String[] args) {
//         lib.sayHi();
//     }    
// }

// Управляющие конструкции: условный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if(a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);

//         if (a > b) c = a;
//         if (b > a) c = b;
//         System.out.printf("%d, %d", c, a);
//     }    
// }

// Тернарный оператор

// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }    
// }

// Оператор выбора

// public class program {
//     public static void main(String[] args) {
//         int month = 1;
//         String text = "";
//         switch (month) {
//             case 1:
//             //case 2:
//             //case 3:...
//                 text = "Autumn";
//                 break;

//             default:
//             text = "mistake";
//                 break;
//         }
//         System.out.println(text);        
//     }    
// }

// цикл while

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /=10;
//             count ++;    
//         }
//         System.out.println(count);
//     }    
// }

// do while

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /=10;
//             count ++; 
//         } while (value != 0); 
//         System.out.println(count);
//     }    
// }

// цикл for

// public class program {
//     public static void main(String[] args) {

//         for (int i = 0; i < 10; i++) {
//             if (i % 2 == 0) { //для одного оператора можно не ставить {}
//                 continue; // вернется в for ++ и продолжит
//                 //break вместо continue - остановит ближайший цикл
//             }System.out.println(i);
//         }
//     }   
// }

// цикл foreach

// public class program {
//     public static void main(String[] args) {

//         int[] arr = new int[] {1,2,3,4,5,66,67};
//         for (int item : arr) {
//             System.out.println(item);
//         }

//         for (int index = 0; index < arr.length; index++) {
//             arr[index] = 10;
//             }for (int item : arr) {
//                 System.out.println(item);
//         }        
//     }        
// }

// Работа с файлами

import java.io.*;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("fileJava.txt", false)) { // определили экземпляр fw, 
//             //связали файл с переменной fw, false или true - чтение, дозапись, уже имеющего или создать новый
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         }catch (IOException ex) { // могут возникать ошибки и посмотреть их
//             System.out.println(ex.getMessage());
//         }
//     }    
// }

// Чтение посимвольно

//import java.io.*;
// public class program {

//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("fileJava.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }   
//         }fr.close();
//     }
// }

// чтение построчно

public class program {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("fileJava.txt"));
        String str;
        while((str = br.readLine()) != null) {
            System.out.printf("%s\n", str);
        }
        br.close();
    }
}