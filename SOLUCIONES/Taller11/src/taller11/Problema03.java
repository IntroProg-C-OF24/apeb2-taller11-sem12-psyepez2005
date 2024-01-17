package taller11;
import java.util.Scanner;
public class Problema03 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        double datoA, datoB;
        System.out.println("ESCRIBIR 1 PARA CALCULAR EL AREA DE UN TRIANGULO");
        System.out.println("ESCRIBIR 2 PARA CALCULAR EL AREA DE UN CUADRADO");
        System.out.println("ESCRIBIR 3 PARA CALCULAR EL AREA DE UN RECTANGULO");
        int forma = put.nextInt();
        switch (forma) {
            case 1:
                System.out.println("BASE:");
                datoA = put.nextDouble();
                System.out.println("ALTURA:");
                datoB = put.nextDouble();
                System.out.println("AREA:" + triangulo(datoA, datoB));
                break;
            case 2:
                System.out.println("LADO: ");
                datoA = put.nextDouble();
                System.out.println("AREA:" + cuadrado(datoA));
                break;
            case 3:
                System.out.println("BASE: ");
                datoA = put.nextDouble();
                System.out.println("ALTURA: ");
                datoB = put.nextDouble();
                System.out.println("AREA: " + rectangulo(datoA, datoB));
                break;
        }
    }

    public static double triangulo(double num1, double num2) {
        double respuesta;
        respuesta = num1 * num2 / 2;
        return respuesta;
    }

    public static double cuadrado(double num1) {
        double respuesta;
        respuesta = Math.pow(num1, 2);
        return respuesta;
    }

    public static double rectangulo(double num1, double num2) {
        double respuesta;
        respuesta = num1 * num2;
        return respuesta;
    }
}