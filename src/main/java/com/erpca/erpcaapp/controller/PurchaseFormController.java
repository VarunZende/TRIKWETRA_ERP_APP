package com.erpca.erpcaapp.controller;

import com.erpca.erpcaapp.model.PurchaseForm;
import com.erpca.erpcaapp.service.PurchaseFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class PurchaseFormController {

    @Autowired
    private PurchaseFormService purchaseFormService;
@PostMapping("/submitPurchaseForm")
    public String savePurchaseForm(@ModelAttribute PurchaseForm purchaseForm) {
    purchaseFormService.savePurchaseForm(purchaseForm);
        return "redirect:/success";

    }
}
