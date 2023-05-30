package com.example.hw211spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {
    BasketServiceImpl basketService;

    public BasketController(BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("itemID") List<Integer> items) {
        return basketService.add(items);

    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return basketService.get();
    }
}
