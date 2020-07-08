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
public class Arreglo {

    public static int SeparaParesImpares(int[] Arreglo) {
        System.out.println("\nArreglo ordenado por Pares e Impares");
        for (int x = 0; x < 20; x++) {
            if (Arreglo[x] % 2 == 0) {
                System.out.print(" " + Arreglo[x]);
            }
        }
        for (int x = 0; x < 20; x++) {
            if (Arreglo[x] % 2 != 0) {
                System.out.print(" " + Arreglo[x]);
            }
        }
        return 0;
    }
}
