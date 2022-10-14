import java.util.Scanner;
public class Ejercicio5{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a:");
        double a = sc.nextDouble();
        System.out.println("Por favor, introduzca el valor de b:");
        double b = sc.nextDouble();
        if (a==0){
            System.out.println("Esa ecuación no tiene solución real.");
        } 
        else{
            System.out.println("x = " + (-b/a));
        }
    sc.close();
    }
}