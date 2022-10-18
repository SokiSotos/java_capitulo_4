import java.util.Scanner;
public class Ejercicio19{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int num1=0;
        if (num<10){
            num1=1;
        }
        if ((num>=10)&&(num<100)){
            num1=2;
        }
        if ((num>=100)&&(num<1000)){
            num1=3;
        }
        if((num>=1000)&&(num<10000)){
            num1=4;
        }
        if (num>=10000){
            num1=5;
        }
        if (num1==1){
        System.out.println("El número introducido tiene 1 cifra");
        } 
        else {
        System.out.println("El número introducido tiene " + num1 + " cifras");
        }
    sc.close();
    }
}