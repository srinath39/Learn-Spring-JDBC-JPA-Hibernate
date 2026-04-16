package com.springBoot.learn_jpa_and_hibernate.course.springJpa;

import com.springBoot.learn_jpa_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringJpaRepository extends JpaRepository<Course,Long> {

    // we can also have customized methods with naming convention followed
    public List<Course> findByAuthor(String author);
    public List<Course> findByName(String name);
}
