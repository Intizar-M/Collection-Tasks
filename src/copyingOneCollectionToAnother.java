//Копирование одной коллекции в другую: Напишите метод для копирования всех элементов из одной коллекции в другую.

import java.util.ArrayList;

public class copyingOneCollectionToAnother {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("E");
        list2.add("F");
        list2.add("G");
        list2.add("H");
        System.out.println(list2);

        copy(list1, list2);
    }

    public static void copy(ArrayList<String> list1, ArrayList<String> list2) {
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }
        System.out.println(list2);
    }
}