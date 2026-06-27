package COMPOSITIVE;

import java.util.ArrayList;

import CLASES_SUELTAS.Reserva;

public class Unidad implements CompPropiedad{
   private ArrayList<Reserva> reservadas = new ArrayList<>();
    private String tipo;
    private double Precio;
    private EstadoUnidad estado;

    @Override
    public void operacion() {

    }

    public void cambiarEstado(EstadoUnidad nuevoEstado){}
}
