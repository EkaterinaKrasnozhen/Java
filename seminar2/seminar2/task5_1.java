// Задание 5.
// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.

package seminar2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task5_1 {
    public static void main(String[] args) {
        String pathFile = "C:\\Users\\медведь\\Desktop\\Обучение Python\\Java\\seminar2\\task5_1_1.txt";
        String line = "empty";
        try {
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                System.out.println("file.existed");
                line = bufReader.readLine();
                bufReader.close();
            }
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
            System.out.println(line);
        }

        File dir = new File(".");

        File [] fileList = dir.listFiles();
        List<String> l = new ArrayList<>();
        for (File file : fileList) {
            if (file.isFile()) {
                System.out.printf("%s\n", file.getName());
            }
            else {
                System.out.println(file.getName());
            }
            try (FileWriter fw = new FileWriter("fileJava.txt", false)) { 
                for (File file1 : fileList) {
                   fw.write(file1.toString());
                   fw.write("\n");
                }
            }catch (IOException e) { // могут возникать ошибки и посмотреть их
                //System.out.println(ex.getMessage());
            }
        }
    }
}
