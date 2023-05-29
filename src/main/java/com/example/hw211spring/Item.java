package com.example.hw211spring;

import org.springframework.stereotype.Component;

import java.util.Objects;

public class Item {
    int itemID;

    public Item(int itemID) {
        this.itemID = itemID;
    }

    public int getItemID() {
        return itemID;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "itemID=" + itemID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return getItemID() == item.getItemID();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemID());
    }
}
