package Series;

import java.util.ArrayList;

public class Temporada {
    //Atributos
    private String nombreTemporada;
    private ArrayList<Episodio> episodios = new ArrayList<>();

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

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    //Agregar episodios
    public void agregarEpisodio(Episodio episodio){
        episodios.add(episodio);
    }

    //Calcular cantidad de episodios vistos
    public int calcularEpisodiosVistos(){
        int suma = 0;
        for (Episodio e : episodios){
            if (e.isFlag()){
                suma++;
            }
        }
        return suma;
    }
}
