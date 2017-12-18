package com.example.stream;

import java.util.stream.Stream;

public class StreamMethods {


    public static void main(String[] args) {

        System.out.println(addUp(Stream.of(1,3,4,5,3,4,34,2,4)));

    }


    public static int addUp(Stream<Integer> numbers){
        return (int)numbers.mapToInt(x->x).summaryStatistics().getSum();
//        return numbers.reduce(0,(sum,x)->sum+=x);
    }





}
