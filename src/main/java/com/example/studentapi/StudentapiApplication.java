package com.example.studentapi;

import com.example.studentapi.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class StudentapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentapiApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Bob",
						"bob.123@gmail.com",
						 LocalDate.of(2000, Month.JANUARY, 5),
						21
				)
		);
	}
}
