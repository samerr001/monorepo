package com.samerDailyCoding.userservice.dto;

import com.samerDailyCoding.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDepartmentDTO {
    private User user;
    private Department department;
}
