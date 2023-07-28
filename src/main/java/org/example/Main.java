package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner teclado=new Scanner(System.in);

        //**Declarando variables.

        Double temperaturaAmbiente;

        //inicializar variables.

        System.out.println(":");
        temperaturaAmbiente=teclado.nextDouble();

        if (temperaturaAmbiente==20.0 ){
            temperaturaAmbiente=25.0;
            System.out.println("Apreciado usuario nivel aire correcto: ");

        }else if (temperaturaAmbiente==30.0){
            temperaturaAmbiente=20.0;


        } else if (temperaturaAmbiente==40.0) {
            temperaturaAmbiente=20.0;
            System.out.println("Apreciado usuario nivel aire correcto: ");

        } else{
            System.out.println("Apreciado usuario ingrese nivel del aire a su gusto");
            temperaturaAmbiente=teclado.nextDouble();
        }
        System.out.println("Apreciado usuario nivel aire correcto" +temperaturaAmbiente);
    }


}
