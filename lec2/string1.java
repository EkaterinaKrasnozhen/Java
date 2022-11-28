// сТРОКИ
// package lec2;

// public class string {
//     public static void main(String[] args) {
//         var s  = System.currentTimeMillis(); //измерить время, за которое сработает программа
//         StringBuilder sb = new StringBuilder();
//         for (int index = 0; index < 100; index++) {
//             sb.append("+");
//         }
//     System.out.println(s);
//     System.out.println(sb);
//     }
// }

// concat() объединение строк
// valueOf() преобразует Object в строковое представление (завязан на toString())
// join() объединяет набор строк в одну с учетом разделителя
// chartArt() получение символа по индексу
// indexOf() первый индекс вхождения подстроки
// startsWith()/endsWith() определяет, начинается / заканчивается ли строка с подстроки
// replace() замена одной подстроки на другую

//trim() удаляет начальные и конечные пробелы
// substring() возвращает подстроу, см. аргументы
// toLowerCase()/toUpperCase() возвращает новую строку в нижнем/верхнем регистре
// compareTo() сравнивает две строки
// equals() сравнивает строки с учетом регистра
// equalsIgnoreCase() сравнивает строки без учета регистра
// regionMatches() сравнивает подстроки в строках


//String(медленнее, если разбираем готовый материал) StringBuilder (быстрее, если компаниуем и собираем)
// package lec2;

// public class string {
//     public static void main(String[] args) {
//         String[] name = {"С", "е", "р", "г", "е", "й"};
//         String sk = "СЕРГЕЙ КА.";
//         System.out.println(sk.toLowerCase());// сергей ка.
//         System.out.println(String.join("", name)); //Сергей
//         System.out.println(String.join("", "С", "е", "р", "г", "е", "й"));//Сергей
//         System.out.println(String.join(",", "С", "е", "р", "г", "е", "й"));//С,е,р,г,е,й
//     }
// }

// файловая система

// package lec2;
// import java.io.File;
// public class string {
//     public static void main(String[] args) {
//         File f1 = new File("file1.txt");
//         //File f2 = new File("/C/Users...")
//         String pathProject = System.getProperty("user.dir");//на разных платформах Wind,Linux - 
//         //разный путь, читать документацию и тд
//         String pathFile = pathProject.concat("/file1.txt");
//         File f3 = new File(pathFile);
//         System.out.println(f3.getAbsolutePath());
//     }
// }

//ошибки при работе с файлами

// package lec2;
// import java.io.File;
// public class string {
//     public static void main(String[] args) {
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file1.txt");
//             File f3  = new File(pathFile);
//             System.out.println("try");
//             File file = new File(pathFile);
//             if (file.createNewFile()) {//если возвращает истину
//                 System.out.println("file created");
//             }
//             else {
//                 System.out.println("file.existed");
//             }
//         } catch (Exception e) {
//             System.out.println("catch");
//         }
//         finally
//         {System.out.println("finally"); } // в любом случае напечатается
//     }
// }

// работа с файлами

// package lec2;
// import java.io.File;
// public class string {

//     public static void main(String[] args) {
//         String pathProject = System.getProperty("user.dir");
//         String pathDir = pathProject.concat("/file1.txt");
//         File dir  =  new File(pathDir);
//         System.out.println(dir.getAbsolutePath());
//         if (dir.mkdir()) {
//             System.out.println("+");
//         }
//         else {
//             System.out.println("-");
//         }
//         for (String fname : dir.list()) {
//             System.out.println(fname);
//         }
//     }
// }

// работа с файловой системой
// isHidden() возвращает истину , если каталог или файл скрытый
// length() размер файла в байтах
// lastModofied() возвращает время последнего изменения файла или каталога
// list() возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles() возвращает массив файлов и подкаталогов, которые находятся в определнном каталоге
// mkdir() создает новый каталог
// renameTo(File dest) переименовывает файл или каталог


// бинарные файлы

// package lec2;

// import java.io.IOException;
// import java.nio.ByteOrder;
// import java.nio.charset.Charset;
// import java.nio.charset.StandardCharsets;
// import java.util.HashMap;
// import java.util.Map;

// public class string { // не законченный код, для примера

//     static ByteOrder bOrder = ByteOrder.LITTLE_ENDIAN;
//     static Map<String, String> data = new HashMap<>();
//     static Charset charset = StandardCharsets.UTF_8;
//     static void loadFile(String path) throws IOException {}
//     public static void main(String[] args) {
        
//     }
// }

// логирование

package lec2;

import java.io.IOException;

import java.lang.System.Logger.Level;
import java.util.logging.*;


public class string1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(string1.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml"); // можем сделать txt
        logger.addHandler(fh);// меня fh / ch

        XMLFormatter xml = new XMLFormatter(); //меняем формат вывода на xml файл
        fh.setFormatter(xml);
        //SimpleFormatter sFormat = new SimpleFormatter(); // txt файл
        //ch.setFormatter(sFormat);

        logger.log(java.util.logging.Level.WARNING, "Тест1");
        logger.info("Тест 2");

    }
}
