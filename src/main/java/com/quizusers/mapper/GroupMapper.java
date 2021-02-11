package com.quizusers.mapper;

import com.quizusers.domain.Group;
import com.quizusers.dto.GroupDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GroupMapper {

    GroupMapper INSTANCE = Mappers.getMapper(GroupMapper.class);

    GroupDto toDto(Group group);
    List<GroupDto> toGroupDtos(List<Group> Group);
    GroupDto toDomain(GroupDto groupDto);

}
