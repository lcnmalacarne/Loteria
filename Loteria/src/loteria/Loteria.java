package loteria;

import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        int[] valores = new int[]{0, 0, 0, 0, 0, 0};
        imprimeVetor(valores);
//        int[] valores2;
//        valores2 = new int [6];
//        valores2[1] = 0; 
//        valores2[2] = 0; 
//        valores2[3] = 0; 
//        valores2[4] = 0; 
//        valores2[5] = 0; 
//        valores2[6] = 0; 

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 6 números");
        for (int i = 0; i < 6; i++) {
            int num = -1;
            while (num == -1) {
                num = capNum(in, i);
                for (int j = 0; j < -1; j++) {
                    if (valores[j] == num) {
                        num = -1;
                    }

                }

            }
            valores[i] = num;
            imprimeVetor(valores);
        }
    }

    public static int capNum(Scanner in, int i) {
        System.out.println("Digite o " + (i + 1) + "° número");
        int num = in.nextInt();
        if (num >= 1 && num <= 60) {
            return num;
        } else {
            return -1;
        }
    }

    public static void imprimeVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");

        }

        System.out.println("");
    }
}
