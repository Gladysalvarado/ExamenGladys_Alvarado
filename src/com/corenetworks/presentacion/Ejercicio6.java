package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio6 {
    public static void main(String[] args) {
        Period edadP=Period.between(LocalDate.of(1992,8,30),LocalDate.now());
        System.out.println("Edad " +edadP.getYears());

        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(2024,3,15).plusMonths(2));





    }
}
