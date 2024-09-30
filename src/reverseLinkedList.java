//Реверс LinkedList: Напишите функцию для реверса LinkedList в Java без использования встроенных методов.

import java.util.LinkedList;
import java.util.List;

public class reverseLinkedList {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Cherry");
        list1.add("Chennai");
        list1.add("Bullet");
        System.out.println(list1);
        list1 = reverseLinkedList(list1);
        System.out.print(list1);
    }

    public static LinkedList<String> reverseLinkedList(List<String> list2)
    {
        LinkedList<String> revLinkedList = new LinkedList<>();
        for (int i = list2.size() - 1; i >= 0; i--) {
            revLinkedList.add(list2.get(i));
        }
        return revLinkedList;
    }
}
