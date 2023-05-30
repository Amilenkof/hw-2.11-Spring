package com.example.hw211spring;

import java.util.List;
import java.util.Set;

public interface BasketService {


    String add(List<Integer> items);

    Set<Integer> get();
}
