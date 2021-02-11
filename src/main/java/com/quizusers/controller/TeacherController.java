package com.quizusers.controller;

import com.quizusers.domain.Teacher;
import com.quizusers.dto.TeacherDto;
import com.quizusers.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;

    @GetMapping("/{count}")
    public List<TeacherDto> getAll(@PathVariable("count") long count) {
        return teacherService.getAll(count);
    }

    @GetMapping("/find/{id}")
    public TeacherDto findById(@PathVariable("id") long id) {
        return teacherService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody TeacherDto teacherDto) {
        teacherService.add(teacherDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        teacherService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody TeacherDto teacherDto) {
        teacherService.updateById(teacherDto);
    }


    public List<Teacher> getAll() {
        return teacherService.getAll();
    }
}

