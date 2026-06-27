package CLASES_SUELTAS;

abstract class ManejadorIncidente {
    protected ManejadorIncidente sigueinte;
    public void setSiguiente(ManejadorIncidente m){}
    public abstract void manejar(Incidente i);
}
