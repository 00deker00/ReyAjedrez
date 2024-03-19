package org.iesalandalus.programacion.reyajedrez;

public enum Color {

    BLANCO("Blanco"),
    NEGRO("Negro");

    Private final String cadenaAMostrar;

    private Color (String cadenaAMostrar){
        this.cadenaAMostrar = cadenaAMostrar;
    }


    @Override
    public String toString() {
        return cadenaAMostrar;
    }
}
