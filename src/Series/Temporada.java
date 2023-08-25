package Series;

public class Temporada {
    //Atributos
    private String nombre;
    private Object episodio;

    //Constructor
    public Temporada(String nombre, Object episodio) {
        this.nombre = nombre;
        this.episodio = episodio;
    }

    //Metodos
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Object episodio) {
        this.episodio = episodio;
    }
}
