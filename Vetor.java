import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INPUTANDO ELEMENTO EM UM VETOR E PECORRENDO A ESTES ELEMENTOS");
        System.out.println();
        System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR ? ");
        int N = sc.nextInt();
        
        double[] vet = new double[N];
        
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println("NUMEROS DIGITADOS: ");
        for (int i = 0; i < N; i++) {
            System.out.println(String.format("%.1f", vet[i]));
        }

        System.out.println("ELEMENTOS DE NUMEROS PARES: ");
        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                System.out.println(vet[i]);
            }
        }

        System.out.println("ELEMENTOS DE NUMEROS IMPARES: ");
        for (int i = 0; i < N; i++) {
            if (vet[i] %2 != 0) {
                System.out.println(vet[i]);
            }
        }
        System.out.println("Finalizado com sucesso!!");
        
        sc.close();

    }
}