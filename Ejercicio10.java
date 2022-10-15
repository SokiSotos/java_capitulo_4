import java.util.Scanner;
public class Ejercicio10{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento:");
        int dia = sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento en numero (1 al 12):");
        int mes = sc.nextInt();
        String horoscopo;
        switch (mes){
            case 1:
                if(dia<21){
                    horoscopo = "Eres Capricornio";
                }
                else{
                    horoscopo = "Eres Acuario";
                }
                break;
            case 2:
                if(dia<20){
                    horoscopo = "Eres Acuario";
                }
                else{
                    horoscopo = "Eres Piscis";
                }
                break;
            case 3:
                if(dia<21){
                    horoscopo = "Eres Piscis";
                }
                else{
                    horoscopo = "Eres Aries";
                }
                break;
            case 4:
                if(dia<21){
                    horoscopo = "Eres Aries";
                }
                else{
                    horoscopo = "Eres Tauro";
                }
                break;
            case 5:
                if(dia<20){
                    horoscopo = "Eres Tauro";
                }
                else{
                    horoscopo = "Eres Geminis";
                }
                break;
            case 6:
                if(dia<22){
                    horoscopo = "Eres Geminis";
                }
                else{
                    horoscopo = "Eres Cancer";
                }
                break;
            case 7:
                if(dia<22){
                    horoscopo = "Eres Cancer";
                }
                else{
                    horoscopo = "Eres Leo";
                }
                break;
            case 8:
                if(dia<24){
                    horoscopo = "Eres Leo";
                }
                else{
                    horoscopo = "Eres Virgo";
                }
                break;
            case 9:
                if(dia<23){
                    horoscopo = "Eres Virgo";
                }
                else{
                    horoscopo = "Eres Libra";
                }
                break;
            case 10:
                if(dia<23){
                    horoscopo = "Eres Libra";
                }
                else{
                    horoscopo = "Eres Escorpio";
                }
                break;
            case 11:
                if(dia<23){
                    horoscopo = "Eres Escorpio";
                }
                else{
                    horoscopo = "Eres Sagitario";
                }
                break;
            case 12:
                if(dia<21){
                    horoscopo = "Eres Sagitario";
                }
                else{
                    horoscopo = "Eres Capricornio";
                }
                break;
            default:
                horoscopo = "Mes no válido";
                break;
        }
            System.out.println(horoscopo);
    sc.close();
    }
}