import java.util.Scanner;
public class Ejercicio2{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora");
        int hora = sc.nextInt();
        if (hora>=21 || hora<=5){
            System.out.println("Buenas Noches!");
        }
        else if (hora>=13){
            System.out.println("Buenas Tardes!");
        }
        else if (hora>=6){
            System.out.println("Buenos Dias!");
        }
    sc.close();
    }
}