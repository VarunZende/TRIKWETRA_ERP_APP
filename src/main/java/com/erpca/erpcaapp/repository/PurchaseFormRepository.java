package com.erpca.erpcaapp.repository;

import com.erpca.erpcaapp.model.PurchaseForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseFormRepository extends JpaRepository<PurchaseForm, Long> {}
