package com.spring.Item.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/item")
    public String getItem() throws InterruptedException {
     Thread.sleep(4000);
        return "Item";
    }

}
