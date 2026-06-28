package USUARIOS;

import CLASES_SUELTAS.SoporteLegalHandler;

public class SoporteLegal extends PersonalSoporte{
    private SoporteLegalHandler soportelegalhandler;

    public SoporteLegal(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }
}
