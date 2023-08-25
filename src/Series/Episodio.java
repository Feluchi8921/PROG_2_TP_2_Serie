package Series;

public class Episodio {

    //Atributos
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int calificacion;

    //Constructor

    public Episodio(String titulo, String descripcion, boolean flag, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.flag = flag;
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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    //Calificar episodio
    public void ingresarCalificacion(int calificacion){
        if(calificacion<0 || (calificacion>=1 && calificacion<=5)){
            setCalificacion(calificacion);//preguntar si lo paso como cte
        }
        else{
            System.out.println("La calificación ingresada es incorrecta. Por favor vuelva a ingresarla");
        }
    }


}
