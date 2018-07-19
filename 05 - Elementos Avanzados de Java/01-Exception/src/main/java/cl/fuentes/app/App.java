package cl.fuentes.app;

import java.io.File;
import java.io.FileReader;

// java -cp target/01-Exception-1.0-SNAPSHOT.jar cl.fuentes.app.App

public class App 
{
    public static void main( String[] args )
    {

        // Estructura de una excepcion
        try{
            
            //throw new Exception("Error");

            //Integer.parseInt("Valor");

            double div = 10 / 0;

            //File archivo = new File("C://archivo.txt");
            //FileReader contenidoArchivo = new FileReader(archivo);
            
        }catch(Exception e){
            System.out.println("Bloque que se ejecuta si se produce una excepcion : " + e.getMessage());
            //System.exit(0);
        }finally{
            System.out.println("Bloque que se ejecuta igual si se produce o no una excepcion");
        }
    }

}
