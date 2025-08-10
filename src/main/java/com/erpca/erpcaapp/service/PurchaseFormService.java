package com.erpca.erpcaapp.service;

import com.erpca.erpcaapp.model.PurchaseForm;
import com.erpca.erpcaapp.repository.PurchaseFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseFormService {

    @Autowired
    private PurchaseFormRepository purchaseFormRepository;

    public void savePurchaseForm(PurchaseForm purchaseForm){
        purchaseFormRepository.save(purchaseForm);
    }
}
