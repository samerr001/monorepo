package com.SamerDailyCoding.departementservice.controller;

import com.SamerDailyCoding.departementservice.entity.Department;
import com.SamerDailyCoding.departementservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of departmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentID){
        log.info("Inside findDepartmentById method of departmentController");
        return departmentService.findDepartmentById(departmentID);

    }
}
