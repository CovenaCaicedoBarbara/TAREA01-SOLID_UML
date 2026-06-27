package COMPOSITIVE;

public class Disponible implements EstadoUnidad{
    @Override
    public String estado(Unidad u) {
        return "disponible";

    }
}
