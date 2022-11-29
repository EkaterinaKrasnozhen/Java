package seminar2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
    }
}
