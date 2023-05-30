package com.example.hw211spring;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service


public class BasketServiceImpl implements BasketService {
    private Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }


    @Override
    public String add(List<Integer> items) {
        return basket.add(items);

    }

    @Override
    public Set<Integer> get() {
        return basket.getBasket();
    }
}
