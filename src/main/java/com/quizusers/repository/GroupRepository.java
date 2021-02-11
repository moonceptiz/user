package com.quizusers.repository;

import com.quizusers.domain.Group;
import com.quizusers.domain.Student;
import com.quizusers.dto.GroupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class GroupRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public Group getGroups(Long groups) {
        String SQL_FOR_ID = "select * from groups where id = :id";
        Map<String, Object> params = new HashMap<>();
        params.put("id",  groups);

        return jdbcTemplate.queryForObject(SQL_FOR_ID, params, new BeanPropertyRowMapper<>(Group.class));
    }
}
