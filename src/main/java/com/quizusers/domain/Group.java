package com.quizusers.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Group extends Student {

    private Long id;
    private String name;
    private List<Student> studentsByGroups;

}
