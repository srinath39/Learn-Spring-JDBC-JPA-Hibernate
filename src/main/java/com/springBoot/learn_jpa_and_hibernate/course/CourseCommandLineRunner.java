package com.springBoot.learn_jpa_and_hibernate.course;

import com.springBoot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.springBoot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.springBoot.learn_jpa_and_hibernate.course.springJpa.CourseSpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"AI Engineer","Srinath"));
        repository.save(new Course(2,"Security Engineer","Bala"));
        repository.save(new Course(3,"Database Engineer","Somesh"));

        // delete a record by Id
        repository.deleteById(2l);

        // select by Id
        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(3l));

        // other methods in spring JPA
        System.out.println(repository.findAll());
        System.out.println(repository.count());
    }
}
