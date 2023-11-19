import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // Задача 1: Використання ListIterator
        List<Integer> numbersList1 = new ArrayList<>();
        numbersList1.add(1);
        numbersList1.add(2);
        numbersList1.add(3);
        numbersList1.add(4);

        ListIterator<Integer> listIterator1 = numbersList1.listIterator();
        while (listIterator1.hasNext()) {
            int current = listIterator1.next();
            listIterator1.set(current + 1);
        }

        System.out.println("Задача 1: Значення списку збільшені на 1: " + numbersList1);

        // Задача 2: Використання Iterator
        List<Integer> numbersList2 = new ArrayList<>();
        numbersList2.add(5);
        numbersList2.add(6);
        numbersList2.add(7);
        numbersList2.add(8);

        Iterator<Integer> iterator = numbersList2.iterator();
        while (iterator.hasNext()) {
            int current = iterator.next();
            iterator.remove(); // Видаляємо поточний елемент
            numbersList2.add(current + 1); // Збільшуємо значення та додаємо назад в список
        }

        System.out.println("Задача 2: Значення списку збільшені на 1: " + numbersList2);
    }
}