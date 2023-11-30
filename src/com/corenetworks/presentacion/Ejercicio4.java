package com.corenetworks.presentacion;

public class Ejercicio4 {
    public static void main(String[] args) {

        int numMayor= 0;
        int numMenor= 0;
        int contadorMayor=0;
        int contadorMenor=0;
        int [] numeros;

        numeros = new int[]{2, -4, -13, 1, -3, 15, 1, 9, 6, -8, 4, 23, 7, -13, 13, 23, 15, -13, 9, 0};
        for (int i = 0; i< numeros.length; i++){
            if (numeros[i]>numMayor){
                numMayor = numeros[i];
                contadorMenor++;
            }else if (numeros[i]<numMenor){
                numMenor= numeros[i];
                contadorMayor++;
            }
        }
        System.out.println("El mayor es: "+numMayor+" y se repite "+contadorMayor+" veces");
        System.out.println("El menor es: "+numMenor+" y se repite "+contadorMenor+" veces");
    }
}
