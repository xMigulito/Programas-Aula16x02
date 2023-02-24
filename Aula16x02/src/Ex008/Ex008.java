package Ex008;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args){
        int cedula200 = 0;
        int cedula100 = 0;
        int cedula50 = 0;
        int cedula25 = 0;
        int cedula10 = 0;
        int cedula5 = 0;
        int cedula2 = 0;
        int cedula1 = 0;
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        int saque = Integer.parseInt(valor.nextLine());
        while(saque != 0){
            if(saque >= 200){
                cedula200 += 1;
                saque -= 200;
            }
            else{
                if(saque >= 100){
                    cedula100 += 1;
                    saque -= 100;
                }
                else{
                    if(saque >= 50){
                        cedula50 += 1;
                        saque -= 50;
                    }
                    else{
                        if(saque >= 25){
                            cedula25 += 1;
                            saque -= 25;
                        }
                        else{
                            if(saque >= 10){
                                cedula10 += 1;
                                saque -= 10;
                            }
                            else{
                                if(saque >= 5){
                                    cedula5 += 1;
                                    saque -= 5;
                                }
                                else{
                                    if(saque >= 2){
                                        cedula2 += 1;
                                        saque -= 2;
                                    }
                                    else{
                                        cedula1 += 1;
                                        saque -= 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Nota(s) de R$200: " + cedula200);
        System.out.println("Nota(s) de R$100: " + cedula100);
        System.out.println("Nota(s) de R$50: " + cedula50);
        System.out.println("Nota(s) de R$25: " + cedula25);
        System.out.println("Nota(s) de R$10: " + cedula10);
        System.out.println("Nota(s) de R$5: " + cedula5);
        System.out.println("Nota(s) de R$2: " + cedula2);
        System.out.println("Moeda(s) de R$1: " + cedula1);

    }
}
