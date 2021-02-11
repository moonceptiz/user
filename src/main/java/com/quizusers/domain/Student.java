package com.quizusers.domain;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Data
public class Student {

    private Long id;
    private String name;
    private String surname;
    private String group_id;



}
