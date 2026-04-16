package com.springBoot.learn_jpa_and_hibernate.course.jdbc;

import com.springBoot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJdbcCommandLinerRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    // command line runner , By default spring runs this method while application start up
    @Override
    public void run(String... args) throws Exception {

//        // add new records
//        repository.insertRecord(new Course(1,"DSA","Manas"));
//        repository.insertRecord(new Course(2,"System Design","Harshit"));
//        repository.insertRecord(new Course(3,"DEV","Srinath"));
//
//        // delete a record by Id
//        repository.deleteById(2);
//
//        // select by Id
//        System.out.println(repository.findById(1));
//        System.out.println(repository.findById(3));
    }
}
