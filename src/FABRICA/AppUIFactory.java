package FABRICA;

import productos.ComponenteReseña;
import productos.ComponenteReserva;

public interface AppUIFactory {
    ComponenteReseña crearComponenteReseña();
    ComponenteReserva crearComponenteReserva();
}
