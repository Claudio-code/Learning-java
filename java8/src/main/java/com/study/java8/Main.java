package com.study.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        LambdasStuding lambda = new LambdasStuding();
        lambda.execute();

        List<Optional<Person>> peoples = new ArrayList<>();
        Optional<Person> person1 = Optional.of(new Person("Antonia"));
        Optional<Person> person2 = Optional.of(new Person(null));
        Optional<Person> person3 = Optional.of(new Person("mario"));
        peoples.add(person1);
        peoples.add(person2);
        peoples.add(person3);

        peoples.forEach(op -> op.ifPresent(p -> System.out.println(p.getName())));
    }
}
