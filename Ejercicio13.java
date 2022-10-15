import java.util.Scanner;
public class Ejercicio13{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero.");
        int n1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero.");
        int n2 = sc.nextInt();
        System.out.println("Introduzca el tercer numero.");
        int n3 = sc.nextInt();
        int temp;
        if(n1>n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }
        if(n2>n3){
            temp=n2;
            n2=n3;
            n3=temp;
        }
        if(n1>n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }
        System.out.println("El orden de menor a mayor es " + n1 + ", " + n2 + ", " + n3); 
    sc.close();
    }
}