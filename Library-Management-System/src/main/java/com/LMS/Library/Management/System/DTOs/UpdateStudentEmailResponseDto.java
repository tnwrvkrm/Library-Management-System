package com.LMS.Library.Management.System.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateStudentEmailResponseDto {
    private int id;
    private String name;
    private String newEmail;
}
