package taller11;
import java.util.Scanner;
public class Problema02 {
    public static void main(String[] args) {
        int limEst=4;
        double resultado[]=new double[limEst];
        String names[]=new String[limEst];
        String resultadoCualit[]=new String[limEst];
        double n1, n2, n3, n4, promedio;
        String cualit="", name;
        Scanner put=new Scanner(System.in);
        for (int i = 0; i < limEst; i++) {
            System.out.println("Escriba el nombre");
            name = put.next();
            names[i]=name;
            System.out.println("Ingresar nota 1, nota 2, nota 3 y nota 4");
            n1 = put.nextDouble();
            n2 = put.nextDouble();
            n3 = put.nextDouble();
            n4 = put.nextDouble();
            promedio=(n1+n2+n3+n4)/4;
            resultado[i]=promedio;
            resultadoCualit[i]=resultCualit(resultado,limEst,promedio,cualit);
        }
        System.out.println("Nombre\t/Promedio\t/Cualitativo");
        for (int i = 0; i < limEst; i++) {
            System.out.println(names[i]+"\t"+resultado[i]+"\t\t"+resultadoCualit[i]);
        }
    }
    public static String resultCualit(double resultado[], int limEst, double promedio, String cualit){
        if(promedio>9)
            cualit = "Sobresaliente";
        else
            if(promedio>8)
                cualit = "Muy Bueno";
            else
                if(promedio>5)
                    cualit = "Bueno";
                else
                    cualit = "Regular";
        return cualit;
    }
}
