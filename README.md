//exercicio calculadora basica
package exercicio;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        float soma;


        Scanner scan = new Scanner(System.in);
        System.out.println("-Escolha uma opção-");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int opcao = scan.nextInt();


        switch(opcao){
            case 1:
            System.out.println("Digite um Numero: ");
            float num1 = scan.nextInt();
            System.out.println("Digite outro Numero: ");
            float num2 = scan.nextInt();
            soma = num1 + num2;
             System.out.println("Resultado: "+ soma);
             break;
             
            case 2:
            System.out.println("Digite um Numero: ");
            float num3 = scan.nextInt();
            System.out.println("Digite outro Numero: ");
            float num4 = scan.nextInt();
            soma = num3 - num4;
             System.out.println("Resultado: "+ soma);
             break;

             case 3:
            System.out.println("Digite um Numero: ");
            float num5 = scan.nextInt();
            System.out.println("Digite outro Numero: ");
            float num6 = scan.nextInt();
            soma = num5 * num6;
             System.out.println("Resultado: "+ soma);
             break;

             case 4:
            System.out.println("Digite um Numero: ");
            float num7 = scan.nextInt();
            System.out.println("Digite outro Numero: ");
            float num8 = scan.nextInt();
            soma = num7 / num8;
             System.out.println("Resultado: "+ soma);
             break;
             default:
             


