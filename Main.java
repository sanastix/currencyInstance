package com.sana;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double payment = Double.parseDouble(input);
        scanner.close();

        NumberFormat nfus = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfus.format(payment);

        DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
        String india = "Rs." + IndianCurrencyFormat.format(payment);

        NumberFormat nfchina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfchina.format(payment);

        NumberFormat nffrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nffrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
