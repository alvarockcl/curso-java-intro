package cl.fuentes.app;

import java.io.IOException;
import java.util.Scanner;

// java -cp target/02-ObtenerDatosConsola-1.0-SNAPSHOT.jar cl.fuentes.app.App

public class App 
{
    public static void main( String[] args ) throws IOException
    {

        // Stdin

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena");
        String myString = scanner.next();
        System.out.println("Ingresa un numero");
        int myInt = scanner.nextInt();
        
        System.out.println("Mi cadena es: " + myString);
        System.out.println("Mi numero es: " + myInt);
        System.out.println("------------------------------------------");

        System.in.read();

        // Clase scanner para leer datos desde la consola
        Scanner scanner1 = new Scanner(System.in);
        int x, y;
        String z;
        System.out.println("Ingrese un numero: ");
        x =(scanner1.nextInt());
        System.out.println("Ingrese otro numero: ");
        y =(scanner1.nextInt());
        System.out.println("Ingrese una palabra :");
        z=(scanner1.next());
        System.out.println("El primer numero es: " + x);
        System.out.println("El segundo numero es " + y);
        System.out.println("La palabra es: " + z);
       
        

        if(z.equals("alvaro")){
            System.out.println("La cadena es igual a " + z);
        }

        scanner.close();
        scanner1.close();
        
        System.in.read();

    }
}
