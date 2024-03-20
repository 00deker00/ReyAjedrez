package org.iesalandalus.programacion.reyajedrez;

import javax.naming.OperationNotSupportedException;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Rey() {
        setPosicion(new Posicion (1,'e'));
        setColor(Color.BLANCO);
        this.totalMovimientos=0;
    }

    public Rey(Color color){
        setColor(color);
        if (color == color.BLANCO){
            setPosicion(new Posicion (1, 'e'));
        }else{
            setPosicion(new Posicion (8, 'e'));
        }
        this.totalMovimientos=0;

    }
    //ESCRIBIR CUANDO NO SE PUEDE REALIZAR EL ENROQUE
    private void comprobarEnroque() throws OperationNotSupportedException{
        if (totalMovimientos !=0)
            throw new NullPointerException("El número de movimientos debe ser cero");
        if (getColor().equals(Color.BLANCO) && getPosicion().getFila() !=1 || getPosicion().getColumna() !='e')
            throw new OperationNotSupportedException("ERROR: No se puede realizar el enroque.");
        if (getColor().equals(Color.NEGRO) && getPosicion().getFila() !=8 || getPosicion().getColumna() !='e')
            throw new OperationNotSupportedException("ERROR: No se puede realizar el enroque.");

    }



    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null)
            throw new NullPointerException("ERROR: El color no puede ser nulo.");
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null)
            throw new NullPointerException("Posición no puede ser nula.");
        this.posicion = posicion;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    public void setTotalMovimientos(int totalMovimientos) {
        if (posicion == null)
            throw new NullPointerException("Total de movimientos no puede ser nulo.");
        this.totalMovimientos = totalMovimientos;
    }

    @Override
    public String toString() {
        return "Rey{" +
                "color=" + color +
                ", posicion=" + posicion +
                '}';
    }

    public void mover (Direccion direccion) throws OperationNotSupportedException{
        if (direccion == null)
            throw new NullPointerException("ERROR: La dirección no puede ser nula.");
        switch (direccion){
            case NORTE:
                setPosicion(new Posicion(getPosicion().getFila()+1 , getPosicion().getColumna()));
                break;
            case NORESTE:
                setPosicion(new Posicion(getPosicion().getFila()+1 , (char)(getPosicion().getColumna()+1)));
                break;
            case ESTE:
                setPosicion(new Posicion(getPosicion().getFila() , (char)(getPosicion().getColumna()+1)));
                break;
            case SURESTE:
                setPosicion(new Posicion(getPosicion().getFila() , (char)(getPosicion().getColumna()+1)));
                break;
            case SUR:
                setPosicion(new Posicion(getPosicion().getFila()-1 , getPosicion().getColumna()));
                break;
            case SUROESTE:
                setPosicion(new Posicion(getPosicion().getFila()-1 , (char)(getPosicion().getColumna()-1)));
                break;
            case OESTE:
                setPosicion(new Posicion(getPosicion().getFila() , (char)(getPosicion().getColumna()-1)));
                break;
            case NOROESTE:
                setPosicion(new Posicion(getPosicion().getFila()+1 , (char)(getPosicion().getColumna()-1)));
                break;
            case ENROQUE_CORTO:
                comprobarEnroque();
                setPosicion(new Posicion(getPosicion().getFila() , (char)(getPosicion().getColumna()+2)));
                break;
            case ENROQUE_LARGO:
                comprobarEnroque();
                setPosicion(new Posicion(getPosicion().getFila() , (char)(getPosicion().getColumna()-2)));
                break;
        }
        totalMovimientos++;
    }


}

