import java.util.Scanner;
public class Ejercicio16{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String res;
        int nota=0;
        System.out.println("Pregunta 1");
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

        System.out.println("Pregunta 2");
        System.out.println("Ha aumentado sus gastos de vestuario.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

        System.out.println("Pregunta 3");
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

        System.out.println("Pregunta 4");
        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

        System.out.println("Pregunta 5");
        System.out.println("No te deja que mires la agenda de su teléfono móvil.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

        System.out.println("Pregunta 6");
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

        System.out.println("Pregunta 7");
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

        System.out.println("Pregunta 8");
        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

         System.out.println("Pregunta 9");
        System.out.println("Has notado que últimamente se perfuma más.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }

        System.out.println("Pregunta 10");
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        res = sc.next();
            if(res.equals("verdadero")){
                nota+=3;
            }
        
        if(nota>=22){
            System.out.println("Ha conseguido " + nota + " Puntos. " + "¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }
        else if (nota>=11){
            System.out.println("Ha conseguido " + nota + " Puntos. " + "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }
        else if (nota>=0){
            System.out.print("Ha conseguido " + nota + " Puntos. " + "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.");
            System.out.println(" Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
    sc.close();
    }
}