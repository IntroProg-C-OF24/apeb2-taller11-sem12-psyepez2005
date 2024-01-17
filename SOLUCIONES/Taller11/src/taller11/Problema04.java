package taller11;
import java.util.Scanner;
public class Problema04 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        String name, ced;
        double kV, kvConsum,  mueble; 
        int opcion;
        System.out.println("INGRESE SU NOMBRE ");
        name = put.nextLine();
        System.out.println("INGRESE SU N DE CEDULA");
        ced = put.nextLine();
        System.out.println("ESCRIBA 1 PARA GENERAR LA PLANTILLA DE LUZ");
        System.out.println("ESCRIBA 1 PARA GENERAR EL PREDIO DE UN BIEN");
        opcion = put.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("VALOR DEL KILOVATIO");
                kV = put.nextDouble();
                System.out.println("KILOVATIOS CONSUMIDOS");
                kvConsum = put.nextDouble();
                System.out.println("Cliente " + name + " con cedula " + ced + " debe cancelar el valor de: " + planillaLuz(kV, kvConsum));
                break;
            case 2:
                System.out.println("Ingrese el valor del inmueble");
                mueble = put.nextDouble();
                System.out.println("Cliente " + name + " con cedula " + ced + " y tiene que pagar de predio: "+ predioInmueble(mueble));
                break;
        }
    }
    public static double planillaLuz(double kilovatio, double kilovatMes) {
        double plantilla;
        plantilla = kilovatio * kilovatMes;
        return plantilla;

    }
    public static double predioInmueble(double inmueble) {
        double predio;
        predio = inmueble * 0.2;
        return predio;
    }
}