package com.example.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by tianff on 17/12/18
 */
public class MyFiles {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/tianfei/Desktop/test.txt");
        System.out.println(countCharacterAppearTimes(path));
    }

    private static Map<Character, Long> countCharacterAppearTimes(Path path) throws IOException {
        return Files.readAllLines(path)
                .stream()
                .map(String::chars)
                .flatMap(im -> im.mapToObj(c -> (char) c))
                .filter(Character::isAlphabetic)
                .collect(groupingBy(c -> c, counting()));
    }
}
