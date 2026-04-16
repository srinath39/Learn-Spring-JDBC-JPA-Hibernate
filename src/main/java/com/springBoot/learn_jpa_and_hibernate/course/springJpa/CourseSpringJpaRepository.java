package com.springBoot.learn_jpa_and_hibernate.course.springJpa;

import com.springBoot.learn_jpa_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJpaRepository extends JpaRepository<Course,Long> {
}
