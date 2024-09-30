//Частота встречаемости элементов: Напишите программу, которая подсчитывает частоту встречаемости каждого элемента в списке.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class frequencyOfOccurrenceOfElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("apple");

        Map<String, Integer> frequencyMap = calculateFrequency(list);
        System.out.println(list);
        System.out.println(frequencyMap);

    }

    public static <T> Map<T, Integer> calculateFrequency(List<T> list) {
        Map<T, Integer> frequencyMap = new HashMap<>();

        // Подсчет частоты встречаемости элементов
        for (T element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }
}
