// объектино-ориентированный подход
// java объектино-ориетированный язык - классы и тд
// Если разработка идет с ООП - говорит о том, что используются классы и экземпляры классов
// Каждый экземпляр класса определяется общим шаблоном, который называется классом
// В рамках класса задается общая стуктура, на основе котрой затем задаются экземпляры
// Данные относящиеся к классу - поля класса (как переменные в методах), а код для их обработки - метод класса
package lec6;

import java.util.Arrays;
import java.util.HashSet;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {// определяем поведение, вывод пишем toString
        return String.format("id: %d, fn: %s, ln: %s, s: %d", id, firstName, lastName, salary);        
    }

    @Override
    public boolean equals(Object o) {//по хорошему надо учитывать все поля
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) { //клиентский код
        Worker w1 = new Worker(); //экземпляр класса Worker
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();// для Java w1 и w4 не равны
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1 == w4);//false
        System.out.println(w1.equals(w4));//false, после переопределения механизма сравнения equals = true
        var workers = new HashSet<Worker>(Arrays.asList(w1,w2,w3));
        System.out.println(workers.contains(w4));//false, после переопределения механизма сравнения equals = true

        System.out.println(w1);
        System.out.println(w4);
        System.out.println(w3);
        System.out.println(w2);
    }
}
