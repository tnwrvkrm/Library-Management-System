package com.LMS.Library.Management.System.Controller;

import com.LMS.Library.Management.System.DTOs.NewStudentRequestDto;
import com.LMS.Library.Management.System.DTOs.UpdateStudentEmailRequestDto;
import com.LMS.Library.Management.System.DTOs.UpdateStudentEmailResponseDto;
import com.LMS.Library.Management.System.Entity.Student;
import com.LMS.Library.Management.System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public int addStudent(@RequestBody NewStudentRequestDto studentRequestDto){
        return studentService.addStudent(studentRequestDto);
    }

    @GetMapping("/find_by_email")
    public Student findStudentByName(@RequestParam("email") String email){
        return studentService.findStudentByEmail(email);
    }

    @PutMapping("/update_Email")
    public UpdateStudentEmailResponseDto updateEmail(@RequestBody UpdateStudentEmailRequestDto updateStudentEmailRequestDto){
        return studentService.updateEmail(updateStudentEmailRequestDto);
    }
}
