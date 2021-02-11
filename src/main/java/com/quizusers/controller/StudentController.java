package com.quizusers.controller;

import com.quizusers.dto.StudentDto;
import com.quizusers.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;


    public List<StudentDto> getAll() {
        return studentService.getAll();
    }


    @GetMapping("/{count}")
    public List<StudentDto> getAll(@PathVariable("count") long count) {
        return studentService.getAll(count);
    }

    @GetMapping("/find/{id}")
    public StudentDto findById(@PathVariable("id") long id) {
        return studentService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody StudentDto studentDto) {
        studentService.add(studentDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        studentService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody StudentDto studentDto) {
        studentService.updateById(studentDto);
    }


}


