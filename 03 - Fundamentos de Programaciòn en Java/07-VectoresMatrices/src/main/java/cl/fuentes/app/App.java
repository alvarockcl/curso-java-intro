package cl.fuentes.app;

// java -cp target/07-VectoresMatrices-1.jar cl.fuentes.app.App

public class App 
{
    public static void main( String[] args ){
        
    // Ejemplos vectores
    
    int[] listaNumeros= {234,54,67,68,978,12};

    for(int i=0; i<listaNumeros.length; i++) {
        System.out.print(listaNumeros[i]);
        System.out.print("...");
        System.out.println(listaNumeros[i]+i);
    }

    final int TAMANO = 26;
    char[] listaLetras = new char[TAMANO];
    char letra = 'A';
 
    for(int i=0; i<TAMANO; i++) {
        listaLetras[i] = letra;
        letra++;
    }
 
    for(int i=0; i<TAMANO; i++) {
        System.out.print(listaLetras[i]+" ");
    }

    int[] edades = {26,73,84,52,76,72,37,67,62,73};
 
    System.out.println(edades[0]);

    System.out.println(edades[edades.length-1]);

    edades[2] = 48;
    System.out.println(edades[2]);

    for(int i=0; i<edades.length; i++) {
        System.out.print(edades[i]+" ");
    }
    
    System.out.println();

    for(int edad:edades) {
        System.out.print(edad+" ");
    }
    System.out.println();

    int[] apuesta = {22,28,3,13,40,7};
    int aciertos, bola, apuestas=0;
  
    do {
      aciertos = 0;
      apuestas++;
      for(int i=0;i<6;i++) {
        bola = (int)(Math.random()*49)+1;
        for(int j=0;j<6;j++)
        {
          if(bola==apuesta[j])
            aciertos++;
        }
      }
    } while(aciertos<6);
    System.out.println("Apuestas realizadas: "+apuestas);

	

    // Ejemplos matrices

    final int FILAS = 3;
    final int COLUMNAS = 5;
    char[][] letras = new char[FILAS][COLUMNAS];
    char letraQueToca = 'A';

    for(int f=0; f<FILAS; f++) {
        for(int c=0; c<COLUMNAS; c++) {
            letras[f][c] = letraQueToca;
            letraQueToca++;
        }
    }

    for(int f=0; f<FILAS; f++) {
        for(int c=0; c<COLUMNAS; c++) {
            System.out.print(letras[f][c]+" ");
        }
        System.out.println();
    }

    final int TAM = 5;
        char[][] triangulo = new char[TAM][TAM];
 
        for(int f=0; f<TAM; f++) {
            for(int c=0; c<f; c++)
                triangulo[f][c] = ' ';
            for(int c=f; c<TAM; c++)
                triangulo[f][c] = '*';
        }
 
        for(int f=0; f<TAM; f++) {
            for(int c=0; c<TAM; c++)
                System.out.print(triangulo[f][c]);
            System.out.println();
        }

    }
}
