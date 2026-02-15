import java.util.ArrayList;
import java.util.List;

public class Main {
    //Metodo main para ejecutar el codigo y llama las otras clases con sus repectivos metodos
    public static void main(String[] args) {
        //Declaramos una lista de guarda objetos de la clase Libro 
        List<Libro> libros = new ArrayList<>();
        //Le añadimos varios libros
        libros.add(new Libro("1984", "George Orwell", 1949));
        libros.add(new Libro("Don Quijote", "Miguel de Cervantes", 1605));
        libros.add(new Libro("El principito", "Antoine de Saint-Exupéry", 1943));
        //Llamada de las clases Escritos y Lector 
        Escritor escritor;
        Lector lector;
        escritor = new Escritor();
        lector = new Lector();
        escritor.guardarLibro(libros,"libros.cosa");

        lector.leerLibro("libros.cosa");
    }
}
