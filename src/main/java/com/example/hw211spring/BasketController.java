package com.example.hw211spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class BasketController {
    BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
@GetMapping("/add")
    public String add(@RequestParam ("itemID") int ... Items) {
      return basketService.add(Items);

    }
    @GetMapping("/get")
    public ArrayList <Item> get () {
        return basketService.getBasket();
    }
}
