import java.util.Scanner;
public class Ejercicio6{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cálculo del tiempo de caída de un objeto.");
        System.out.println("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        double altura = sc.nextDouble();
        double g = 9.81;
        double caida = Math.sqrt(2*altura/g);
            System.out.printf("El objeto tarda %.2f segundos en caer.", caida);
    sc.close();
    }
}