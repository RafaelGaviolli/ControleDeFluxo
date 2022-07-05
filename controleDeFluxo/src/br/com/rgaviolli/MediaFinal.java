package br.com.rgaviolli;

import java.util.Scanner;

public class MediaFinal {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        int media;


        System.out.println("Digite sua primeira nota: ");
        nota1 = s.nextInt();

        System.out.println("Digite sua segunda nota: ");
        nota2 = s.nextInt();

        System.out.println("Digite sua terceira nota: ");
        nota3 = s.nextInt();

        System.out.println("Digite sua quarta nota: ");
        nota4 = s.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;


        if (media >= 7) {
            System.out.println("Sua media seria: " + media + ", esta aprovado!");
        } else if (media >= 5 ) {
            System.out.println("Sua media seria: " + media + ", esta de recuperacao!");
        }
        if (media <= 4) {
            System.out.println("Sua media seria: " + media + ", esta reprovado!");
        }
    }
}

