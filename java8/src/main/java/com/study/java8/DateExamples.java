package com.study.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class DateExamples {
    public void execute() {
        try {
            Instant now = Instant.now();
            System.out.println(now);
            
            Thread.sleep(1000);
            Instant nowAfterSleep = Instant.now();
            nowAfterSleep = nowAfterSleep.plusSeconds(1L);
            Duration duration = Duration.between(now, nowAfterSleep);
            System.out.println(duration.getSeconds());

            LocalDate localDate = LocalDate.now();
            LocalDate birthday = LocalDate.of(1996, 5, 18);
            Period period = Period.between(birthday, localDate);

            System.out.printf("%s %s %s \n\n", period.getYears(), period.getMonths(), period.getDays());
            System.out.println(localDate);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
