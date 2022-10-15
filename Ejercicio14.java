import java.util.Scanner;
public class Ejercicio14{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero.");
        int n = sc.nextInt();
        if((n%2)==0){
            System.out.print("El número es par");
        } 
        else{
            System.out.print("El número es impar");
        }
        if((n%5)==0){
            System.out.println(" y divisible entre 5.");
        }
        else{
            System.out.println(" y no es divisible entre 5.");
        }
    sc.close();
    }
}