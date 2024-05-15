package com.example.functionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Sum simpleSum = Integer::sum;
        simpleSum.calculate(70000,120000);

        Consumer<String> c = System.out::println;
        c.accept("I am a consumer! C!");

        BiPredicate<Boolean,Boolean> andGate = (x,y) -> x && y;
        System.out.println(andGate.test(false,true));
        System.out.println(andGate.test(true,true));

        Supplier<Long> epochTime = System::currentTimeMillis;
        System.out.println(epochTime.get());

        BiFunction<Double,Double,Double> decimalSum = Double::sum;
        System.out.println(decimalSum.apply(8.8,4.5));
    }
}
