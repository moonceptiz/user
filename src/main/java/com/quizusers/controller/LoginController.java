package com.quizusers.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final StudentController studentController;
    private final TeacherController teacherController;

    @GetMapping("/{user}")
    public List<? extends Object> login(@PathVariable("user") String user) {
        if (user.equalsIgnoreCase("student")) {
            return studentController.getAll();
        } else if (user.equalsIgnoreCase("teacher")) {
            return teacherController.getAll();
        } else {
            return Collections.emptyList();
        }
    }
}