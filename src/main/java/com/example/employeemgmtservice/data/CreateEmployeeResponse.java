package com.example.employeemgmtservice.data;

import lombok.NonNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CreateEmployeeResponse {
    private final @NonNull String status;
    private final @NonNull String id;
}
