//Объединение двух списков: Напишите метод, который объединяет два списка (ArrayList) в один.

import java.util.ArrayList;

public class combiningTwoArrays {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        list2.add("F");
        System.out.println(list2);


        System.out.println(mergeLists(list1, list2));
    }

    public static ArrayList<String> mergeLists (ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> mergedList = new ArrayList<>();

        // Добавление элементов из первого списка
        for (String element : list1) {
            mergedList.add(element);
        }

        // Добавление элементов из второго списка
        for (String element : list2) {
            mergedList.add(element);
        }

        return mergedList;
    }
}