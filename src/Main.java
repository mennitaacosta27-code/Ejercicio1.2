import java.util.Scanner;
import java.util.Random;

public class  CalculadoraIMC{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite su peso:");
        double peso=scanner.nextDouble();

        System.out.println("Digite su altura:");
        double altura=scanner.nextDouble();

        double imc=peso/(altura*altura);
        System.out.println("Su IMC es: "+imc);
        System.out.println("Su estado de nutrición es: "+estadodeNutricion);

    }
    public static double calcularImc(double peso, double altura){
        return peso/Math.pow(altura,2);
    }
    public static String estadodeNutricion(double imc){
        if(imc<18.5){
            Sytem.out.println("Esta bajo de peso:");
        } else if (imc=18.5>=24.9){
            System.out.println("Peso Normal:");
        } else if (imc=25>=26.9) {
            System.out.println("Tiene un sobrepeso de grado 1:");
        } else if (imc=27>=29.9) {
            System.out.println("Tiene un sobrepeso de grado 2:");
        } else if (imc=30>=34.9) {
            System.out.println("Tiene obesidad tipo 1:");
        } else if (imc=35>=39.0) {
            System.out.println("Tiene obsidad tipo 2:");
        }else if(imc=40>=49.9){
            System.out.println("Tiene obesidad de tipo 3 morvida:");
        } else if (imc>50) {
            System.out.println("Tiene obesidad de tipo 4 extrema:");
        }
    }

}