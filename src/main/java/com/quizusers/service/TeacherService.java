package com.quizusers.service;

import com.quizusers.domain.Teacher;
import com.quizusers.dto.TeacherDto;
import com.quizusers.mapper.TeacherMapper;
import com.quizusers.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherMapper teacherMapper;
    private final TeacherRepository teacherRepository;


    public TeacherDto getById(long id) {
        return teacherMapper.toDto(teacherRepository.findById(id));
    }

    public List<TeacherDto> getAll(long count) {
        return teacherMapper.toTeacherDtos(teacherRepository.findAll(count));
    }

    public void add(TeacherDto teacherDto) {
        teacherRepository.add(teacherMapper.toDomain(teacherDto));
    }

    public void delete(long id) {
        teacherRepository.delete(id);
    }

    public void updateById(TeacherDto teacherDto) {
        teacherRepository.updateById(teacherMapper.toDomain(teacherDto));
    }

    public List<Teacher> getAll() {
        return teacherRepository.getAll();
    }
}

