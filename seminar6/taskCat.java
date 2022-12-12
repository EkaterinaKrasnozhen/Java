package seminar6;
// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
public class taskCat {
    public static void main(String[] args) {
        Cats cat1 = new Cats(1, "Вася","брит", "серый", 3, true, 5);
        Cats cat2 = new Cats(1, "Guy","двор", "черный", 5, true, 4);
        Cats cat3 = new Cats(1, "Ася","голубая", "темно серый", 1, false, 3);
        //System.out.println(cat1.toString());
        //System.out.println(cat1.toString2(1));
        Cats[] cats = new Cats[]{cat1,cat2, cat3};
        System.out.println(Cats.getCatGender(cats, true)); 
    }
}
