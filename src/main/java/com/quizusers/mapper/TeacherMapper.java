package com.quizusers.mapper;

import com.quizusers.domain.Teacher;
import com.quizusers.dto.TeacherDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TeacherMapper {

    TeacherMapper INSTANCE = Mappers.getMapper(TeacherMapper.class);

    TeacherDto toDto(Teacher teacher);

    List<TeacherDto> toTeacherDtos(List<Teacher> teachers);

    TeacherDto toDomain(TeacherDto teacherDto);
}
