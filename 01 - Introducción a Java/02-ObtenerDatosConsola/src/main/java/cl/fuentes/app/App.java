package cl.fuentes.app;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        // Clase scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);
        int x, y;
        String z;
        System.out.println("Ingrese un numero: ");
        x =(scanner.nextInt());
        System.out.println("Ingrese otro numero: ");
        y =(scanner.nextInt());
        System.out.println("Ingrese una palabra :");
        z=(scanner.next());
        System.out.println("El primer numero es: " + x);
        System.out.println("El segundo numero es " + y);
        System.out.println("La palabra es: " + z);
        scanner.close();

    }
}
