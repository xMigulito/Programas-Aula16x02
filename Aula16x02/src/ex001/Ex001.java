package ex001;

public class Ex001 {

    public static void main(String[] args) {
        int[] lista = {1,2,3,4,5,6,7,8};// O importante é a quantidade de valores dentro, não precisa necessariamente estar em ordem, caso tenha 10_1, rodara 10x
        for (int i : lista){
            int max = 100;
            int min = 0;
            int nb = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(nb);
            if (nb % 2 == 0){
                System.out.println(" = É par");
            }
            else{
                System.out.println(" = É impar");
            }
        }
    }
    
}
