/*
 En java, realizar lo siguiente. Dado el siguiente modelo, implementar según la consigna.

Cine:
-nombre:String
-direccion: String
-proyecciones: ArrayList<Pelicula>
+Cine(nombre, direccion)
+agregarPelicula(Pelicula):void
+listarTodo():void
+listarDuranMas(horas):void
+listarMenorDuracionAMayor():void
+listarOrdenadasPorTituloAZ():void
+listarOrdenadasPorDirectorAZ():void
----------------------------------------
Pelicula:
-titulo:String
-director:String
-duracion:int
+Pelicula(titulo,director,duracion)
+getter y setters
----------------------------------------
Test:
+static main(String arg[]): void

Descripción de los métodos de la clase Cine:
agregarPelicula(Pelicula):void  Recibe una Película y la agrega a la lista que posee el Cine.
listarTodo():void  Muestra por consola todas las Películas registradas en el Cine.
listarDuranMas(horas):void  Reciba una cantidad de horas y muestra por consola todas las
películas que tengan una duración mayor a la recibida por parámetro.
listarMenorDuracionAMayorDuracion():void  Lista las Películas ordenadas de menor a
mayor.
listarOrdenadasPorTituloAZ():void  Lista las Películas ordenadas alfabéticamente por el
título.
listarOrdenadasPorDirectorAZ():void  Lista las Películas ordenadas alfabéticamente por el
director.

Desde el método main de una clase Test, se pide:
 Crear el Cine ROMA SRL, ubicado en Rivadavia 325.
 Definir un bucle que crea un objeto Película pidiéndole al usuario todos sus datos y
guardándolos en el objeto Película. Después, esa Película se guarda en el Cine usado su
método agregarPelicula y se le pregunta al usuario si quiere crear otra Película o no.
 Pedir al Cine que liste las películas que duren más de x cantidad de horas que el usuario
ingresará por teclado.
 Pedir al cine que liste todas las películas.
 Pedir al cine que liste las películas ordenadas por título.
 Pedir al cine que liste las películas ordenadas por director.
 Pedir al cine que liste las películas ordenadas por duración.

 */
package guia5.pkg2ejer1;

import java.util.Scanner;

public class Guia52Ejer1 {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        // Crear el cine
        Cine cine = new Cine("ROMA SRL", "Rivadavia 325");
        
        // Pedir al usuario que cree películas
        boolean crearOtraPelicula = true;
        while (crearOtraPelicula) {
            System.out.println("Ingrese los datos de la película:");
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Director: ");
            String director = scanner.nextLine();
            System.out.print("Duración (en horas): ");
            int duracion = Integer.parseInt(scanner.nextLine());
            
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            cine.agregarPelicula(pelicula);
            
            System.out.print("¿Desea crear otra película? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                crearOtraPelicula = false;
            }
    }
     
        
        
        // Pedir al Cine que liste las películas que duren más de x cantidad de horas
        System.out.print("Ingrese la cantidad de horas mínima: ");
        int horasMinimas = Integer.parseInt(scanner.nextLine());
        cine.listarDuranMas(horasMinimas);
        
        // Pedir al cine que liste todas las películas
        cine.listarTodo();
        
        // Pedir al cine que liste las películas ordenadas por título
        cine.listarOrdenadasPorTituloAZ();
        
        // Pedir al cine que liste las películas ordenadas por director
        cine.listarOrdenadasPorDirectorAZ();
        
        // Pedir al cine que liste las películas ordenadas por duración
        cine.listarMenorDuracionAMayor();
        
        scanner.close();
}
}
