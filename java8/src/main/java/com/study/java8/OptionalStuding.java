package com.study.java8;

import java.util.Optional;

public class OptionalStuding {
    public void execute() {
        Optional<Person> person1 = Optional.of(new Person("Antonia"));
        Optional<Person> person2 = Optional.of(new Person(null));

        person1.ifPresent(p -> System.out.println(p.getName()));
        person2.ifPresent(p -> System.out.println(p.getName()));
    }    
}
