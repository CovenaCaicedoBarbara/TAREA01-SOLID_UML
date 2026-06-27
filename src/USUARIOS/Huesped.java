package USUARIOS;
import CLASES_SUELTAS.CriteriosBusqueda;
import CLASES_SUELTAS.Propiedad;
import CLASES_SUELTAS.Unidad;
import CLASES_SUELTAS.Reserva;
import CLASES_SUELTAS.Incidente;

import java.util.ArrayList;
import java.util.Date;

public class Huesped extends Usuario{

    ArrayList<Incidente> incidentesReportados= new ArrayList<>();
    public Huesped(String id,String nombre,String correo){
        super(id,nombre,correo);
    }

    public ArrayList<Propiedad> buscaPropiedad(CriteriosBusqueda filtros){

        return
    }

    public Reserva realiszarReserva(Unidad u, Date[] fechas){
        return
    }
    public Incidente reportarIncidente(Unidad u, String descripcion) {
        Incidente nuevo = new Incidente(this, u, descripcion);
        incidentesReportados.add(nuevo);
        //BaseDeDatos.guardarIncidente(nuevo);
        return nuevo;
    }
    public void calificar( Reserva r, int Calificacion, String com){}

}
