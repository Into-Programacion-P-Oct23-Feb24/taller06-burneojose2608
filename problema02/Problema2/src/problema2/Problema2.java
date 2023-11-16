package problema2;

import java.util.Locale;
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String vehiculo;
        double peaje;
        double valor;
        
        System.out.println("Cual es su nombre?");
        nombre = entrada.nextLine();
        System.out.println("Escriba el tipo de vehiculo");
        vehiculo = entrada.nextLine();
        switch (vehiculo){
            case "tipo 1":
                peaje = 2.0;
                valor = (25000 * 0.01) / 100 + 2;
                System.out.printf("Peaje 'Buena Via'\nPropietario: %s\nTipo: %s\nValor: %s\nPeaje: %s", nombre, vehiculo, valor, peaje );
                break;
        
            case "tipo 2":
                peaje = 2.5;
                valor = (25000 * 0.02) / 100 + 2.5;
                System.out.printf("Peaje 'Buena Via'\nPropietario: %s\nTipo: %s\nValor: %s\nPeaje: %s", nombre, vehiculo, valor, peaje );
                break;
                
            case "tipo 3":
                peaje = 1.5;
                valor = (25000 * 0.04) / 100 + 1.5;
                System.out.printf("Peaje 'Buena Via'\nPropietario: %s\nTipo: %s\nValor: %s\nPeaje: %s", nombre, vehiculo, valor, peaje );
                break;   
            case "tipo 4":
                peaje = 2.2;
                valor = (25000 * 0.05) / 100 + 2.2;
                System.out.printf("Peaje 'Buena Via'\nPropietario: %s\nTipo: %s\nValor: %s\nPeaje: %s", nombre, vehiculo, valor, peaje );
                break;    
        }
    }
    
}
