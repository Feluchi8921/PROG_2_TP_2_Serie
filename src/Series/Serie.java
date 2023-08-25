package Series;

public class Serie {
    //Atributos
    private String nombre;
    private Object temporada;

    //Constructor

    public Serie(String nombre, Object temporada) {
        this.nombre = nombre;
        this.temporada = temporada;
    }


    //Metodos
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getTemporada() {
        return temporada;
    }

    public void setTemporada(Object temporada) {
        this.temporada = temporada;
    }
}
