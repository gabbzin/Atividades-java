package com.teste.faculdade;

import java.util.Scanner;

// Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

public class ex002 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double totalSalario = 0;

            System.out.print("Digite a grade de funcionários da empresa: ");
            int gradeFuncionarios = sc.nextInt();

            for (int i = 0; i < gradeFuncionarios; i++) {
                System.out.print("Digite o " + i + "salário: ");
                double salario = sc.nextDouble();

                totalSalario += salario;
            }

            sc.close();

            double mediaSalarial = totalSalario / gradeFuncionarios;

            System.out.printf("A média salarial é: %.2f%n", mediaSalarial);
        }
    }
}
