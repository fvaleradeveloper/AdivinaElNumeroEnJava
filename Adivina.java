import java.util.Scanner;
import java.util.Random;

public class Adivina {
    public static void main(String[] args) {
        System.out.println("Juego: Adivina el número");
        System.out.println("*************************");

        int aleatorio = new Random().nextInt(100);
        Scanner teclado = new Scanner(System.in);
        int intentosMaximos = 5;

        for (int intentoActual = 1; intentoActual <= intentosMaximos; intentoActual++) {
            System.out.print("Ingrese su número: ");
            int numero = teclado.nextInt();


            if (numero == aleatorio) {
                System.out.println("Felicitaciones, ¡lo descubrió en " + intentoActual + " intentos!");
                break;
            } else {
                if (numero < aleatorio) {
                    System.out.println("Aumente su apuesta");
                } else if (numero > aleatorio) {
                    System.out.println("Disminuya su apuesta");
                }

                System.out.println("Intente de nuevo porque perdió. Le quedan " + (intentosMaximos - intentoActual) + " intentos.");
            }
        }

        System.out.println(" El número desconocido es: " + aleatorio);

        teclado.close();
    }
}