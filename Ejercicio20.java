import java.util.Scanner;
public class Ejercicio20{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        boolean capicua=false;
        if(num<10){
            capicua=true;
        }
        if((num>=10)&&(num<100)){
            if((num/10)==(num%10)){
            capicua=true;
            }
        }
        if((num>=100)&&(num<1000)){
            if((num/100)==(num%10)){
            capicua=true;
            }
        }
        if((num>=1000)&&(num<10000)){
            if(((num/1000)==(num%10))&&(((num/100)%10)==((num/10)%10))){
            capicua=true;
            }
        }
        if(num>=10000){
            if(((num/10000)==(num%10))&&((((num/1000)%10))==((num/10)%10))){
            capicua=true;
            }
        }
        if(capicua){
            System.out.println("El numero introducido es capicua.");
        } 
        else{
            System.out.println("El numero introducido no es capicua.");
        }
    sc.close();
    }
}
