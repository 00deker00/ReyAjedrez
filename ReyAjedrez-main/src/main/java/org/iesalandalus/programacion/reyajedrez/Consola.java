package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

    private Consola(){

    }

    public static void mostrarMenu(){
        System.out.println("OPCIONES DEL MENÚ:");
        System.out.println("1. Crear rey por defecto.");
        System.out.println("2. Crear rey eligiendo el color.");
        System.out.println("3. Mover.");
        System.out.println("4. Salir.");

    }

    public static int elegirOpcionMenu(){
        int OpcionEscogida;
        do {
            System.out.println("Elige una opción");
            OpcionEscogida = Entrada.entero();
        } while (OpcionEscogida < 1 || OpcionEscogida > 4);
        return OpcionEscogida;

    }

    public static Color elegirColor(){
        int ColorEscogido;
        do{
            System.out.println("Elige un color: ");
            System.out.println("1. Blanco. ");
            System.out.println("2. Negro. ");
            ColorEscogido = Entrada.entero();
        }while (ColorEscogido < 1 || ColorEscogido > 2);

        if (ColorEscogido == 1)
            return Color.BLANCO;
        else {
            return Color.NEGRO;
        }
    }

    public void mostrarMenuDirecciones(){
        System.out.println("Elige un movimiento: ");

        System.out.println("1. NORTE.");
        System.out.println("2. NORESTE.");
        System.out.println("3. ESTE.");
        System.out.println("4. SURESTE.");
        System.out.println("5. SUR.");
        System.out.println("6. SUROESTE.");
        System.out.println("7. OESTE.");
        System.out.println("8. NOROESTE.");
        System.out.println("9. ENROQUE LARGO.");
        System.out.println("10. ENROQUE CORTO.");
    }


    public static Direccion elegirDireccion(){
        int direccion;
        do{
            System.out.println("Elige una dirección: ");
            direccion = Entrada.entero();
        }while(direccion < 1 || direccion > 10);


        switch (direccion){
            case 1:
                return Direccion.NORTE;
            case 2:
                return Direccion.NORESTE;
            case 3:
                return Direccion.ESTE;
            case 4:
                return Direccion.SURESTE;
            case 5:
                return Direccion.SUR;
            case 6:
                return Direccion.SUROESTE;
            case 7:
                return Direccion.OESTE;
            case 8:
                return Direccion.NOROESTE;
            case 9:
                return Direccion.ENROQUE_CORTO;
            case 10:
                return Direccion.ENROQUE_LARGO;
        }return null;
    }


    public static void despedirse(){
        System.out.println("Saliendo de la aplicación. ");
        System.exit(0);
    }







}
