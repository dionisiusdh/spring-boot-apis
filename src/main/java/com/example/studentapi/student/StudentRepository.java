package com.example.studentapi.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Anything that access the DB is called as repo
    // especially when working with JPA
}
