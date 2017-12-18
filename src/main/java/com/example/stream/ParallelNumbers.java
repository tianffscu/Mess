package com.example.stream;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelNumbers {

    private static final int N = Integer.MAX_VALUE;

    private static Map<Integer, Double> parallelDiceRolls() {
        double fraction = 1.0 / N;
        return IntStream.range(0, N)
                .parallel()
                .mapToObj(twoDiceThrows())
                .collect(Collectors.groupingBy(side -> side,
                        Collectors.summingDouble(n -> fraction)));
    }

    private static IntFunction<Integer> twoDiceThrows() {
        return i -> {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int firstThrow = random.nextInt(1, 7);
            int secondThrow = random.nextInt(1, 7);
            return firstThrow + secondThrow;
        };
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(JSONObject.toJSON(parallelDiceRolls()));
        long lips = System.currentTimeMillis() - start;

        System.out.println("Used " + lips + " millis");

        Runnable arg = ()->{};
    }

}
