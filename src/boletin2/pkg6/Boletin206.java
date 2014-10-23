//Queremos el porcentaje de descuento de una compra, introduciendo el precio de la tarifa y el precio pagado.
package boletin2.pkg6;

import java.util.Scanner;

public class Boletin206 {

    public static void main(String[] args) {
        // Codigo de la aplicación.
        float t, p, d, c;
        //t=precio tarifa p=precio pagado c=calculo

        System.out.println("Precio Tarifa; ");
        Scanner dato = new Scanner(System.in);
        t = dato.nextFloat();
        System.out.println("Precio Pagado: ");
        p = dato.nextFloat();
        c = ((t - p) / t) * 100;
        System.out.println("Descuento: " + c + "%");
    }

}
