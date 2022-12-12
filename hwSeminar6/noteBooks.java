package hwSeminar6;
// Добавить атрибуты класса с соответствующими типами.
// Например,
// - идентификатор
// - производитель
// - название модели
// - RAM
// - объем HD
// - операционная система
// - и т.д.
// Добавить конструктор класса.
// Добавить необходимые методы класса.
// Создать множество ноутбуков (множество объектов класса ноутбук).
// 3-10 штук
// Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию.
// Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - RAM
// 2 - Объем HD
// 3 - Операционная система
// 4 - Цвет …
// Для критериев объем и память необходимо запросить дополнительно диапазон.
// Например,
// "Введите минимальное значение"
// "Введите максимальное значение"
// Отфильтровать ноутбуки и вывести проходящие по критерию.
// Пример вывода:
// Ноутбуки с объем HD от 256 до 512
// 1 HP EliteBook...
// 2..
// 3...
// Пример вывода:
// Ноутбуки с цвет Серебристый
// 1 Honor ...
// 2..
// 3...


public class noteBooks {
    String firm, model, os, color;
    int ram, hd, price;

    public noteBooks(String firm, String model, String os, String color, int ram, int hd, int price) {   
        this.firm = firm;
        this.model = model;
        this.os = os;
        this.color = color;
        this.ram = ram;
        this.hd = hd;
        this.price = price; 
    }


    public static StringBuilder getByFirm(noteBooks [] nbooks, String name) {
        StringBuilder res = new StringBuilder();
        for (noteBooks b : nbooks) {
            if (b.firm == name) {
                res.append(b.model + "\n" + b.os + "\n" + b.color + "\n" + b.hd + "\n" + b.price);
            }
        }
        return res;
    }
}
