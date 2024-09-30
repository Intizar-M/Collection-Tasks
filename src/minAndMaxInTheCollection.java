//Min и Max в коллекции: Найдите минимальный и максимальный элементы в коллекции.

import java.util.ArrayList;
import java.util.List;

public class minAndMaxInTheCollection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(136);
        list1.add(21);
        list1.add(30);
        list1.add(1);

        minMax(list1);
    }

    public static void minMax(List<Integer> list1) {
        int min = list1.get(0);
        int max = list1.get(1);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) < min) {
                min = list1.get(i);
            }
            if (list1.get(i) > max) {
                max = list1.get(i);
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}