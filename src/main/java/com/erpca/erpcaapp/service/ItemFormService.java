package com.erpca.erpcaapp.service;

import com.erpca.erpcaapp.model.ItemForm;
import com.erpca.erpcaapp.repository.ItemFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemFormService {
    @Autowired
    private ItemFormRepository itemFormRepository;

    public void saveItem(ItemForm itemForm){
        itemFormRepository.save(itemForm);
    }
}
