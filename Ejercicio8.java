import java.util.Scanner;
public class Ejercicio8{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su primera nota.");
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca su segunda nota.");
        double nota2 = sc.nextDouble();
        System.out.println("Introduzca su tercera nota.");
        double nota3 = sc.nextDouble();
        double notam = (nota1+nota2+nota3)/3;
        if(notam==10){
            System.out.printf("Su nota media es de: %.1f Tiene un sobresaliente!",notam);
        }
        else if (notam>=8){
            System.out.printf("Su nota media es de: %.1f Tiene un notable!",notam);
        }
        else if (notam>=6){
            System.out.printf("Su nota media es de: %.1f Tiene un bien!",notam);
        }
        else if (notam==5){
            System.out.printf("Su nota media es de: %.1f Tiene un suficiente",notam);
        }
        else{
            System.out.printf("Su nota media es de: %.1f Tiene un insuficiente",notam);
        }
    sc.close();
    }
}