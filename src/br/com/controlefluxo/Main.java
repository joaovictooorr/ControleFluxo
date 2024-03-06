package br.com.controlefluxo;

import java.util.Scanner;

public class Main {

    public static void calculandoMedia(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int n1 = input.nextInt();
        System.out.print("Digite a segunda nota: ");
        int n2 = input.nextInt();
        System.out.print("Digite a terceira nota: ");
        int n3 = input.nextInt();
        System.out.print("Digite a quarta nota: ");
        int n4 = input.nextInt();

        int media = (n1 + n2 + n3 + n4 ) / 4;
        if(media >= 7){
            System.out.println("Aprovado " + media);
        } else if (media >= 5) {
            System.out.println("Recuperação " + media);

        } else{
            System.out.println("Reprovado " + media);
        }

    }


    public static void main(String [] args){

        calculandoMedia();

    }

}
