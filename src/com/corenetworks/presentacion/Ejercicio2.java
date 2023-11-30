package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero= 8;
        if (numero ==0){
            System.out.println("El número es 0");
        }else if (numero % 2== 0) {
            System.out.println("El número es positivo");
        }
        else {
            System.out.println("El número es negativo");
        }
    }
}