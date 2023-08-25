package Series;

public class Main {
    public static void main(String[]args){

        //Creo el objeto episodio
        Episodio episodio1 = new Episodio("La noche oscura",
                "Dos niñas se pierden en la noche", true, 5);
        Episodio episodio2 = new Episodio("Dalmata",
                "Una bruja con perros", true, 4);

        //Creo el objeto temporada
        Temporada temporada = new Temporada("Temporada 1");

        //creo el objeto serie
        Serie serie = new Serie("Dark");

        //Agregar temporadas a la serie
        serie.agregarTemporada("Temporada 1");
        serie.agregarTemporada("Temporada 2");

        //Agregar episodios a la temporada
        temporada.agregarEpisodio("Episodio 1");
        temporada.agregarEpisodio("Episodio 2");
        temporada.agregarEpisodio("Episodio 3");

        //Imprimir la cantidad de episodios de una temporada
        System.out.println(temporada.calcularEpisodiosVistos("Dark"));

    }
}
