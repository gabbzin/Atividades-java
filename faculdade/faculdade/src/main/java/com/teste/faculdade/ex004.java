package com.teste.faculdade;

import java.util.Scanner;
/*
Escreva um programa para determinar a quantidade de
cavalos necessários para se levantar uma massa de m
quilogramas a uma altura de h metros em t segundos.
Considere cavalos = (m * h / t) / 745,6999
*/

public class ex004 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a massa: ");
            double massa = sc.nextDouble();

            System.out.print("Digite a altura (em metros): ");
            double altura = sc.nextDouble();

            System.out.print("Digite o tempo (em segundos:) ");
            int tempo = sc.nextInt();

            sc.close();

            double cavalos = (int) Math.ceil ((massa * altura / tempo) / 745.6999);

            System.out.print("Serão necessários" + cavalos);
        }
    }
}
