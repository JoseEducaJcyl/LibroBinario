import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Lector {
    //Metodo leerLibro para crear el fichero binario, le se pasa un String 
    //con la ruta y nombre del archivo 
    public void leerLibro(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            List<Libro> libros = (List<Libro>) ois.readObject();
            for (Libro libro : libros) {
                System.out.println(libro.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el objeto: " + e.getMessage());
        }
    }
}
