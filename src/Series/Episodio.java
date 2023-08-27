package Series;

public class Episodio {

    //Atributos
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;
    private static final int LIMITCERO = 0;
    private static final int MINVAL = 1;
    private static final int MAXVAL = 5;


    //Constructor

    public Episodio(String titulo, String descripcion, boolean visto, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = visto;
        this.calificacion = calificacion;
    }

    //Metodos
    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean episodioVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    //Calificar episodio
    public boolean ingresarCalificacion(int calificacion) {
        if (calificacion < LIMITCERO || (calificacion >= MINVAL && calificacion <= MAXVAL)) {
            setCalificacion(calificacion);//preguntar si lo paso como cte
            return true;
        } else {
            return false;
        }
    }

}
