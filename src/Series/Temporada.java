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

    //Calcular cantidad de episodios vistos de una temporada
    public int calcularEpisodiosVistos(){
        int suma = 0;
        for (Episodio e : episodios){
            if (e.episodioVisto()){
                suma++;
            }
        }
        return suma;
    }

    //Calcular el promedio de las calificaciones dadas para una temporada particular
    public double calcularPromedioCalifTemp(){
        int suma=0;
        int cantEpisodios=episodios.size();
        //recorro el arrayList de episodios
        for (int i = 0; i < episodios.size(); i++) {
            suma+=episodios.get(i).getCalificacion();
                    }
        return suma/cantEpisodios;
    }
}
