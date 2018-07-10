package cl.fuentes.app;

import java.lang.Character;

public class App 
{
    public static void main( String[] args ){

        // IF
        int x = 10;

        if(x < 20){
            System.out.println("El valor de x es menor que 20");
        }

        System.out.println("---------------------------------------------------");

        // IF ELSE
        int y = 30;
        if( y < 20){
            System.out.println("El valor de y es menor que 20");
        }else{
            System.out.println("El valor de y es menor o igual que 20");
        }

        System.out.println("---------------------------------------------------");

        // SWITCH
        char calificacion = 'B';
        switch(calificacion){
            case 'E':
                System.out.println("Excelente");
            break;
            case 'B':
                System.out.println("Bueno");
            break;
            case 'P':
            case 'S':
                System.out.println("Suficiente");
            break;            
            case 'i':
                System.out.println("Insuficiente");
            break;                        
            default:
                System.out.println("Requiere una calificacion valida");
        }
        System.out.println("Su calificacion es : " + calificacion);
    }    
}
