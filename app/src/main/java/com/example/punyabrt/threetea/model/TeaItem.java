package com.example.punyabrt.threetea.model;

import java.util.Locale;

public class TeaItem {
    public final String menu;
    public final String price;
    public final String location;


    public TeaItem(String menu, String price, String location) {
        this.menu = menu;
        this.price = price;
        this.location = location;

    }

    @Override
    public String toString() {
        String msg = String.format(
                Locale.getDefault(),
                "%s (%s)",
                this.menu,
                this.price,
                this.location
        );
        return msg;
    }
}
