import java.util.Scanner;
public class Ejercicio17{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        long num = sc.nextLong();
        System.out.println("La ultima cifra del numero introducido es: " + num%10);
    sc.close();
    }
}