package com.SamerDailyCoding.departementservice.repository;

import com.SamerDailyCoding.departementservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department getByDepartmentId(Long departmentID);
}
