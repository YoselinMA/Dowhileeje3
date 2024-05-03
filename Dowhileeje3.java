import java.util.Scanner;

public class Dowhileeje3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numero");
        numero = sc.nextInt();

        do {
            System.out.println("El numero ahora es: " + numero);
            numero--;
        } while(numero >=1 );

    }
    
}
