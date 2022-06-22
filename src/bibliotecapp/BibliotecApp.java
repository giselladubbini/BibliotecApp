package bibliotecapp;

import LibroServicio.LibroServicio;

public class BibliotecApp {

    public static void main(String[] args) {
        
       LibroServicio v1 = new LibroServicio();
        System.out.println(v1.crear());
       
    }
}
