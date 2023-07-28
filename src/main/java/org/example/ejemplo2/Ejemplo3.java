package org.example.ejemplo2;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Ejemplo3 {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        System.out.println("Digita al temperatura actual");


        Double temperaturaAmbiente=teclado.nextDouble();

        String temperatura=temperaturaAmbiente.toString();

        switch (temperatura){
            case "20.0":
                temperaturaAmbiente=25.0;
                break;
            case "30.0":
                temperaturaAmbiente=20.0;
                break;
            case "40.0":
                temperaturaAmbiente=20.0;
                System.out.println("Alerta temperatura");
                break;

                default:
                    System.out.println("Digite su temperatura");
                    temperaturaAmbiente=teclado.nextDouble();



        }


    }
}
