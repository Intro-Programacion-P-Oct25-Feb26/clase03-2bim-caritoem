/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma;
        String[] nombres = new String[5];
        double[][] produccion = new double[5][12];
        double[] total = new double[5];
        int mayor_produccion = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre:" + (i + 1));
            nombres[i] = entrada.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            suma = 0;
            System.out.println("Produccion del mes de: " + nombres[i]);
            for (int c = 0; c < 12; c++) {
                System.out.print("Mes " + (c + 1) + ": $");
                produccion[i][c] = entrada.nextDouble();
                suma += produccion[i][c];
            }
            total[i] = suma;
        }
        for (int i = 1; i < 5; i++) {
            if (total[i] > total[mayor_produccion]) {
                mayor_produccion = i;
            }
        }
        System.out.printf(
                "AnalisisProduccion\n" + "Nombre Estacion 1 - Total Produccion: $%.2f\n"
                + "Nombre Estacion 2 - Total Produccion: $%.2f\n"
                + "Nombre Estacion 3 - Total Produccion: $%.2f\n"
                + "Nombre Estacion 4 - Total Produccion: $%.2f\n"
                + "Nombre Estacion 5 - Total Produccion: $%.2f\n\n"
                + "Estacion mas productiva: Nombre Estacion %d\n"
                + "Encargado de la estacion: %s\n"
                + "Cantidad de la estación más productiva: $%.2f\n",
                total[0], total[1], total[2], total[3], total[4],
                (mayor_produccion + 1), nombres[mayor_produccion], total[mayor_produccion]
        );
    }
}
}
}
}
}
}
