package Series;

import java.util.ArrayList;

public class Serie {
    //Atributos
    private String nombreSerie;
    private ArrayList<String> temporadas = new ArrayList<>() ;

    //Constructor

    public Serie(String nombre) {
        this.nombreSerie = nombre;
    }


    //Metodos
    //Getters and Setters

    public String getNombre() {
        return nombreSerie;
    }

    public void setNombre(String nombre) {
        this.nombreSerie = nombre;
    }

    public Object getTemporada() {
        return temporadas;
    }

    public void setTemporada(ArrayList<String> temporada) {
        this.temporadas = temporada;
    }

    //Agregar temporada
    public void agregarTemporada(String nombreTemporada){
        temporadas.add(nombreTemporada);
    }
}
