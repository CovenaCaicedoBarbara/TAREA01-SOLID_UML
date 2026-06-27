package CLASES_SUELTAS;

import java.util.ArrayList;
import java.util.Date;

import COMPOSITIVE.Reservado;
import COMPOSITIVE.Unidad;
import USUARIOS.Huesped;

public class Reserva {
    private ArrayList<Resena> listResenas= new ArrayList<>();
    private ArrayList<Incidente>listInci =new ArrayList<>();
    private ArrayList <Pago> listpagos= new ArrayList<>();
    private Huesped hues;
    private Unidad unidad;
    private Date FechaInicio;
    private Date Fechafin;
    private String estado;

    public double calcularTotal(){
        return 0.0;
    }



}
