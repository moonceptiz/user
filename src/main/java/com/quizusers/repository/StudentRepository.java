package com.quizusers.repository;

import com.quizusers.domain.Student;
import com.quizusers.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
@RequiredArgsConstructor
public class StudentRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public Student findById(long studentId) {
        String SQL_FOR_ID = "select * from student where id = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("id", studentId);

        return jdbcTemplate.queryForObject(SQL_FOR_ID, params, new BeanPropertyRowMapper<>(Student.class));

    }

    public List<Student> getAll() {
        String SQL_GET_ALL = "select * from student";
        Map<String, Object> params = new HashMap<>();
        return jdbcTemplate.query(SQL_GET_ALL, params, new BeanPropertyRowMapper<>(Student.class));
    }

    public List<Student> findAll(long count) {
        String SQL_FIND_ALL = "select * from student limit :count";

        Map<String, Object> params = new HashMap<>();
        params.put("count", count);

        return jdbcTemplate.query(SQL_FIND_ALL, params, new BeanPropertyRowMapper<>(Student.class));
    }

    public void add(StudentDto student) {
        String SQL_FOR_ADD = "insert into student (student ) values(:student)";

        Map<String, Object> params = new HashMap<>();
        params.put("studentName", student.getName());
        params.put("studentSurname", student.getSurname());

        jdbcTemplate.execute(SQL_FOR_ADD, params, (PreparedStatementCallback<Object>) PreparedStatement::executeUpdate);
    }

    public void delete(long studentId) {
        String SQL_FOR_DELETE = "delete from student where id = :id";

        Map<String, Object> params = new HashMap<>();
        params.put("id", studentId);

        jdbcTemplate.update(SQL_FOR_DELETE, params);
    }

    public void updateById(StudentDto student) {
        String SQL_FOR_UPDATE = "update student set id=:id, student=:student where id=:id";
        Map<String, Object> params = new HashMap<>();
        params.put("name", student.getName());
        params.put("surname", student.getSurname());

        jdbcTemplate.update(SQL_FOR_UPDATE, params);
    }

}

