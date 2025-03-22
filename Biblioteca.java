
import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (!livros.contains(livro)) {
            livros.add(livro);
            System.out.println("Livro adicionado: " + livro);
        } else {
            System.out.println("Livro já existe na coleção.");
        }
    }

    public void removerLivro(Livro livro) {
        if (livros.remove(livro)) {
            System.out.println("Livro removido: " + livro);
        } else {
            System.out.println("Livro não encontrado na coleção.");
        }
    }

    public void imprimirLivros() {
        if (livros.isEmpty()) {
            System.out.println("A coleção de livros está vazia.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public boolean verificarLivro(Livro livro) {
        return livros.contains(livro);
    }

    public Livro obterLivro(Livro livro) {
        int index = livros.indexOf(livro);
        if (index != -1) {
            return livros.get(index);
        }
        return null;
    }

    public boolean listaVazia() {
        return livros.isEmpty();
    }
}
