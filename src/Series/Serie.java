package Series;

import java.util.ArrayList;

public class Serie {
    //Atributos
    private String nombreSerie;
    private ArrayList<Temporada> temporadas = new ArrayList<>();

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

    public ArrayList<Temporada> getTemporada() {
        return temporadas;
    }


    //Agregar temporada
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    //Calcular temporadas vistas
    public int calcularEpisodiosVistos() {
        int suma = 0;
        //Necesito saber las temporadas de la serie
        //Recorro el arraylist temporadas
        for (int i = 0; i < temporadas.size(); i++) {
            suma += temporadas.get(i).calcularEpisodiosVistos();
        }
        return suma;
    }

    public double calcularPromedioCalifSerie() {
        int suma = 0;
        int cantTemporadas = temporadas.size();
        //recorro el arrayList de episodios
//        for (int i = 0; i < temporadas.size(); i++) {
//            suma += temporadas.get(i).calcularPromedioCalifTemp();
//        }
        //Uso foreach
        for(Temporada t : temporadas){
            suma+=t.calcularPromedioCalifTemp();
        }
        return suma / cantTemporadas;
    }
}

