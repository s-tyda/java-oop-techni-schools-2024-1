package org.example.lambda;

import org.example.oop.datastructures.warehouse.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void test(Printable printable){
        printable.print("siema");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat
                .incrementAge()
                .incrementAge()
                .incrementAge()
                .incrementAge()
                .incrementAge();
        test(cat);

        Printable printable = x -> System.out.println("Meow " + x);
        test(printable);

        Function<String, Integer> function = x -> 5;
        System.out.println(function.apply("test"));

        Predicate<List> predicate = list -> list.isEmpty();
        System.out.println(predicate.test(new ArrayList()));

        Supplier<String> supplier = () -> "test";
        System.out.println(supplier.get());

        Consumer<Integer> consumer = integer -> System.out.println(integer);
        consumer.accept(5);

        String string = "test ";
        String string2 = string
                .replace(" ", "")
                .toUpperCase();

        List<Item> items = new ArrayList<>();
        Item item1 = new Item("mleko po które wyszedł tata, ale wrócił", 18d, 0);
        Item item2 = new Item("złoty masterdysk, którego ja nie mam", 735, 2137);
        items.add(item1);
        items.add(item2);

        items
                .forEach(item -> System.out.println(item));

        int jakasSuma = items.stream()
                .mapToInt(item -> item.getQuantity())
                .sum();

        List<String> filteredItems = items.stream()
                .filter(item -> item.getQuantity() > 0)
                .peek(item -> item.setName("test"))
                .map(item -> item.getName())
                .collect(Collectors.toList());

        System.out.println(filteredItems);

        List<Integer> integerList = Arrays.asList(3, 5, 6, 134, 6);
        System.out.println(
                integerList.stream()
                        .reduce(0, (sum, ele) -> sum + ele)
        );

        int sum = 0;
        for (int ele: integerList){
            sum = sum + ele;
        }
    }
}
