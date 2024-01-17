package taller11;
public class Problema01 {
    public static void main(String[] args) {
        int fil=3, col=3;
        String pares="",impares="";
        int matriz[][]=new int[fil][col];
        llenarMatriz(matriz,fil, col);
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("Pares: "+separarPares( matriz,  fil,  col, pares));
        System.out.println("Impares: "+separarImpares( matriz,  fil,  col, impares));
    }
    public static void llenarMatriz(int matriz[][], int fil, int col){
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j]=(int)(Math.random()*(10-1+1)+1);
            }
        }
    }
    public static String separarPares(int matriz[][], int fil, int col, String pares){
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if(matriz[i][j]%2==0)
                    pares=pares+matriz[i][j]+" ";
            }
        }
        return pares;
    }
    public static String separarImpares(int matriz[][], int fil, int col, String impares){
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if(matriz[i][j]%2!=0)
                    impares=impares+matriz[i][j]+" ";
            }
        }
        return impares;
    }
}