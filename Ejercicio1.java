import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día de la semana:");
        System.out.println("1: Lunes");
        System.out.println("2: Martes");
        System.out.println("3: Miércoles");
        System.out.println("4: Jueves");
        System.out.println("5: Viernes");
        int dia = sc.nextInt();
        String asignatura;
        switch (dia) {
            case 1:
                asignatura = "Los Lunes hay programación";
                break;
            case 2:
                asignatura = "Los Martes hay sistemas informáticos";
                break;
            case 3:
                asignatura = "Los Miercoles hay entornos de desarrollos";
                break;
            case 4:
                asignatura = "Los Jueves hay programación";
                break;
            case 5:
                asignatura = "Los Viernes hay formación y orientación laboral";
                break;
            default:
                asignatura = "Día no válido";
                break;
        }
            System.out.println(asignatura);
    sc.close();
    }
}