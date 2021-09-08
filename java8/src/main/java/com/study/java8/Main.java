package com.study.java8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("java 8 function");
            }
        };
        new Thread(run).start();

        Runnable runnable = () -> System.out.println("java 8 lambda parameter");
        new Thread(runnable).start();

        new Thread(() -> System.out.println("java 8 lambda")).start();

        List<String> stings = Arrays.asList("there", "how", "new job");
        stings.forEach(str -> System.out.println(str));
    }
}
