package ex002;

public class Ex002 {
    public static void main(String[] args){
        int[] lista = {1,2,3,4,5,6,7,8};
        for (int i : lista){
            int max = 100;
            int min = 0;
            int nb = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(nb);
            int escolha = nb % 2;
            switch(escolha){
                case 0:{
                    System.out.println(" = É par");
                    break;
                }
                case 1:{
                    System.out.println(" = É impar");
                    break;
                }
                        
                
        }
    }
    }
}
