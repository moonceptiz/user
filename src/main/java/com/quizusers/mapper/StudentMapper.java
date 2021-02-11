package com.quizusers.mapper;

import com.quizusers.domain.Student;
import com.quizusers.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto toDto(Student student);


    List<StudentDto> toStudentDtos(List<Student> students);

    StudentDto toDomain(StudentDto studentDto);
}

