package com.quizusers.service;

import com.quizusers.domain.Group;
import com.quizusers.dto.StudentDto;
import com.quizusers.mapper.GroupMapper;
import com.quizusers.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupMapper groupMapper;
    private final GroupRepository groupRepository;

    public Group getGroups(long groups) {
        return groupRepository.getGroups(groups);
    }


}
