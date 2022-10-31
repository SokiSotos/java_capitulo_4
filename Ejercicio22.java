import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
      String dia = sc.next();
      int diaNumerico = 0;
      switch(dia) {
        case "lunes":
          diaNumerico = 0;
          break;
        case "martes":
          diaNumerico = 1;
          break;
        case "miercoles":
          diaNumerico = 2;
          break;
        case "jueves":
          diaNumerico = 3;
          break;
        case "viernes":
          diaNumerico = 4;
          break;
        default:
          System.out.print("El día introducido no es correcto.");
      }
      System.out.println("A continuación introduzca la hora (hora y minutos)");
      System.out.print("Hora: ");
      int horas = sc.nextInt();
      System.out.print("Minutos: ");
      int minutos = sc.nextInt();
      int minutosTotales = (4 * 24 * 60) + (15 * 60);
      int minutosActuales = (diaNumerico * 24 * 60) + (horas * 60) + minutos;
      System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
    sc.close();  
    }
  }