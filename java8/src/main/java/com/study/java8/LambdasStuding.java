package com.study.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdasStuding {
    public void execute() {
        // java 7
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("java 8 function");
            }
        };
        run.run();

        ////////////////////////

        Runnable runnable = () -> System.out.println("java 8 lambda parameter");
        runnable.run();

        new Thread(() -> System.out.println("java 8 lambda")).start();

        List<String> stings = Arrays.asList("there", "how", "new job");
        stings.forEach(str -> System.out.println(str));

        List<String> result = stings.stream()
                .filter(str -> str.startsWith("h"))
                .collect(Collectors.toList());

        result.forEach(MethodReferences::say);

        List<Runnable> lambdaFunctions = Arrays.asList(
                () -> System.out.println("I going to school"),
                () -> System.out.println("Next year all will better again"),
                () -> {
                    System.out.println("tomorrow I have new tasks");
                }
        );
        lambdaFunctions.forEach(Runnable::run);

        MyInterface myInterface = (String s) -> {
            System.out.println("It is the beast feature " + s + " \n\n");
        };
        myInterface.print("there");
        myInterface.body();
        stings.forEach(myInterface::print);
    }
}
