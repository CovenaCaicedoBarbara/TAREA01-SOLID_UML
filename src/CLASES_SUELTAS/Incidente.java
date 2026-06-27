package CLASES_SUELTAS;
import USUARIOS.Huesped;
import java.util.Date;
public class Incidente {
    private Huesped huesped;
    private Unidad unidad;
    private Reserva reserva;
    private String descripcion;
    private Date fecha;
    private String estado;

    public Incidente(Huesped h, Unidad u, String descripcion) {
        this.huesped = h;
        this.unidad = u;
        this.descripcion = descripcion;
        this.fecha = new Date();
        this.estado = "Pendiente";

    }
    public Huesped getHuesped() {
        return huesped;
    }
    public Unidad getUnidad() {
        return unidad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String estado) {
        this.estado = estado;
    }
    public Date getFecha() {
        return fecha;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
