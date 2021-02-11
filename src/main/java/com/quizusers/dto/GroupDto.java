package com.quizusers.dto;

import com.quizusers.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupDto {

    private Long id;
    private String name;
    private List<Student> studentsByGroups;


}
