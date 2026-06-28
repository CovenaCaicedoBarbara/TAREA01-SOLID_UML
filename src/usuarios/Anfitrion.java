package USUARIOS;

import java.util.ArrayList;

import COMPOSITIVE.CompPropiedad;
import COMPOSITIVE.Propiedad;
import CLASES_SUELTAS.Reserva;

public class Anfitrion extends Usuario{

    private ArrayList<CompPropiedad>listaPropiedades= new ArrayList<>();
    public Anfitrion(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }

    public void registrarPropiedad(Propiedad p){}
    public void gestionasPropiedad(Propiedad p){}
    public void calififcar(Reserva r,int calificacion, String com){

    }
}
