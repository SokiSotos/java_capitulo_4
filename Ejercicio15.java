import java.util.Scanner;
public class Ejercicio15{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra, numero o simbolo");
        String i = sc.next();
        System.out.println("¿Hacia que lado quiere que apunte el vertice de la piramide?");
        System.out.println("1. Arriba");
        System.out.println("2. Abajo");
        System.out.println("3. Izquierda");
        System.out.println("4. Derecha");
        int posicion = sc.nextInt();
        switch (posicion){
            case 1:
                System.out.println("    "+i);
                System.out.println("   "+i+i+i);
                System.out.println("  "+i+i+i+i+i);
                System.out.println(" "+i+i+i+i+i+i+i);
                System.out.println(""+i+i+i+i+i+i+i+i+i);
                break;
            case 2:
                System.out.println(""+i+i+i+i+i+i+i+i+i);
                System.out.println(" "+i+i+i+i+i+i+i);
                System.out.println("  "+i+i+i+i+i);
                System.out.println("   "+i+i+i);
                System.out.println("    "+i);
                break;
            case 3:
                System.out.println("      "+i);
                System.out.println("    "+i+" "+i);
                System.out.println("  "+i+" "+i+" "+i);
                System.out.println(""+i+" "+i+" "+i+" "+i);
                System.out.println("  "+i+" "+i+" "+i);
                System.out.println("    "+i+" "+i);
                System.out.println("      "+i);
                break;
            case 4:
                System.out.println(i);
                System.out.println(i+" "+i);
                System.out.println(i+" "+i+" "+i);
                System.out.println(i+" "+i+" "+i+" "+i);
                System.out.println(i+" "+i+" "+i);
                System.out.println(i+" "+i);
                System.out.println(i);
                break;                            
        }
    sc.close();
    }
}