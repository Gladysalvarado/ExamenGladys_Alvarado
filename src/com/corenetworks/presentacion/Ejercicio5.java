package com.corenetworks.presentacion;

public class Ejercicio5 {
    public static void main(String[] args) {
String frase= "nunca mates una mosca sobre en la cabeza de un tigre";


        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("Extraer sobre (" + frase.substring(frase.indexOf("sobre"),frase.indexOf("sobre")+"sobre".length())+")");
        System.out.println(frase.indexOf("m"));
        System.out.println(frase.length());







    }
}
