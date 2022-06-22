package LibroServicio;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicio {
     
    //INSTANCIAR UN OBJ DE TIPO LIBRO
    Libro v1 = new Libro();
    
    //LLENO LOS ATRIBUTOS
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    //CREACIÓN DE MÉTODOS
    public Libro crear(){
    System.out.println("Ingrese el título del libro");
    v1.setTitulo(leer.next());

    System.out.println("Ingrese el autor");
    v1.setAutor(leer.next());

    System.out.println("Escribir el número de páginas");
    v1.setNumero_de_pag(leer.next());

    System.out.println("Escribir el código ISBN");
    v1.setISBN(leer.next());

    return v1;
    
    }
}

