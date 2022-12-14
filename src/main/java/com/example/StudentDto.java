package com.example;

import jakarta.enterprise.context.Dependent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Dependent
public class StudentDto {
    private Long studentId;
    private String studentName;
    private String studentSurname;
}
