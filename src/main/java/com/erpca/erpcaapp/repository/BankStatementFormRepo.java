package com.erpca.erpcaapp.repository;

import com.erpca.erpcaapp.model.BankStatementForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankStatementFormRepo extends JpaRepository<BankStatementForm, Long> {
}
