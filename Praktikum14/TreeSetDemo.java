package Praktikum14;

import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("mangga");
        fruits.add("apel");
        fruits.add("jeruk");
        fruits.add("jambu");

        for (String temp : fruits) {
            System.out.println(temp);
        }
        System.out.println("First: " +fruits.first());
        System.out.println("Last: " +fruits.last());
        fruits.remove("jeruk");
        System.out.println("Stelah Remove: " + fruits);
        fruits.pollFirst();
        System.out.println("Setelah Poll First: " + fruits);
        fruits.pollLast();
        System.out.println("Setelah Poll Last: " + fruits);
    }
}
