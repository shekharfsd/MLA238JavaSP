package com.mphasis.stream;
import java.util.*;
import java.util.stream.*;

public class StreamAPIExample {
    public static void main(String[] args) {
        // Sample data
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "apple", "banana");

        // Intermediate Operations

        // filter()
        System.out.println("Filtered (starts with 'a'):");
        fruits.stream()
              .filter(fruit -> fruit.startsWith("a"))
              .forEach(System.out::println); // Output: apple, apple

        // map()
        System.out.println("\nMapped (length of each fruit):");
        fruits.stream()
              .map(String::length)
              .forEach(System.out::println); // Output: 5, 6, 6, 4, 5, 6

        // flatMap()
        System.out.println("\nFlatMapped (characters of each fruit):");
        fruits.stream()
              .flatMap(fruit -> Arrays.stream(fruit.split("")))
              .forEach(System.out::print); // Output: applebanana... (all characters concatenated)

        // distinct()
        System.out.println("\nDistinct fruits:");
        fruits.stream()
              .distinct()
              .forEach(System.out::println); // Output: apple, banana, cherry, date

        // sorted()
        System.out.println("\nSorted fruits:");
        fruits.stream()
              .sorted()
              .forEach(System.out::println); // Output: apple, apple, banana, banana, cherry, date

        // sorted(Comparator)
        System.out.println("\nSorted by length:");
        fruits.stream()
              .sorted(Comparator.comparing(String::length))
              .forEach(System.out::println); // Output: date, apple, apple, banana, banana, cherry

        // peek()
        System.out.println("\nPeeked (showing elements before limit):");
        fruits.stream()
              .peek(System.out::println) // Prints each element
              .limit(3)
              .forEach(System.out::println); // Output: apple, banana, cherry (print, then limit)

        // limit()
        System.out.println("\nLimited to first 3 fruits:");
        fruits.stream()
              .limit(3)
              .forEach(System.out::println); // Output: apple, banana, cherry

        // skip()
        System.out.println("\nSkipped first 2 fruits:");
        fruits.stream()
              .skip(2)
              .forEach(System.out::println); // Output: cherry, date, apple, banana

        // Terminal Operations

        // forEach()
        System.out.println("\nForEach (printing each fruit):");
        fruits.stream()
              .forEach(System.out::println); // Output: apple, banana, cherry, date, apple, banana

        // toArray()
        System.out.println("\nToArray (convert to array):");
        String[] fruitArray = fruits.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(fruitArray)); // Output: [apple, banana, cherry, date, apple, banana]

        // reduce()
        System.out.println("\nReduce (concatenate all fruits):");
        String concatenated = fruits.stream().reduce((f1, f2) -> f1 + "," + f2).orElse("No fruits");
        System.out.println(concatenated); // Output: apple,banana,cherry,date,apple,banana

        // collect()
        System.out.println("\nCollect to Set (unique fruits):");
        Set<String> fruitSet = fruits.stream().collect(Collectors.toSet());
        System.out.println(fruitSet); // Output: [apple, banana, cherry, date]

        // min()
        System.out.println("\nMin (shortest fruit):");
        Optional<String> minFruit = fruits.stream().min(Comparator.comparing(String::length));
        minFruit.ifPresent(System.out::println); // Output: date

        // max()
        System.out.println("\nMax (longest fruit):");
        Optional<String> maxFruit = fruits.stream().max(Comparator.comparing(String::length));
        maxFruit.ifPresent(System.out::println); // Output: banana

        // count()
        System.out.println("\nCount of fruits:");
        long count = fruits.stream().count();
        System.out.println(count); // Output: 6

        // anyMatch(), allMatch(), noneMatch()
        System.out.println("\nAny fruit starts with 'a':");
        boolean anyStartsWithA = fruits.stream().anyMatch(fruit -> fruit.startsWith("a"));
        System.out.println(anyStartsWithA); // Output: true

        System.out.println("\nAll fruits start with 'a':");
        boolean allStartWithA = fruits.stream().allMatch(fruit -> fruit.startsWith("a"));
        System.out.println(allStartWithA); // Output: false

        System.out.println("\nNo fruit starts with 'z':");
        boolean noneStartWithZ = fruits.stream().noneMatch(fruit -> fruit.startsWith("z"));
        System.out.println(noneStartWithZ); // Output: true

        // findFirst(), findAny()
        System.out.println("\nFirst fruit:");
        fruits.stream().findFirst().ifPresent(System.out::println); // Output: apple

        System.out.println("\nAny fruit:");
        fruits.stream().findAny().ifPresent(System.out::println); // Output: apple (or any other fruit)

        // Specialized Streams

        System.out.println("\nSpecialized Streams:");

        // IntStream
        IntStream intStream = IntStream.range(1, 5);
        System.out.println("IntStream:");
        intStream.forEach(System.out::print); // Output: 1234

        // LongStream
        LongStream longStream = LongStream.range(1, 5);
        System.out.println("\nLongStream:");
        longStream.forEach(System.out::print); // Output: 1234

        // DoubleStream
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3);
        System.out.println("\nDoubleStream:");
        doubleStream.forEach(System.out::print); // Output: 1.12.23.3

        // GroupingBy
        System.out.println("\nGrouping by length:");
        Map<Integer, List<String>> groupedByLength = fruits.stream()
                .collect(Collectors.groupingBy(String::length));
        groupedByLength.forEach((length, fruitsByLength) -> {
            System.out.println("Length " + length + ": " + fruitsByLength);
        });
        // Output: Length 5: [apple, apple]
        //         Length 6: [banana, banana]
        //         Length 6: [cherry]
        //         Length 4: [date]
    }
}
