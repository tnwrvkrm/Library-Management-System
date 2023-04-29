package com.LMS.Library.Management.System.Service;

import com.LMS.Library.Management.System.DTOs.NewStudentRequestDto;
import com.LMS.Library.Management.System.DTOs.UpdateStudentEmailRequestDto;
import com.LMS.Library.Management.System.DTOs.UpdateStudentEmailResponseDto;
import com.LMS.Library.Management.System.Entity.LibraryCard;
import com.LMS.Library.Management.System.Entity.Student;
import com.LMS.Library.Management.System.Enum.CardStatus;
import com.LMS.Library.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public int addStudent(NewStudentRequestDto studentRequestDto){

        //creating new student object and setting the parameters
        Student student = new Student();
        student.setName(studentRequestDto.getName());
        student.setAge(studentRequestDto.getAge());
        student.setDepartment(studentRequestDto.getDepartment());
        student.setEmail(studentRequestDto.getEmail());

        //creating and activating library card object and adding it to student object
        LibraryCard card = new LibraryCard();
        card.setCardStatus(CardStatus.Activated);
        card.setStudent(student);

        student.setCard(card);

        studentRepository.save(student);

        return student.getId();
    }

    public Student findStudentByEmail(String email){
        try {
            return studentRepository.findByEmail(email);
        }
        catch (Exception e){
            return new Student();
        }
    }

    public UpdateStudentEmailResponseDto updateEmail(UpdateStudentEmailRequestDto updateStudentEmailRequestDto){
        Student student = studentRepository.findById(updateStudentEmailRequestDto.getId());

        student.setEmail(updateStudentEmailRequestDto.getNewEmail());

        Student updatedStudent = studentRepository.save(student);

        UpdateStudentEmailResponseDto updateStudentEmailResponseDto = new UpdateStudentEmailResponseDto();
        updateStudentEmailResponseDto.setId(updatedStudent.getId());
        updateStudentEmailResponseDto.setName(updatedStudent.getName());
        updateStudentEmailResponseDto.setNewEmail(updatedStudent.getEmail());

        return updateStudentEmailResponseDto;

    }
}
