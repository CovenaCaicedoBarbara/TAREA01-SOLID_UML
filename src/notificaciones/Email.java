package notificaciones;
public class Email implements Canal {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}
