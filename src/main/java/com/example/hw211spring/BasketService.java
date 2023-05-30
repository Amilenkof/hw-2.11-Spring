package com.example.hw211spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

@Service

@SessionScope
public class BasketService {
    private ArrayList<Item> basket;

    public BasketService(ArrayList<Item> basket) {
        this.basket = basket;
    }

    String add(int... itemID) {
        int size = basket.size();
        ArrayList<Item> addToBasket = (ArrayList<Item>) (Arrays.stream(itemID)
                .mapToObj(e -> new Item(e))
                .collect(Collectors.toList()));
        boolean checkAdd = basket.addAll(addToBasket);
        return checkAdd ? "Items added" : "Wrong add";


    }

    ArrayList<Item> getBasket() {
        return basket;
    }

}
