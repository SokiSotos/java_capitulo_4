import java.util.Scanner;
public class Ejercicio18{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int primer=0;
        if(num<10){
            primer=num;
        }
        if((num>=10)&&(num<100)){
            primer=num/10;
        } 
        if((num>=100)&&(num<1000)){
            primer=num/100;
        } 
        if((num>=1000)&&(num<10000)){
            primer=num/1000;
        } 
        if(num>=10000){
            primer=num/10000;
        }
        System.out.println("El primer digito del numero introducido es: " + primer);
    sc.close();
    }
}