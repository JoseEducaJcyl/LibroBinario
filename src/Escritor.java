import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritor {
    //Metodo guardarLibro, se le pasa una List de libros y un String con la ruta y nombre del archivo 
    public void guardarLibro(List<Libro> libros, String ruta) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oos.writeObject(libros);
            System.out.println("Objeto Libro serializado y guardado en libros.cosa");
        } catch (IOException e) {
            System.out.println("Error al guardar el objeto: " + e.getMessage());
        }
    }
}
