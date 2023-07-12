
package guia5.pkg2ejer1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cine {
    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.proyecciones = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        proyecciones.add(pelicula);
    }

    public void listarTodo() {
        System.out.println("Películas en el cine " + nombre + ":");
        for (Pelicula pelicula : proyecciones) {
            System.out.println(pelicula);
        }
    }

    public void listarDuranMas(int horas) {
        System.out.println("Películas con duración mayor a " + horas + " horas:");
        for (Pelicula pelicula : proyecciones) {
            if (pelicula.getDuracion() > horas) {
                System.out.println(pelicula);
            }
        }
    }

    public void listarMenorDuracionAMayor() {
        System.out.println("Películas ordenadas de menor a mayor duración:");
        Collections.sort(proyecciones, Comparator.comparingInt(Pelicula::getDuracion));
        for (Pelicula pelicula : proyecciones) {
            System.out.println(pelicula);
        }
    }

    public void listarOrdenadasPorTituloAZ() {
        System.out.println("Películas ordenadas alfabéticamente por título:");
        Collections.sort(proyecciones, Comparator.comparing(Pelicula::getTitulo));
        for (Pelicula pelicula : proyecciones) {
            System.out.println(pelicula);
        }
    }

    public void listarOrdenadasPorDirectorAZ() {
        System.out.println("Películas ordenadas alfabéticamente por director:");
        Collections.sort(proyecciones, Comparator.comparing(Pelicula::getDirector));
        for (Pelicula pelicula : proyecciones) {
            System.out.println(pelicula);
        }
    }
}
