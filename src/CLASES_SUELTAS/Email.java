package CLASES_SUELTAS;

public class Email implements Canal{
    @Override
    public void notificar() {
        System.out.println("Notificando por Emal");
    }
}
