//Перемешивание списка: Напишите метод для перемешивания элементов в ArrayList.

import java.util.ArrayList;
import java.util.List;

public class shufflingTheList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ivan");
        list1.add("Lena");
        list1.add("Vika");
        list1.add("Veronika");
        list1.add("Igor");
        list1.add("Misha");
        System.out.println(list1);

        shuffleAgain(list1);
        System.out.println(list1);
    }

    public static void shuffleAgain(List<String> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            String element = list.get(index);
            list.set(index, list.get(i));
            list.set(i, element);
        }
    }
}