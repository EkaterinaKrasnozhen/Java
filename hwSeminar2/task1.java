// 1.Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package hwSeminar2;

public class task1 {
    public static void main(String[] args) {

        String [] s = "name:Ivanov, country:Russia, city:Moscow, age:null".replace(",", ":").split(":");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM students WHERE ");
        sb.append(s[0] + " = " + s[1] + " and" + s[2] + " = " + s[3]);
        System.out.println(sb);        
    }   
}

