import java.util.Scanner;
public class Ejercicio9{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca el valor de a:");
        double a = sc.nextDouble();
        System.out.println("Por favor, introduzca el valor de b:");
        double b = sc.nextDouble();
        System.out.println("Por favor, introduzca el valor de c:");
        double c = sc.nextDouble();
        if ((a == 0) && (b == 0) && (c == 0)) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        }
        else if ((a == 0) && (b == 0) && (c != 0)) {
            System.out.println("La ecuación no tiene solución.");
        }
        else if ((a != 0) && (b != 0) && (c == 0)) {
            System.out.println("x1 = 0");
            System.out.println("x2 = " + (-b / a));
        }
        else if ((a == 0) && (b != 0) && (c != 0)) {
            System.out.println("x1 = x2 = " + (-c / b));
        }
        else if ((a != 0) && (b != 0) && (c != 0)) {
        }   
        double discriminante = b*b - (4 * a * c);
        if (discriminante < 0) {
                System.out.println("La ecuación no tiene soluciones reales");
        }
        else{
            System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
        }
    sc.close();
    }
}