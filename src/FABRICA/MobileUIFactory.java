package FABRICA;

import productos.ComponenteReseña;
import productos.ComponenteReserva;
import productos.MobileReserva;
import productos.MobileReseña;

public abstract class MobileUIFactory implements AppUIFactory {
    @Override
    public ComponenteReseña crearComponenteReseña(){
        return new MobileReseña();
    }
    @Override
    public ComponenteReserva crearComponenteReserva(){
        return new MobileReserva();
    }


}

