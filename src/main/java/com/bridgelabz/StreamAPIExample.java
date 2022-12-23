package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 7, 56, 77, 23, 9, 11, 65, 3, 4, 5, 5, 6, 7, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 20};
        Stream<Integer> stream = Stream.of(numbers);
        ArrayList<Integer> anotherArray = new ArrayList<>();
        //stream.distinct().sorted().forEach(number -> System.out.print(number + ", "));
        stream.distinct().sorted().filter(number -> number % 2 == 0).forEach(number -> System.out.print(number + ", "));

        List<Integer> listOfInteger = new LinkedList<>();
        listOfInteger.add(2);
        listOfInteger.add(4);
        listOfInteger.add(8);
        listOfInteger.add(9);
        listOfInteger.add(23);
        listOfInteger.add(12);

        Stream<Integer> streamOfInt = listOfInteger.stream();
        streamOfInt.sorted().filter(number -> number % 2 == 0).forEach(number -> System.out.print(number + ", "));

    }
}
