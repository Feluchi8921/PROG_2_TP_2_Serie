package Series;

public class Main {
    public static void main(String[]args){

        //Creo el objeto episodio
        Episodio episodio = new Episodio("La noche oscura",
                "Dos niñas se pierden en la noche", true, 5);
        //Creo el objeto temporada
        Temporada temporada = new Temporada("Temporada 1", episodio);
        //creo el objeto serie
        Serie serie = new Serie("Dark", temporada);

    }
}
