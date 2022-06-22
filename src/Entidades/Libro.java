package Entidades;
public class Libro {
   //ATRIBUTOS
   public String autor;
   public String titulo;
   public String ISBN;
   public String numero_de_pag;
   //CONSTRUCTOR VACIO
   public Libro() {
    }
   //CONSTRUCTOR X PARAMETROS
   public Libro(String autor, String titulo, String ISBN, String numero_de_pag) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.numero_de_pag = numero_de_pag;
    }
    
   //GETTER & SETTER
   public String getAutor() {
        return autor;
    }

   public void setAutor(String autor) {
        this.autor = autor;
    }

   public String getTitulo() {
        return titulo;
    }

   public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   public String getISBN() {
        return ISBN;
    }

   public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

   public String getNumero_de_pag() {
        return numero_de_pag;
    }

   public void setNumero_de_pag(String numero_de_pag) {
        this.numero_de_pag = numero_de_pag;
    }

   @Override
   public String toString() {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", ISBN=" + ISBN + ", numero_de_pag=" + numero_de_pag + '}';
    }
}
