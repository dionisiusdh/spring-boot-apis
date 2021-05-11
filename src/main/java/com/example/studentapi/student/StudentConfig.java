package com.example.studentapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student bob = new Student(
                    1L,
                    "Bob",
                    "bob123@gmail.com",
                    LocalDate.of(2000, JANUARY, 8),
                    21
            );

            Student sam = new Student(
                    "Sam",
                    "sam@gmail.com",
                    LocalDate.of(1998, MARCH, 25),
                    23
            );

            repository.saveAll(
                    List.of(bob, sam)
            );
        };
    }
}
