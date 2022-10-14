import java.util.Scanner;
public class Ejercicio4{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas en una semana");
        double horas = sc.nextDouble();
        if (horas>=41){
            System.out.printf("Tu salario semanal es de " + horas*5*16);
        }
        else {
            System.out.printf("Tu salario semanal es de " + horas*5*12);
        }
    sc.close();
    }
}