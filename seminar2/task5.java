// Задание 5.
// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

package seminar2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class task5 {
    public static void main(String[] args) {
        File dir = new File("seminar2task5_1.txt");
        System.out.println(dir.getAbsolutePath());
        File[] filesList = dir.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
       // String pathFile = "C:\\Users\\медведь\\Desktop\\Обучение Python\\Java\\seminar2\\task5_1.txt";
        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/task5_1.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {//если возвращает истину
                System.out.println("file created");
            }
            else {
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                line = bufReader.readLine();
                bufReader.close();
            }
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
            {System.out.println(); } // в любом случае напечатается

        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/task5_1.txt");
        File dir  =  new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        }
        else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }
        

    }
}
