//Удаление элементов по условию: Напишите метод для удаления элементов из списка по определенному условию.

import java.util.ArrayList;
import java.util.List;

public class deletingItemsByCondition {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println(list1);

        deleteByCondition(list1, "A");
    }

    public static void deleteByCondition(List<String> list1, String condition) {
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(condition)) {
                list1.remove(i);
            }
        }
        System.out.println(list1);
    }
}