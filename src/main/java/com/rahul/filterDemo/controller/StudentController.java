package com.rahul.filterDemo.controller;

import com.rahul.filterDemo.dto.Student;
import com.rahul.filterDemo.dto.StudentResponseDTO;
import com.rahul.filterDemo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @PostMapping
    public ResponseEntity<StudentResponseDTO> createStudent(@RequestBody Student student){
        StudentResponseDTO responseDTO = studentService.createStudent(student);
        return ResponseEntity.ok(responseDTO);
    }
}
