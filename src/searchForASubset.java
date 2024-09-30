//Поиск подмножества: Напишите метод, который проверяет, является ли один список подмножеством другого.

import java.util.ArrayList;
import java.util.List;

public class searchForASubset {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ivan");
        list1.add("Masha");
        list1.add("Arman");
        list1.add("Aruzhan");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Ivan");
        list2.add("Masha");
        list2.add("Arman");
        list2.add("Aruzhan");
        System.out.println(list2);

        containing(list1, list2);

    }

    public static void containing(List<String> list1, List<String> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    System.out.println(list1.get(i));
                }
            }
        }
    }
}