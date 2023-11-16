/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valora;
        double valorb;
        double respuesta = 0;

        System.out.println("Ingrese que operacion va a realizar suma/resta/multip[licacion/division ");
        String operacion = entrada.nextLine();

        switch (operacion) {
            case "suma":
                System.out.println("ingrese el primer valor");
                valora = entrada.nextDouble();
                System.out.println("Ingrese el segundo valor");
                valorb = entrada.nextDouble();

                if (valora > valorb) {
                    respuesta = valora + valorb;
                } else {
                    System.out.println("El primer valor ingresado debe ser mayor al segundo valor");
                }
                break;

            case "resta":
                System.out.println("ingrese el primer valor");
                valora = entrada.nextDouble();
                System.out.println("Ingrese el segundo valor");
                valorb = entrada.nextDouble();

                if (valora > valorb) {
                    respuesta = valora - valorb;
                } else {
                    System.out.println("El primer valor ingresado debe ser mayor al segundo valor");
                }
                break;
            case "multiplicacion":
                System.out.println("ingrese el primer valor");
                valora = entrada.nextDouble();
                System.out.println("Ingrese el segundo valor");
                valorb = entrada.nextDouble();

                if (valora > valorb) {
                    respuesta = valora * valorb;
                } else {
                    System.out.println("El primer valor ingresado debe ser mayor al segundo valor");
                }
                break;
            case "division":
                System.out.println("ingrese el primer valor");
                valora = entrada.nextDouble();
                System.out.println("Ingrese el segundo valor");
                valorb = entrada.nextDouble();

                if (valora > valorb) {
                    respuesta = valora / valorb;
                } else {
                    System.out.println("El primer valor ingresado debe ser mayor al segundo valor");
                }
                break;
        }
        System.out.printf("El resultado es: %s", respuesta);
    }
}
