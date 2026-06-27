package USUARIOS;

abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String correo;
public Usuario (String id,String nombre,String correo){
    this.nombre= nombre;
    this.id=id;
    this.correo=correo;
}

    public String getId(){
        return id;
    }
    public String nombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public void iniciarSesion(){
        System.out.println("iniciando sesion");

    }
}
