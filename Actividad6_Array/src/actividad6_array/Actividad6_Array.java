/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6_array;

/**
 *
 * @author omarmora
 */
public class Actividad6_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Array = new int[20];
        System.out.println("Arreglo aleatorio generado: ");
        for (int x = 0; x < 20; x++) {
            Array[x] = (int) (Math.random() * 100 + 1);
            System.out.print(" " + Array[x]);
        }
        
        Arreglo Enviar = new Arreglo();
        Enviar.SeparaParesImpares(Array);
    }

}
