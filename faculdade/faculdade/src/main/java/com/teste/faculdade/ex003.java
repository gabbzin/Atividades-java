package com.teste.faculdade;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Leitura das medidas da parede
            System.out.print("Digite a altura da parede (hp): ");
            double hp = sc.nextDouble();

            System.out.print("Digite a largura da parede (lp): ");
            double lp = sc.nextDouble();

            // Leitura das medidas do azulejo
            System.out.print("Digite a altura do azulejo (ha): ");
            double ha = sc.nextDouble();

            System.out.print("Digite a largura do azulejo (la): ");
            double la = sc.nextDouble();

            // Cálculo da área da parede e do azulejo
            double areaParede = hp * lp;
            double areaAzulejo = ha * la;

            // Cálculo da quantidade de azulejos necessários (arredondando para cima)
            int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

            // Exibe o resultado
            System.out.println("A quantidade de azulejos necessários para cobrir a parede é: " + quantidadeAzulejos);
        }
    }
}
