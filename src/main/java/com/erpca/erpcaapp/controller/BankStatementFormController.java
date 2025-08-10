package com.erpca.erpcaapp.controller;

import com.erpca.erpcaapp.model.BankStatementForm;
import com.erpca.erpcaapp.service.BankStatmentFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankStatementFormController {

    @Autowired
    private BankStatmentFormService bankStatmentFormService;

    @PostMapping("/submitBankStatementForm")
    public String saveBankStatementForm(@ModelAttribute BankStatementForm bankStatementForm) {
        bankStatmentFormService.saveBankStatementFormRepo(bankStatementForm);
        return "redirect:/success";
    }

}
