package com.quizusers.config;

import com.quizusers.mapper.GroupMapper;
import com.quizusers.mapper.StudentMapper;
import com.quizusers.mapper.TeacherMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMapper {

    @Bean
    public StudentMapper studentMapper() {
        return StudentMapper.INSTANCE;
    }

    @Bean
    public TeacherMapper teacherMapper() {
        return TeacherMapper.INSTANCE;
    }

    @Bean
    public GroupMapper groupMapper() {
        return GroupMapper.INSTANCE;
    }
}
