package Ex008;

import java.util.Scanner;

public class Ex008Min {
    public static void main(String[] args){
        int aux = 0;
        int num = 0;
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int saque = Integer.parseInt(valor.nextLine());
 
        System.out.println("Nota(s) de R$200: " + saque/200);
        aux = saque%200;
        System.out.println("Nota(s) de R$100: " + aux/100);
        aux = aux%100;
        System.out.println("Nota(s) de R$50: " + aux/50);
        aux = aux%50;
        System.out.println("Nota(s) de R$25: " + aux/25);
        aux = aux%25;
        System.out.println("Nota(s) de R$10: " + aux/10);
        aux = aux%10;
        System.out.println("Nota(s) de R$5: " + aux/5);
        aux = aux%5;
        System.out.println("Nota(s) de R$2: " + aux/2);
        aux = aux%2;
        System.out.println("Moeda(s) de R$1: " + aux/1);
    }
}