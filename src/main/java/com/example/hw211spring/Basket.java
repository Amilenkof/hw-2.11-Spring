package com.example.hw211spring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Set;
@Component
@SessionScope
public class Basket {
    private  final Set<Integer> basket;

    public Basket(Set<Integer> basket) {
        this.basket = basket;
    }

    public String add (List<Integer> items) {
        int size = basket.size();
        basket.addAll(items);
        return size < basket.size() ? "Items added on basket" : "Wrong add";
    }
    public Set <Integer>  getBasket( ) {
        return this.basket;
    }

}
