package usuarios;
import java.util.ArrayList;
import java.util.List;
import propiedades.Propiedad;
import propiedades.Unidad;
import estados.EstadoUnidad;
import incidentes.Incidente;
import reservas.Reserva;
public class Anfitrion extends Usuario {

    private List<Propiedad> propiedades;

    public Anfitrion(String id, String nombre, String correo, String password) {
        super(id, nombre, correo, password);
        propiedades = new ArrayList<>();
    }

    public void registrarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);

        System.out.println(" registró una nueva propiedad.");
    }

    public void gestionarReglas(Propiedad propiedad, String reglas) {
        propiedad.setReglas(reglas);

        System.out.println("Reglas actualizadas.");
    }

    public void actualizarEstadoUnidad(Unidad unidad, EstadoUnidad estado) {
        unidad.cambiarEstado(estado);

        System.out.println("Estado de unidad actualizado.");
    }

    public void resolverIncidente(Incidente incidente) {
        System.out.println(nombre + " intenta resolver incidente.");
        incidente.resolver();
    }

    public void calificar(Reserva reserva, int puntuacion, String comentario) {
        System.out.println(nombre + " calificó al huésped.");
        System.out.println("Comentario: " + comentario);
    }
}
