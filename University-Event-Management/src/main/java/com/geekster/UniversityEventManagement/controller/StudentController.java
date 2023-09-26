package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("students")
    public String addStudents(@RequestBody @Valid List<Student> students) {
        return studentService.addStudents(students);
    }

    @GetMapping("students")
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping("students/studentId/{stId}")
    public Student getStudentsById(@PathVariable Long stId) {
        return studentService.getStudentsById(stId);
    }

    @PutMapping("students/studnetId/{stId}/department/{dept}")
    public String updateStudentInformationById(@PathVariable Long stId, @PathVariable Department dept) {
        return studentService.updateStudentInformationById(stId, dept);
    }

    @DeleteMapping("students/studentsId/{stId}")
    public String deleteStudentsById(@PathVariable Long stId) {
        return studentService.deleteStudentsById(stId);
    }
}
