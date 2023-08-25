package Series;

import java.util.ArrayList;

public class Temporada {
    //Atributos
    private String nombreTemporada;
    private ArrayList<String> episodios = new ArrayList<>();

    //Constructor
    public Temporada(String nombre) {
        this.nombreTemporada = nombre;
    }

    //Metodos
    //Getters and Setters

    public String getNombre() {
        return nombreTemporada;
    }

    public void setNombre(String nombre) {
        this.nombreTemporada = nombre;
    }

    public Object getEpisodio() {
        return episodios;
    }

    public void setEpisodio(ArrayList<String> episodio) {
        this.episodios = episodio;
    }
    //Agregar episodios
    public void agregarEpisodio(String nombreEpisodio){
        episodios.add(nombreEpisodio);
    }

    //Calcular cantidad de episodios vistos
    public int calcularEpisodiosVistos(String nombre){
        return episodios.size();
    }
}
