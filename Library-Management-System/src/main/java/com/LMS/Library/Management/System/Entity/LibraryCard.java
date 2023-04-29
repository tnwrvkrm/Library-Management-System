package com.LMS.Library.Management.System.Entity;


import com.LMS.Library.Management.System.Enum.CardStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;
    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;
    @CreatedDate
    private Date creationDate;
    @UpdateTimestamp
    private Date updationDate;
    @OneToOne
    @JoinColumn
    @JsonIgnore
    Student student;
    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    List<Transaction> transactionList = new ArrayList<>();
    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    List<Book> bookList = new ArrayList<>();
}