package com.erpca.erpcaapp.repository;

import com.erpca.erpcaapp.model.SalesForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesFormRepository extends JpaRepository<SalesForm,Long> {
}
