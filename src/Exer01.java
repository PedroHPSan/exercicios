import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros serão calculados? ");
        n = sc.nextInt();
        int numero, positivos=0, negativos=0;
        double media = 0, perNegativos, perPositivos;

        for(int i = 0; i < n; i++){
            int cont = i + 1;
            System.out.println("Digite o " + cont + " Numero");
            numero = sc.nextInt();
            if(numero > 0){
                positivos ++;
            }
            else{
                negativos ++;
            }
            media = numero + media;
        }

        media = media/n;
        perNegativos = (double) negativos/n  * 100;
        perPositivos = (double) positivos/n  * 100;

        System.out.println("A media aritimetica dos valores inseridos é " + media +
                "\nA Quantidade de valores negativos é " + negativos +
                " e seu percentual é " + perNegativos + "%\n" +
                "Já a quantidade de valores positivos é " + positivos +
                " e o percentual é " + perPositivos + "%");
        sc.close();
    }
}
