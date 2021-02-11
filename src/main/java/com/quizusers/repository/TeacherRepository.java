package com.quizusers.repository;

import com.quizusers.domain.Teacher;
import com.quizusers.dto.TeacherDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class TeacherRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public Teacher findById(long teacherId) {
        String SQL_FOR_ID = "select * from teacher where id = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("id", teacherId);

        return jdbcTemplate.queryForObject(SQL_FOR_ID, params, new BeanPropertyRowMapper<>(Teacher.class));
    }

    public List<Teacher> getAll() {
        String SQL_GET_ALL = "select * from teacher";
        Map<String, Object> params = new HashMap<>();
        return jdbcTemplate.query(SQL_GET_ALL, params, new BeanPropertyRowMapper<>(Teacher.class));
    }

    public List<Teacher> findAll(long count) {
        String SQL_GET_ALL = "select * from teacher limit :count";

        Map<String, Object> params = new HashMap<>();
        params.put("count", count);

        return jdbcTemplate.query(SQL_GET_ALL, params, new BeanPropertyRowMapper<>(Teacher.class));
    }

    public void add(TeacherDto teacher) {
        String SQL_FOR_ADD = "insert into teacher (teacher ) values(:teacher)";

        Map<String, Object> params = new HashMap<>();
        params.put("teacherName", teacher.getName());
        params.put("teacherSurname", teacher.getSurname());


        jdbcTemplate.execute(SQL_FOR_ADD, params, (PreparedStatementCallback<Object>) PreparedStatement::executeUpdate);
    }

    public void delete(long teacherId) {
        String SQL_FOR_DELETE = "delete from teacher where id = :id";

        Map<String, Object> params = new HashMap<>();
        params.put("id", teacherId);

        jdbcTemplate.update(SQL_FOR_DELETE, params);
    }

    public void updateById(TeacherDto teacher) {
        String SQL_FOR_UPDATE = "update teacher set id=:id, teacher=:teacher where id=:id";

        Map<String, Object> params = new HashMap<>();
        params.put("id", teacher.getName());
        params.put("id", teacher.getSurname());


        jdbcTemplate.update(SQL_FOR_UPDATE, params);
    }

}

