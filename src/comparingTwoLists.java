//Сравнение двух списков: Напишите метод, который сравнивает два списка на равенство.

import java.util.ArrayList;
import java.util.List;

public class comparingTwoLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println(list2);

        compare(list1, list2);
    }

    public static void compare(List<String> list1, List<String> list2) {
        if (list1.equals(list2)) {
            System.out.println("Списки равны");
        } else {
            System.out.println("Списки не равны");
        }
    }
}