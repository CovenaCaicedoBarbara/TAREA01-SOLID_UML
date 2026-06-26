package FABRICA;

import productos.ComponenteReseña;
import productos.ComponenteReserva;
import productos.WebReserva;
import productos.WebReseña;

public class WebUIFactory implements AppUIFactory {
    @Override
    public ComponenteReseña crearComponenteReseña(){
        return new WebReseña();
    }
    @Override
    public ComponenteReserva crearComponenteReserva(){
        return new WebReserva();
    }
}
