package com.uni.fmi.lab02.streams;

import java.math.BigDecimal;

public class OrderLine {
    private Item item;
    private int quantity;

    private boolean specialOffer;

    public OrderLine(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public OrderLine(Item item, int quantity, boolean specialOffer) {
        this.item = item;
        this.quantity = quantity;
        this.specialOffer = specialOffer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(boolean specialOffer) {
        this.specialOffer = specialOffer;
    }

    public BigDecimal getPrice() {
        return item.getPrice().multiply(BigDecimal.valueOf(quantity));
    }
}
