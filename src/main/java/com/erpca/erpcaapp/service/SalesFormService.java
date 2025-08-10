package com.erpca.erpcaapp.service;

import com.erpca.erpcaapp.model.SalesForm;
import com.erpca.erpcaapp.repository.SalesFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesFormService {

    @Autowired
    private SalesFormRepository salesFormRepository;

    public void saveSalesForm(SalesForm salesForm){
        salesFormRepository.save(salesForm);
    }


}
