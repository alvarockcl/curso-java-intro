package cl.fuentes.app;

public class App 
{
    public static void main( String[] args ){


        // TIPOS DE DATOS PRIMITIVOS

        byte a = 10; // 8-bit entero desde -128 a 127 (valor por defecto es cero)
        short b = 2; // 16-bit entero desde -32,768 a 32,767 (valor por defecto es cero)
        int c = 200; // 32-bit entero desde - 2,147,483,648 (-2^31) a 2,147,483,647(inclusive) (2^31 -1) (valor por defecto es cero)
        long d = 12345678910L; // 64-bit entero desde -9,223,372,036,854,775,808(-2^63) a 9,223,372,036,854,775,807 (inclusive)(2^63 -1) (valor por defecto es 0L)
        float e = 0.25f; // Precisión simple 32-bit (valor por defecto es 0.0f)
        double f = 32.123456d; // Precisión simple 64-bit (valor por defecto es 0.0d)
        boolean g = true; // true, false
        char h = 'A'; // 16-bit caracter unicode desde '\u0000' (or 0) a '\uffff' (or 65,535 inclusive)
        
        // TIPOS CADENAS DE CARACTERES

        String micadena = "Cadena de caracteres";
        System.out.println(micadena);

        // Concatanar caracteres

        String minombre = "Alvaro";
        String miapellido = "Fuentes";
        String nombrecompleto = "Mi nomnbre es " + minombre + " y mi apellido es " + miapellido;
        System.out.println(nombrecompleto);

        /* Secuencias de escape  

        \n	Linea nueva (0x0a)
        \r	Retorno de carro (0x0d)
        \f	Alimentación de formulario (0x0c)
        \b	Retroceso (0x08)
        \s	Espacio (0x20)
        \t	Tabulación
        \"	Comilla doble
        \'	Comilla simple
        \\	Backslash

        */

    }    
}
