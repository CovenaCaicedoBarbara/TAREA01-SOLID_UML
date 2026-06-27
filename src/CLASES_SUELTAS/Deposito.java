package CLASES_SUELTAS;

public class Deposito extends Pago{
    public Deposito(double monto) {
        super(monto);
    }
    @Override
    public void procesar() {
        System.out.println("procesando el deposito");
    }
}
