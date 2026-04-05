package com.example.employeeservice.dto.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {

    @Builder.Default
    private int code = 1000;
    private String message;

    private T result;
}