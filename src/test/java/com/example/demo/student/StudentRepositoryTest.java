package com.example.demo.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    @Autowired
    private StudentRepository userTest;

    @Test
    void itShouldCheckIfStudentExistsEmail() {
        // given
        String email = "jamila@gmail.com";
        Student student = new Student("Jamila", email, Gender.FEMALE);
        userTest.save(student);

        // when
        boolean exists = userTest.selectExistsEmail(email);

        // then
        assertThat(exists).isTrue();
    }
}