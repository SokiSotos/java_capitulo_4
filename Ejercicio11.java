import java.util.Scanner;
public class Ejercicio11{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las horas:");
        int horas = sc.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos = sc.nextInt();
        int sdia=86400;
        int stotal=sdia-((horas*60*60)+(minutos*60));
            System.out.println("Quedan " + stotal + " segundos para media noche");
        sc.close();
        }
    }