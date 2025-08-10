package com.erpca.erpcaapp.controller;

import com.erpca.erpcaapp.model.ItemForm;
import com.erpca.erpcaapp.model.JournalForm;
import com.erpca.erpcaapp.service.ItemFormService;
import com.erpca.erpcaapp.service.JournalFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ItemFormController {


    @Autowired
    private ItemFormService itemFormService;

    @PostMapping("/submitItemForm")
    public String submitItemForm(@ModelAttribute ItemForm itemForm) {
        System.out.println( itemForm.getGstDetails());
        System.out.println( itemForm.getName());
        itemFormService.saveItem(itemForm);
        return "redirect:/success"; // Redirect to a success page
    }
}
