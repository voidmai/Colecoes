import java.util.ArrayList;
import java.util.Objects;

public class Livro {
    private String isbn;
    private String autor;
    private String editora;
    private String titulo;

    public Livro(String isbn, String autor, String editora, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return Objects.equals(isbn, livro.isbn);
    }

    public int hashCode() {
        return Objects.hash(isbn);
    }

    public String toString() {
        return "Livro{" +
                "ISBN='" + isbn + '\'' +
                ", Autor='" + autor + '\'' +
                ", Editora='" + editora + '\'' +
                ", Título='" + titulo + '\'' +
                '}';
    }
}
