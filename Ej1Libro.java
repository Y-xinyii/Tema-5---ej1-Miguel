import java.util.Scanner;

class Libro {
    String titulo;
    String autor;
    int paginas;
    boolean prestado;
}

public class Ej1Libro {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "El Principito";
        libro1.autor = "Antoine de Saint-Exupéry";
        libro1.paginas = 96;
        libro1.prestado = false;

        Libro libro2 = new Libro();
        libro2.titulo = "Don Quijote";
        libro2.autor = "Miguel de Cervantes";
        libro2.paginas = 1250;
        libro2.prestado = true;

        System.out.println(libro1.titulo + " - " + libro1.autor + " - " + libro1.paginas + " páginas - " + libro1.prestado);
        System.out.println(libro2.titulo + " - " + libro2.autor + " - " + libro2.paginas + " páginas - " + libro2.prestado);
    }
}
