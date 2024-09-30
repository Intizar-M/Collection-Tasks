//Нахождение пересечений в двух списках: Напишите метод для нахождения общих элементов в двух списках.


import java.util.ArrayList;
import java.util.List;

public class findingIntersectionsInTwoLists {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Ivan");
        list1.add("Igor");
        list1.add("Sveta");
        list1.add("Lena");
        System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Ivan");
        list2.add("Sveta");
        list2.add("Elena");
        list2.add("Vika");
        System.out.println(list2);

        intersection(list1, list2);
    }

    public static void intersection(List<String> list1, List<String> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if(list1.get(i).equals(list2.get(j))) {
                    System.out.println(list1.get(i));
                }
            }
        }
    }
}