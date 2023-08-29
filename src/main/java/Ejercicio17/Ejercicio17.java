package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        double Radioc, Area, Perimetro;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        Radioc = entrada.nextDouble();
        Area = Math.PI*(Radioc*Radioc);
        Perimetro = 2*Math.PI*Radioc;
        System.out.println("El area del circulo es: "+Math.round(Area * 100.0)/100.0);
        System.out.println("El perimetro del circulo es: "+Math.round(Perimetro * 100.0)/100.0);    
        
    }
}
