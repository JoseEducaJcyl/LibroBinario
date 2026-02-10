import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("1984", "George Orwell", 1949));
        libros.add(new Libro("Don Quijote", "Miguel de Cervantes", 1605));
        libros.add(new Libro("El principito", "Antoine de Saint-Exupéry", 1943));
        Escritor escritor;
        Lector lector;
        escritor = new Escritor();
        lector = new Lector();
        escritor.guardarLibro(libros,"libros.cosa");

        lector.leerLibro("libros.cosa");
    }
}