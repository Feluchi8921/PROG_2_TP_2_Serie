package Series;

public class Main {
    public static void main(String[]args){

        //Creo el objeto episodio
        Episodio episodio1 = new Episodio("La noche oscura",
                "Dos niñas se pierden en la noche", true, 5);
        Episodio episodio2 = new Episodio("Dalmata",
                "Una bruja con perros", true, 4);

        //Creo el objeto temporada
        Temporada temporada1 = new Temporada("Temporada 1");
        Temporada temporada2 = new Temporada("Temporada 2");
        //creo el objeto serie
        Serie serie = new Serie("Dark");

        //Agregar episodios a la temporada
        temporada1.agregarEpisodio(episodio1);
        temporada1.agregarEpisodio(episodio2);

        //Agregar temporadas a la serie
        serie.agregarTemporada(temporada1);
        serie.agregarTemporada(temporada2);




        //Calificar pelicula
        System.out.println(episodio1.ingresarCalificacion(2)? "Se ha calificado correctamente. Calificacion="+episodio1.getCalificacion():
                "La calificacion ingresada es incorrecta.");


        //Imprimir la cantidad de episodios de una temporada
        System.out.println("La temporada tiene "+temporada1.calcularEpisodiosVistos() +" episodios");

    }
}
