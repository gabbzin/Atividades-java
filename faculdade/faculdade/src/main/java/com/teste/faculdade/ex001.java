package com.teste.faculdade;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double maiorAltura = 0;
            double menorAltura = 0;
            double mediaAlturaHomens = Double.MAX_VALUE;
            int numeroMulheres = 0;
            int numeroHomens = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o sexo da pessoa: [f/m]");
                String sexo = sc.next();

                System.out.print("Digite a altura da pessoa: ");
                double altura = sc.nextDouble();

                if ("f".equals(sexo)){
                    numeroMulheres++;
                } else {
                    numeroHomens++;
                    mediaAlturaHomens += altura;
                }

                if(altura > maiorAltura){
                    maiorAltura = altura;
                }
                if (altura < menorAltura){
                    menorAltura = altura;
                }
            }

            mediaAlturaHomens = (numeroHomens > 0) ? (mediaAlturaHomens / numeroHomens) : 0;

            sc.close();

            System.out.print(maiorAltura);
            System.out.print(menorAltura);
            System.out.print(mediaAlturaHomens);
            System.out.print(numeroMulheres);
        }
    }
}
