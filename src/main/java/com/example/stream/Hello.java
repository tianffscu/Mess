package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Hello implements Child {

    @Override
    public void test() {


    }

    public void message() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        crossMapBiArray(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
    }

    static void distinctStringArr(String[] arr) {
        Arrays.stream(arr)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }

    static void crossMapBiArray(List<Integer> arr1, List<Integer> arr2) {

        List<int[]> ll = arr1.stream()
                .flatMap(i -> arr2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        ll.forEach(x ->
                System.out.println(Arrays.toString(x)));

    }
}
