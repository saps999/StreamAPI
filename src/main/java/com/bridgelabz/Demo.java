package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        String[] charecter={"saps","rakib","avi"};
        Stream<String> stream=Stream.of(charecter);
       // stream.distinct().sorted().forEach(p-> System.out.println(p));

        List<String> newList= new ArrayList<>();
        newList.add("saps");
        newList.add("rakib");
        newList.add("avi");

        Stream<String> stream1=newList.stream();
        stream1.sorted().forEach(p-> System.out.println(p));

    }
}
