package com.springBoot.learn_jpa_and_hibernate.course.jdbc;

import com.springBoot.learn_jpa_and_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private String INSERT_QUERY= """
                insert into course (id,name,author) 
                values (?,?,?);
                """;

    private String DELETE_QUERY= """
                Delete from course
                 where id=?;
            """;

    private String SELECT_QUERY= """
                Select * from Course
                where id=?;
            """;

    public void insertRecord(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }

    public Course findById(long id){
        //Row in ResultSet need to map to Course Bean
        // For this to happen we use BeanPropertyRowMapper
        return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
