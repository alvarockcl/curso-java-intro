package cl.fuentes.app;

public class App 
{
    public static void main( String[] args ){

        // FOR
        for(int x = 0  ; x <= 20 ; x++ ){
            System.out.print("Valor de x : " + x );
            System.out.print("\n");
        }

        // WHILE
        int y = 10;
        while(y < 20){
            System.out.print("Valor de y : " + y );
            y++;
            System.out.print("\n");
        }

        // DO WHILE
        int z = 10;
        do {
            System.out.print("Valor de z : " + z );
            z++;
            System.out.print("\n");
        }while( z < 20 );

    }    
}
