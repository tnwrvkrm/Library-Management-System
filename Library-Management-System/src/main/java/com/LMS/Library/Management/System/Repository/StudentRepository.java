package com.LMS.Library.Management.System.Repository;

import com.LMS.Library.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByEmail(String email);

    Student findById(int id);
}
