package com.LMS.Library.Management.System.Repository;

import com.LMS.Library.Management.System.Entity.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard, Integer> {
}
