import java.util.Scanner;
public class Ejercicio7{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su primera nota.");
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca su segunda nota.");
        double nota2 = sc.nextDouble();
        System.out.println("Introduzca su tercera nota.");
        double nota3 = sc.nextDouble();
        double notam = (nota1+nota2+nota3)/3;
            System.out.printf("Su nota media es de: %.1f",notam);
    sc.close();
    }
}