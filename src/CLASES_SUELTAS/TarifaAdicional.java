package CLASES_SUELTAS;

public class TarifaAdicional extends Pago{
    public TarifaAdicional(double monto) {
        super(monto);
    }

    @Override
    public void procesar() {
        System.out.println("procesando el pago con tarifa adicional");
    }

}
