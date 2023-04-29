package com.LMS.Library.Management.System.Repository;

import com.LMS.Library.Management.System.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
