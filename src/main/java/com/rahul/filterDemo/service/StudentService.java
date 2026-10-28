package com.rahul.filterDemo.service;

import com.rahul.filterDemo.dto.Student;
import com.rahul.filterDemo.dto.StudentResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public StudentResponseDTO createStudent(Student student){
        StudentResponseDTO responseDTO= new StudentResponseDTO();
        responseDTO.setName(student.getName());
        responseDTO.setMessage("Student Record added sucessfully");

        return responseDTO;


    }
}
