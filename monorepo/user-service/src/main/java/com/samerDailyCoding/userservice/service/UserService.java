package com.samerDailyCoding.userservice.service;

import com.samerDailyCoding.userservice.dto.Department;
import com.samerDailyCoding.userservice.dto.UserDepartmentDTO;
import com.samerDailyCoding.userservice.entity.User;
import com.samerDailyCoding.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside method saveUser of UserService");
        return userRepository.save(user);
    }

    public UserDepartmentDTO getUserWithDepartment(Long userId) {
        log.info("inside getUserWithDepartment method of UserService");
        UserDepartmentDTO ud = new UserDepartmentDTO();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" +
                user.getDepartmentId(),Department.class);
        ud.setUser(user);
        ud.setDepartment(department);
        return ud;
    }
}
