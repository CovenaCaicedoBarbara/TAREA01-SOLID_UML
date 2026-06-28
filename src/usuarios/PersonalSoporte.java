package USUARIOS;

abstract class PersonalSoporte extends Usuario{
    public PersonalSoporte(String id, String nombre, String correo) {
        super(id, nombre, correo);
    }
    public void procesarIncidente(){
        System.out.println("incidente procesado por soporte");
    }

}
