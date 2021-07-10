package com.laioffer.onlineOrder.controller;

import com.laioffer.onlineOrder.service.ItemOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ItemOrderController {

    @Autowired
    private ItemOrderService itemOrderService;

    @RequestMapping(value = "/order/{menuId}", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void addMenuItemToCart(@PathVariable int menuId) {
        itemOrderService.saveItem(menuId);
    }
}