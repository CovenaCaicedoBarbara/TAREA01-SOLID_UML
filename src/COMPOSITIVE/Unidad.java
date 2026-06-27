package COMPOSITIVE;

import java.util.ArrayList;

import CLASES_SUELTAS.Reserva;

public class Unidad implements CompPropiedad{
   private ArrayList<Reserva> reservadas = new ArrayList<>();
    private String tipo;
    private double precio;
    private EstadoUnidad estado;

    public Unidad(String tipo, double precio, EstadoUnidad estado) {
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public void cambiarEstado(EstadoUnidad estado) {
        this.estado = estado;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Unidad tipo: " + tipo + ", precio: " + precio + ", estado: " + estado);
    }

    @Override
    public void aplicarReglas(String reglas) {
        System.out.println("Reglas aplicadas a la unidad: " + reglas);
    }
}

