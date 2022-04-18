package com.SamerDailyCoding.departementservice.service;

import com.SamerDailyCoding.departementservice.entity.Department;
import com.SamerDailyCoding.departementservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentID) {
        log.info("inside findDepartmentById method of DepartmentService");
        return departmentRepository.getByDepartmentId(departmentID);
    }
}
