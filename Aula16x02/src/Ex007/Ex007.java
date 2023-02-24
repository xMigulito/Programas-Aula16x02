package Ex007;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args){
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int num = Integer.parseInt(valor.nextLine());
        int soma = 0;
        while(num !=0 ){
            soma += num; 
            num -= 1;   
        }
        System.out.print("A soma total é " + soma);
    }
    
}