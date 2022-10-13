import java.util.Scanner;
public class Ejercicio3{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7:");
        int num = sc.nextInt();
        String dia;
        switch (num) {
            case 1:
                dia = "Es Lunes";
                break;
            case 2:
                dia = "Es Martes";
                break;
            case 3:
                dia = "Es Miercoles";
                break;
            case 4:
                dia = "Es Jueves";
                break;
            case 5:
                dia = "Es Viernes";
                break;
            case 6:
                dia = "Es Sabado";
                break;
            case 7:
                dia = "Es Domingo";
                break;
            default:
                dia = "Numero no válido";
                break;
        }
            System.out.println(dia);
    sc.close();
    }
}