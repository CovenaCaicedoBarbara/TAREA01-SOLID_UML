package COMPOSITIVE;

public class Reservado implements EstadoUnidad{
    @Override
    public String estado(Unidad u) {
        return "reservado";
    }

}
