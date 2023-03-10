package com.adityavag.example.controller;

import com.adityavag.example.entity.Department;
import com.adityavag.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }
//
//    @GetMapping("/departments")
//    public List<Department> fetchDepartmentList() {
//        return departmentService.fetchDepartmentList();
//    }

//    @GetMapping("/departments/{id}")
//    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
//        return departmentService.fetchDepartmentById(departmentId);
//    }
}
