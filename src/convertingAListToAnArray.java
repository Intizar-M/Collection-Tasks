//Преобразование списка в массив: Напишите метод для преобразования ArrayList в массив.

import java.util.ArrayList;
import java.util.List;

public class convertingAListToAnArray {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        String[] array = new String[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            array[i] = list1.get(i);
        }

        for (String element : array) {
            System.out.println(element);
        }
    }
}