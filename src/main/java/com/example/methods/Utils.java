package com.example.methods;

import org.apache.commons.lang.RandomStringUtils;

import java.util.Random;

public class Utils {


    private static String randomAlphaAndNumeric(int length) {
        if (length < 1) {
            return "1error";
        }

        StringBuilder base = new StringBuilder(RandomStringUtils.randomNumeric(length));
        Random generator = new Random();

        int replaceCount = generator.nextInt(length / 2 + 1) + 1;
        for (int i = 0; i < replaceCount; i++) {
            int randomPosition = generator.nextInt(length);
            String randomVal = RandomStringUtils.randomAlphabetic(1);

            base.replace(randomPosition, randomPosition + 1, randomVal);
        }
        return base.toString().toLowerCase();
    }
}
