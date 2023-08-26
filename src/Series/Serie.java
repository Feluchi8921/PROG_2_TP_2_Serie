package Series;

import java.util.ArrayList;

public class Serie {
    //Atributos
    private String nombreSerie;
    private ArrayList<Temporada> temporadas = new ArrayList<>() ;

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



    //Agregar temporada
    public void agregarTemporada(Temporada temporada){
        temporadas.add(temporada);
    }
}
