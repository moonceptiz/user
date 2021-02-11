package com.quizusers.controller;


import com.quizusers.domain.Group;
import com.quizusers.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @GetMapping("/{group}")
    public Group getGroups(@PathVariable("group") long groups) {
       return groupService.getGroups(groups);
    }

}
