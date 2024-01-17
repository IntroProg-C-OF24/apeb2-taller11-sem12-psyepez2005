package taller11;
public class Problema05 {
    public static void main(String[] args) {
        int fil=3, col=3;
        int matriz1 [][]= new int [fil][col];
        int matriz2 [][]= new int [fil][col];
        int matriz3 [][]= new int [fil][col];
        generarMat(matriz1, fil, col);   
        generarMat(matriz2, fil, col);
        System.out.println("MATRIZ A \n"+imprimirMat(matriz1, fil, col));
        System.out.println("MATRIZ B \n"+imprimirMat(matriz2, fil, col));
        suma(matriz1, matriz2, matriz3, fil, col);
        System.out.println("SUMA \n" + imprimirMat(matriz3, fil, col));
        resta(matriz1, matriz2, matriz3, fil, col);
        System.out.println("RESTA \n" + imprimirMat(matriz3, fil, col));
        multiplicarMatrices(matriz1, matriz2, matriz3, fil, col);
        System.out.println("MULTIPLICACION \n" + imprimirMat(matriz3, fil, col));
    } 
    public static void generarMat (int matriz [][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);  
            }     
        }
    }   
    public static String imprimirMat (int matriz [][], int limF, int limC){
        String cadena="";
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                cadena += String.format("%d\t" , matriz[i][j]);
            }
            cadena += "\n";
        }
        return cadena;
    } 
    public static void suma (int matrizA[][], int matrizB[][], int matrizC[][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }     
        }
    }  
    public static void resta (int matrizA[][], int matrizB[][], int matrizC[][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
            }     
        }
    }
    public static void multiplicarMatrices(int matrizA[][], int matrizB[][], int matrizC[][], int limF, int limC) {
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                for (int k = 0; k < limF; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
    }
}