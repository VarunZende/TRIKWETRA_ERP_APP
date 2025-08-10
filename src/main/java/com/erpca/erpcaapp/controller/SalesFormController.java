package com.erpca.erpcaapp.controller;

import com.erpca.erpcaapp.model.SalesForm;
import com.erpca.erpcaapp.service.SalesFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SalesFormController {
    @Autowired
    private SalesFormService salesFormService;

    @PostMapping("/submitSalesForm")
    public String saveSalesForm(@ModelAttribute("salesForm") SalesForm salesForm) {
        salesFormService.saveSalesForm(salesForm);
        return "redirect:/success"; // Redirect to a success page
    }
}
