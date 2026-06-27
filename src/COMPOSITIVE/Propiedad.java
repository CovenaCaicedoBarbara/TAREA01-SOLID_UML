package COMPOSITIVE;

import java.util.ArrayList;

public class Propiedad implements CompPropiedad{

   String tipo;
   double precio;
   EstadoUnidad estado;
   ArrayList<CompPropiedad> children= new ArrayList<>();
    public Propiedad(String tipo, double precio, EstadoUnidad estado) {
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public void añadirUnidad(CompPropiedad unidad) {
        children.add(unidad);
    }
    public ArrayList<CompPropiedad> getChildren() {
        return children;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Propiedad con " + children.size() + " elementos.");
        for (CompPropiedad c : children) {
            c.mostrarInfo();
        }
    }

    @Override
    public void aplicarReglas(String reglas) {
        System.out.println("Reglas aplicadas a la propiedad.");
        for (CompPropiedad c : children) {
            c.aplicarReglas(reglas);
        }
    }


}
