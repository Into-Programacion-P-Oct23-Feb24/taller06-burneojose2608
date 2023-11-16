package problema3;

import java.util.Locale;
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String empleado;
        double sueldo = 450;
        double total;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Digite el tipo de empleado es");
        empleado = entrada.nextLine();

        switch (empleado) {
            case "tipo 1":
                total = (sueldo * 5) / 100 + 5;
                System.out.printf("Nombre: %s\nTipo de empleado: %s\nSueldo basico: %s\nSueldo total: %s\n", nombre, empleado, sueldo, total);
                break;

            case "tipo 2":
                total = (sueldo * 0.5) + sueldo ;
                System.out.printf("Nombre: %s\nTipo de empleado: %s\nSueldo basico: %s\nSueldo total: %s\n", nombre, empleado, sueldo, total);
                break;

            case "tipo 3":
                total = (sueldo * 0.9) + sueldo;
                System.out.printf("Nombre: %s\nTipo de empleado: %s\nSueldo basico: %s\nSueldo total: %s\n", nombre, empleado, sueldo, total);
                break;
            case "tipo 4":
                total = (sueldo * 0.12) + sueldo;
                System.out.printf("Nombre: %s\nTipo de empleado: %s\nSueldo basico: %s\nSueldo total: %s\n", nombre, empleado, sueldo, total);
                break;
            case "tipo 5":
                total = (sueldo * 0.15) + sueldo;
                System.out.printf("Nombre: %s\nTipo de empleado: %s\nSueldo basico: %s\nSueldo total: %s\n", nombre, empleado, sueldo, total);
                break;
        }

    }

}
