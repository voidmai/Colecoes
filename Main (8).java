public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("123456", "Autor A", "Editora X", "Título 1");
        Livro livro2 = new Livro("654321", "Autor B", "Editora Y", "Título 2");
        Livro livro3 = new Livro("789123", "Autor C", "Editora Z", "Título 3");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println("\nLista de livros:");
        biblioteca.imprimirLivros();

        System.out.println("\nVerificando se livro1 existe: " + biblioteca.verificarLivro(livro1));
        System.out.println("Obtendo livro1: " + biblioteca.obterLivro(livro1));

        biblioteca.removerLivro(livro2);
        System.out.println("\nLista de livros após remoção:");
        biblioteca.imprimirLivros();

        System.out.println("\nA lista está vazia? " + biblioteca.listaVazia());
    }
}
