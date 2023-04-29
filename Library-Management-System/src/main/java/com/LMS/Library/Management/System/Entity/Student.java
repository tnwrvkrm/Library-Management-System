package com.LMS.Library.Management.System.Entity;

import com.LMS.Library.Management.System.Enum.CardStatus;
import com.LMS.Library.Management.System.Enum.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Enumerated(EnumType.STRING)
    private Department department;
    private String email;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    LibraryCard card;
}
