package com.enigma.gosling7.example_static;

import java.text.NumberFormat;
import java.util.Locale;

public class UtilCurrency {
    public static String formatIDR(int number) {
        Locale locale = new Locale("id", "ID");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        return formatter.format(number);
    }
}
