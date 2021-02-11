package com.quizusers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private Long id;

    @NotNull
    @Size(min = 2,max = 20)
    private String name;

    @NotNull
    @Size(min = 3,max = 25)
    private String surname;

}

