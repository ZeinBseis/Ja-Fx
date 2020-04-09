package sample;


import java.util.Arrays;
import java.util.LinkedList;

public class tester {
    public static void main(String[]args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        System.out.println(Arrays.toString(list.toArray()));
        reverse(list);
        System.out.println(Arrays.toString(list.toArray()));

    }

    public static <T> void reverse(LinkedList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            T obj = list.get(i);
            list.remove(i);
            list.addFirst(obj);
        }
    }
}
