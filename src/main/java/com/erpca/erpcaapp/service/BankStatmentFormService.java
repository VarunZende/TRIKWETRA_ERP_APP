package com.erpca.erpcaapp.service;

import com.erpca.erpcaapp.model.BankStatementForm;
import com.erpca.erpcaapp.repository.BankStatementFormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankStatmentFormService {

    @Autowired
    private BankStatementFormRepo bankStatementFormRepo;

    public void saveBankStatementFormRepo(BankStatementForm bankStatementForm) {
        bankStatementFormRepo.save(bankStatementForm);
    }
}
