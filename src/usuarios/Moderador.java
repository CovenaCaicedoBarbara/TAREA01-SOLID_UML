package USUARIOS;

import CLASES_SUELTAS.ModeradorHandler;

public class Moderador extends SoporteLegal{

    private ModeradorHandler moderadorhandler;

    public Moderador(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }
}
