package com.springBoot.learn_jpa_and_hibernate.course.jpa;

import com.springBoot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLinerRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.insert(new Course(1,"AI Engineer","Srinath"));
        courseJpaRepository.insert(new Course(2,"Security Engineer","Bala"));
        courseJpaRepository.insert(new Course(3,"Database Engineer","Somesh"));

        // delete a record by Id
        courseJpaRepository.deleteById(2);

        // select by Id
        System.out.println(courseJpaRepository.findById(1));
        System.out.println(courseJpaRepository.findById(3));
    }
}
