// Задание 5.
// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

package seminar2;
import java.io.File;
public class task5 {
    public static void main(String[] args) {
        File dir = new File(".");
        File[] filesList = dir.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }

        // String pathProject = System.getProperty("user.dir");
        // String pathDir = pathProject.concat("/file1.txt");
        // File dir  =  new File(pathDir);
        // System.out.println(dir.getAbsolutePath());
        // if (dir.mkdir()) {
        //     System.out.println("+");
        // }
        // else {
        //     System.out.println("-");
        // }
        // for (String fname : dir.list()) {
        //     System.out.println(fname);
        // }
    }
}
