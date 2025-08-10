package com.erpca.erpcaapp.repository;

import com.erpca.erpcaapp.model.ItemForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemFormRepository extends JpaRepository<ItemForm,Long> {
}
