//Удаление дубликатов из списка: Напишите метод для удаления всех дубликатов из заданного списка.

import java.util.ArrayList;

public class removingDuplicatesFromTheList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("A");
        list1.add("B");
        list1.add("E");
        System.out.println(list1);

        removeDuplicates(list1);
    }

    private static void removeDuplicates(ArrayList<String> list1) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = i + 1; j < list1.size(); j++) {
                if (list1.get(i).equals(list1.get(j))) {
                    list1.remove(j);
                }
            }
        }
        System.out.println(list1);
    }
}