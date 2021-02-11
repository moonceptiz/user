package com.quizusers.service;


import com.quizusers.dto.StudentDto;
import com.quizusers.mapper.StudentMapper;
import com.quizusers.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentMapper studentMapper;
    private final StudentRepository studentRepository;


    public StudentDto getById(long id) {
        return studentMapper.toDto(studentRepository.findById(id));

    }

    public List<StudentDto> getAll(long count) {
        return studentMapper.toStudentDtos(studentRepository.findAll(count));
    }

    public void add(StudentDto studentDto) {
        studentRepository.add(studentMapper.toDomain(studentDto));
    }

    public void delete(long id) {
        studentRepository.delete(id);
    }

    public void updateById(StudentDto studentDto) {
        studentRepository.updateById(studentMapper.toDomain(studentDto));
    }

    public List<StudentDto> getAll() {
        return studentMapper.toStudentDtos(studentRepository.getAll());
    }
}
