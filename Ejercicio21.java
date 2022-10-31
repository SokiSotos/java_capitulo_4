import java.util.Scanner;
public class Ejercicio21{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen");
        double n1 = sc.nextDouble();
        System.out.println("Introduce la nota del segundo examen");
        double n2 = sc.nextDouble();
        double media = ((n1 + n2) / 2);
        if (media>=5)
            System.out.printf("Su nota media es de %.1f y esta aprobado",media);
        else if (media<5){
            System.out.println("Por favor introduzca si es apto o no su examen de recuperacion(apto/no apto)");
            String recu = sc.next();
            if (recu.equals("apto"))
                System.out.println("Su nota es un 5");
            else 
                System.out.printf("Su nota media es de %.1f y esta suspenso\n",media);
        }
    sc.close();
    }
}